/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service;

import car.hire.service.custom.impl.CarCategoryServiceImpl;

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
            default:
                return null;
        }
    }
    
    public enum ServiceType{
        CAR_CATEGORY
    }
    
}
