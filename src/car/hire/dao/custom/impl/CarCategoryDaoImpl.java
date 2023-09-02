/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.custom.CarCategoryDao;
import car.hire.entity.CarCategoryEntity;
import car.hire.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DELL i5
 */
public class CarCategoryDaoImpl implements CarCategoryDao {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public Integer addCarCategory(CarCategoryEntity categoryEntity) throws Exception {
        session.beginTransaction();
        Integer re = (Integer) session.save(categoryEntity);
        session.getTransaction().commit();
        return re;
    }

    @Override
    public ArrayList<CarCategoryEntity> getAllCarCategories() throws Exception {
        String hql = "FROM CarCategoryEntity";
        Query query = session.createQuery(hql);
        List<CarCategoryEntity> arrayList = query.list();
        return (ArrayList<CarCategoryEntity>) arrayList;
    }

    @Override
    public CarCategoryEntity getCarCategory(String id) throws Exception {
        String hql = "FROM CarCategoryEntity WHERE id = '" + id + "'";
        Query query = session.createQuery(hql);
        CarCategoryEntity entity = (CarCategoryEntity) query.uniqueResult();
        session.clear();
        return entity;
    }

    @Override
    public Integer updateCarCategory(CarCategoryEntity entity) throws Exception {
        Transaction transaction = session.beginTransaction();
        int updatedEntities = session.createQuery(
                "update CarCategoryEntity "
                + "set name = :newName "
                + "where id = :oldName")
                .setParameter("oldName", entity.getCategoryId())
                .setParameter("newName", entity.getName())
                .executeUpdate();
        transaction.commit();
        return updatedEntities;
    }

    @Override
    public String deleteCarCategory(CarCategoryEntity entity) throws Exception {
        Transaction transaction = session.beginTransaction();
        session.remove(entity);
        transaction.commit();
        return "Success";
    }

}
