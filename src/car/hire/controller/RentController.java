/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.controller;

import car.hire.dto.CarDto;
import car.hire.dto.CustomerDto;
import car.hire.dto.RentDto;
import car.hire.entity.CarEntity;
import car.hire.entity.CustomerEntity;
import car.hire.service.ServiceFactory;
import car.hire.service.custom.RentService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public class RentController {
    
    RentService rentService = (RentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.RENT);
            
    public ArrayList<RentDto> getOverdueRentals() throws Exception {
        return rentService.getOverdueRentals();
    }

    public ArrayList<RentDto> getAllRentals() throws Exception {
        return rentService.getAllRentals();
    }

    public CustomerDto searchCustomer(Integer custId) throws Exception {
        return rentService.searchCustomer(custId);
    }

    public CarDto searchVehicle(Integer vehicleId) throws Exception {
        return rentService.searchVehicle(vehicleId);
    }

    public CustomerEntity getCustomerEntity(Integer custId) throws Exception {
        return rentService.getCustomerEntity(custId);
    }

    public CarEntity getVehicleEntity(Integer carId) throws Exception {
        return rentService.getVehicleEntity(carId);
    }

    public String newRent(RentDto dto) throws Exception {
        return rentService.newRent(dto);
    }
    
}
