/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dao;

import car.hire.dao.custom.impl.CarCategoryDaoImpl;
import car.hire.dao.custom.impl.CarDaoImpl;
import car.hire.dao.custom.impl.CustomerDaoImpl;
import car.hire.dao.custom.impl.UserDaoImpl;

/**
 *
 * @author DELL i5
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case CAR_CATEGORY:
                return new CarCategoryDaoImpl();
            case CAR:
                return new CarDaoImpl();
            case CUSTOMER:
                return new CustomerDaoImpl();
            case USER:
                return new UserDaoImpl();
            default:
                return null;
        }
    }
    
    public enum DaoTypes{
        CAR_CATEGORY, CAR, CUSTOMER, USER
    }
    
}
