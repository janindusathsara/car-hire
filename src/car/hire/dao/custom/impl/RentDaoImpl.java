/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.custom.RentDao;
import car.hire.entity.CarEntity;
import car.hire.entity.CustomerEntity;
import car.hire.entity.RentEntity;
import car.hire.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author DELL i5
 */
public class RentDaoImpl implements RentDao {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public ArrayList<RentEntity> getAllRentals() throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM RentEntity";
        Query query = session.createQuery(hql);
        List<RentEntity> arrayList = query.list();
        transaction.commit();
        return (ArrayList<RentEntity>) arrayList;
    }

    @Override
    public ArrayList<RentEntity> getOverdueRentals() throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM RentEntity WHERE Is_Returned = false";
        Query query = session.createQuery(hql);
        List<RentEntity> arrayList = query.list();
        transaction.commit();
        return (ArrayList<RentEntity>) arrayList;
    }

    @Override
    public CustomerEntity searchCustomer(Integer custId) throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CustomerEntity WHERE isRented = false AND CustID = " + custId;
        Query query = session.createQuery(hql);
        CustomerEntity entity = (CustomerEntity) query.getSingleResult();
        transaction.commit();
        return entity;
    }

    @Override
    public CarEntity searchVehicle(Integer vehicleId) throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CarEntity WHERE isAvailable = true AND VehicleID = " + vehicleId;
        Query query = session.createQuery(hql);
        CarEntity entity = (CarEntity) query.getSingleResult();
        transaction.commit();
        return entity;
    }

    @Override
    public String newRent(RentEntity entity) throws Exception {
        Transaction transaction = session.beginTransaction();
        Integer result = (Integer) session.save(entity);

        if (result > 0) {

            Integer custId = entity.getCustomerEntity().getCustId();
            String sql1 = "UPDATE customer SET isRented = true WHERE CustID = ?";
            SQLQuery query1 = session.createSQLQuery(sql1);
            query1.setParameter(1, custId);
            int i = query1.executeUpdate();

            if (i > 0) {

                Integer vehicleId = entity.getCar().getVehicleId();
                String sql2 = "UPDATE car SET isAvailable = false WHERE VehicleID = ?";
                SQLQuery query2 = session.createSQLQuery(sql2);
                query2.setParameter(1, vehicleId);
                int j = query2.executeUpdate();

                if (j > 0) {

                    transaction.commit();
                    return "Success";

                } else {
                    transaction.commit();
                    return "Fail";
                }

            } else {
                transaction.commit();
                return "Customer Save Error";
            }

        } else {
            transaction.rollback();
            return "Rent Save Error";
        }
    }

    @Override
    public ArrayList<RentEntity> getOldRentals() throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM RentEntity WHERE Is_Returned = true";
        Query query = session.createQuery(hql);
        List<RentEntity> arrayList = query.list();
        transaction.commit();
        return (ArrayList<RentEntity>) arrayList;
    }

    @Override
    public RentEntity getRentData(Integer rentId) throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM RentEntity WHERE rentId = " + rentId;
        Query query = session.createQuery(hql);
        RentEntity entity = (RentEntity) query.getSingleResult();
        transaction.commit();
        return entity;
    }

    @Override
    public String returnCar(RentEntity entity) throws Exception {
        Transaction transaction = session.beginTransaction();
        String sql1 = "UPDATE customer SET isRented = false WHERE CustID = ?";
        SQLQuery query1 = session.createSQLQuery(sql1);
        query1.setParameter(1, entity.getCustomerEntity().getCustId());
        int i1 = query1.executeUpdate();

        if (i1 > 0) {

            String sql2 = "UPDATE car SET isAvailable = true WHERE VehicleID = ?";
            SQLQuery query2 = session.createSQLQuery(sql2);
            query2.setParameter(1, entity.getCar().getVehicleId());
            int i2 = query2.executeUpdate();
            session.clear();
            if (i2 > 0) {

                session.update(entity);
                transaction.commit();
                return "Success";

            } else {
                transaction.rollback();
                return "Car Update Error";
            }

        } else {
            transaction.rollback();
            return "Customer Update Error";
        }
    }
    
}
