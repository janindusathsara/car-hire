/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.custom.CustomerDao;
import car.hire.entity.CustomerEntity;
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
public class CustomerDaoImpl implements CustomerDao {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public ArrayList<CustomerEntity> getRentedCustomers() throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CustomerEntity WHERE isRented = true";
        Query query = session.createQuery(hql);
        List<CustomerEntity> arrayList = query.list();
        transaction.commit();
        return (ArrayList<CustomerEntity>) arrayList;
    }

    @Override
    public ArrayList<CustomerEntity> getAllCustomers() throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CustomerEntity";
        Query query = session.createQuery(hql);
        List<CustomerEntity> arrayList = query.list();
        transaction.commit();
        return (ArrayList<CustomerEntity>) arrayList;
    }

    @Override
    public String addNewCustomer(CustomerEntity entity) throws Exception {
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
    public String deleteCustomer(Integer custId) throws Exception {
        Transaction transaction = session.beginTransaction();
        String sql = "DELETE FROM customer WHERE CustID = " + custId;
        SQLQuery query = session.createSQLQuery(sql);
        int i = query.executeUpdate();
        transaction.commit();
        return i >= 0 ? "Success" : "Fail";
    }

    @Override
    public CustomerEntity getCustomerEntity(Integer custId) throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "FROM CustomerEntity WHERE CustID = :custID";
        Query query = session.createQuery(hql);
        query.setParameter("custID", custId);
        CustomerEntity ce = (CustomerEntity) query.uniqueResult();
        transaction.commit();
        session.clear();
        return ce;
    }

    @Override
    public String updateCustomer(CustomerEntity entity) throws Exception {
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
        return "Success";
    }

}
