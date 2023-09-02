/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao.custom.impl;

import car.hire.dao.custom.CarDao;
import car.hire.entity.CarEntity;
import car.hire.util.SessionFactoryConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author DELL i5
 */
public class CarDaoImpl implements CarDao{
    
    Session session = SessionFactoryConfiguration.getInstance().getSession();

    @Override
    public ArrayList<CarEntity> getAllCars() throws Exception {
        String hql = "FROM CarEntity";
        Query query = session.createQuery(hql);
        List<CarEntity> arrayList = query.list();
        return (ArrayList<CarEntity>) arrayList;
    }
    
}
