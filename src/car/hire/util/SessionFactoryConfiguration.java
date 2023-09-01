/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.util;

import car.hire.entity.CarCategoryEntity;
import car.hire.entity.CarEntity;
import car.hire.entity.CustomerEntity;
import car.hire.entity.RentEntity;
import car.hire.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author DELL i5
 */
public class SessionFactoryConfiguration {

    private static SessionFactoryConfiguration sessionFactoryConfiguration;

    private SessionFactory sessionFactory;

    private SessionFactoryConfiguration() {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(CarCategoryEntity.class)
                .addAnnotatedClass(CarEntity.class)
                .addAnnotatedClass(RentEntity.class)
                .addAnnotatedClass(CustomerEntity.class)
                .addAnnotatedClass(UserEntity.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionFactoryConfiguration getInstance() {
        return sessionFactoryConfiguration == null ? sessionFactoryConfiguration = new SessionFactoryConfiguration() : sessionFactoryConfiguration;
    }
    
    public Session getSession(){
        return sessionFactory.openSession();
    } 

}
