/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.custom.UserDao;
import car.hire.entity.UserEntity;
import car.hire.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.Date;
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
    public ArrayList<Object[]> getAllUsers() throws Exception {
        Transaction transaction = session.beginTransaction();
        String sql = "SELECT * FROM user";
        Query query = session.createSQLQuery(sql);
        List<Object[]> arrayList = query.getResultList();
        transaction.commit();
        return (ArrayList<Object[]>) arrayList;
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
        String sql = "DELETE FROM user WHERE UserID = ?";
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
        String sql = "SELECT * FROM user WHERE (UserID = ?) AND (Password = ?) AND (UserName = ?)";
        Query query = session.createSQLQuery(sql);
        query.setParameter(1, userEntity.getUserId());
        query.setParameter(2, userEntity.getPassword());
        query.setParameter(3, userEntity.getUserName());

        List<UserEntity> entitys = query.list();

        if (!entitys.isEmpty()) {
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
        String sql = "UPDATE user SET UserTitle=?, Name=?, Address=?, NIC=?, `E-mail`=?, DOB=?, Phone_No=?, UserName=?, Password=? WHERE UserID=?";
        Query query = session.createSQLQuery(sql);
        query.setParameter(1, userEntity.getUTitle());
        query.setParameter(2, userEntity.getUname());
        query.setParameter(3, userEntity.getUAddress());
        query.setParameter(4, userEntity.getUNic());
        query.setParameter(5, userEntity.getEmail());
        query.setParameter(6, userEntity.getDob());
        query.setParameter(7, userEntity.getUPhoneNo());
        query.setParameter(8, userEntity.getUserName());
        query.setParameter(9, userEntity.getPassword());
        query.setParameter(10, userEntity.getUserId());

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
    public UserEntity getUserData(Integer userId) throws Exception {
        Transaction transaction = session.beginTransaction();
        String hql = "SELECT * FROM user WHERE UserID = " + userId;
        Query query = session.createSQLQuery(hql);
        List<Object[]> rows = query.list();
        transaction.commit();
        for (Object[] row : rows) {
            UserEntity entity = new UserEntity(
                    (Integer) row[0],
                    (String) row[1],
                    (String) row[2],
                    (String) row[3],
                    (String) row[4],
                    (String) row[5],
                    (Date) row[6],
                    (String) row[7],
                    (String) row[8],
                    (String) row[9]);
            return entity;
        }
        return null;
    }

    @Override
    public List<Object[]> login(String userName, String password) throws Exception {
        Transaction transaction = session.beginTransaction();
        String sql = "SELECT * FROM user WHERE UserName = '" + userName + "' AND Password = '" + password + "'";
        Query query = session.createSQLQuery(sql);
        List<Object[]> rows = query.list();
        transaction.commit();
        return rows;
    }

    @Override
    public UserEntity getUserID(String userName, String password) throws Exception {
        Transaction transaction = session.beginTransaction();
        String sql = "SELECT * FROM user WHERE UserName = '" + userName + "' AND Password = '" + password + "'";
        Query query = session.createSQLQuery(sql);
        List<Object[]> rows = query.list();
        transaction.commit();
        for (Object[] row : rows) {
            UserEntity entity = new UserEntity(
                    (Integer) row[0],
                    (String) row[1],
                    (String) row[2],
                    (String) row[3],
                    (String) row[4],
                    (String) row[5],
                    (Date) row[6],
                    (String) row[7],
                    (String) row[8],
                    (String) row[9]);
            return entity;
        }
        return null;
    }

}
