/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.custom.CarDao;
import car.hire.entity.CarCategoryEntity;
import car.hire.entity.CarEntity;
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
public class CarDaoImpl implements CarDao {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public ArrayList<CarEntity> getAllCars() throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CarEntity";
        Query query = session.createQuery(hql);
        List<CarEntity> arrayList = query.list();
        transaction.commit();
        return (ArrayList<CarEntity>) arrayList;
    }

    @Override
    public ArrayList<CarEntity> getRentedCars() throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CarEntity WHERE isAvailable = false";
        Query query = session.createQuery(hql);
        List<CarEntity> arrayList = query.list();
        transaction.commit();
        return (ArrayList<CarEntity>) arrayList;
    }

    @Override
    public ArrayList<CarEntity> getAvailableCars() throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CarEntity WHERE isAvailable = true";
        Query query = session.createQuery(hql);
        List<CarEntity> arrayList = query.list();
        transaction.commit();
        return (ArrayList<CarEntity>) arrayList;
    }

    @Override
    public String deleteCar(String carId) throws Exception {
        Transaction transaction = session.beginTransaction();
        CarEntity entity = getCarEntity(carId, session);
        session.remove(entity);
        transaction.commit();
        return "Success";
    }

    @Override
    public String addNewCar(CarEntity entity) throws Exception {
        Transaction transaction = session.beginTransaction();
        Integer result = (Integer) session.save(entity);
        transaction.commit();
        if (result > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }

    @Override
    public CarCategoryEntity getCarCategoryEntity(Integer categoryId) throws Exception {
        Session session1 = SessionFactoryConfiguration.getInstance().getSession();
        Transaction transaction = session1.beginTransaction();
        String hql = "FROM CarCategoryEntity WHERE categoryId = : categoryId";
        Query query = session1.createQuery(hql);
        query.setParameter("categoryId", categoryId);
        CarCategoryEntity cce = (CarCategoryEntity) query.uniqueResult();
        transaction.commit();
        session1.close();
        return cce;
    }

    public CarEntity getCarEntity(String carId, Session session1) throws Exception {
        String hql = "FROM CarEntity WHERE vehicleId = : carId";
        Query query = session1.createQuery(hql);
        query.setParameter("carId", Integer.parseInt(carId));
        CarEntity cce = (CarEntity) query.uniqueResult();
        return cce;
    }

    @Override
    public CarEntity getCarEntity(Integer carId) throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CarEntity WHERE vehicleId = : carId";
        Query query = session.createQuery(hql);
        query.setParameter("carId", carId);
        CarEntity cce = (CarEntity) query.uniqueResult();
        transaction.commit();
        session.clear();
        return cce;
    }

    @Override
    public String updateCar(CarEntity entity) throws Exception {

        Transaction transaction = session.beginTransaction();
        String sql = "UPDATE car SET Vehicle_No = '" + entity.getVehicleNumber() + "', Category_ID = '" + entity.getCarCategoryEntity().getCategoryId() + "', Model = '" + entity.getModel() + "', Brand = '" + entity.getBrand() + "', Year = '" + entity.getYear() + "', Colour = '" + entity.getColour() + "', Chassis_No = '" + entity.getChassisNo() + "', PricePerDay = '" + entity.getPricePerDay() + "' WHERE VehicleID = '" + entity.getVehicleId() + "'";
        SQLQuery sqlQuery = session.createSQLQuery(sql);
        sqlQuery.executeUpdate();
        transaction.commit();
        return "Success";
    }

}
