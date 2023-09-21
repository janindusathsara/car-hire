/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service;

import car.hire.service.custom.impl.CarCategoryServiceImpl;
import car.hire.service.custom.impl.CarServiceImpl;
import car.hire.service.custom.impl.CustomerServiceImpl;
import car.hire.service.custom.impl.RentServiceImpl;

/**
 *
 * @author DELL i5
 */
public class ServiceFactory {
    
    private static ServiceFactory serviceFactory;
    
    private ServiceFactory(){}
    
    public static ServiceFactory getInstance(){
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType type){
        switch (type) {
            case CAR_CATEGORY:
                return new CarCategoryServiceImpl();
            case CAR:
                return new CarServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            case RENT:
                return new RentServiceImpl();
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        CAR_CATEGORY, CAR, CUSTOMER, RENT
    }
    
}
