/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.custom.UserDao;
import car.hire.entity.UserEntity;
import car.hire.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author DELL i5
 */
public class UserDaoImpl implements UserDao {

    Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public ArrayList<UserEntity> getAllUsers() throws Exception {
        Transaction transaction = session.beginTransaction();
        String sql = "SELECT * FROM user";
        Query query = session.createSQLQuery(sql);        
        List<UserEntity> arrayList = query.getResultList();

//        String hql = "FROM UserEntity";
//        Query query = session.createQuery(hql);
//        List<UserEntity> arrayList = query.list();
        transaction.commit();
        return (ArrayList<UserEntity>) arrayList;
    }

    @Override
    public String registerNewUser(UserEntity userEntity) throws Exception {
        Transaction transaction = session.beginTransaction();
        String sql = "INSERT INTO user VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Query query = session.createSQLQuery(sql);
        query.setParameter(1, userEntity.getUserId());
        query.setParameter(2, userEntity.getUTitle());
        query.setParameter(3, userEntity.getUname());
        query.setParameter(4, userEntity.getUAddress());
        query.setParameter(5, userEntity.getUNic());
        query.setParameter(6, userEntity.getEmail());
        query.setParameter(7, userEntity.getDob());
        query.setParameter(8, userEntity.getUPhoneNo());
        query.setParameter(9, userEntity.getUserName());
        query.setParameter(10, userEntity.getPassword());
        int i = query.executeUpdate();

        if (i >= 0) {
            transaction.commit();
            return "Success";
        } else {
            transaction.rollback();
            return "Fail";
        }

    }

    @Override
    public String deleteUser(Integer userId) throws Exception {
        Transaction transaction = session.beginTransaction();
        String sql = "DELETE user SET WHERE UserID = ?";
        Query query = session.createSQLQuery(sql);
        query.setParameter(1, userId);
        int i = query.executeUpdate();

        if (i >= 0) {
            transaction.commit();
            return "Success";
        } else {
            transaction.rollback();
            return "Fail";
        }
    }

    @Override
    public Boolean checkOldPassword(UserEntity userEntity) throws Exception {
        Transaction transaction = session.beginTransaction();
        String sql = "SELECT * FROM user WHERE (UserID = ?) AND (Password = ?)";
        Query query = session.createSQLQuery(sql);
        query.setParameter(1, userEntity.getUserId());
        query.setParameter(2, userEntity.getPassword());
        int i = query.executeUpdate();

        if (i >= 0) {
            transaction.commit();
            return true;
        } else {
            transaction.rollback();
            return false;
        }
    }

    @Override
    public String updateUser(UserEntity userEntity) throws Exception {
        Transaction transaction = session.beginTransaction();
        session.update(userEntity);
        transaction.commit();
        return "Success";
    }

}
