/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.service.custom;

import car.hire.dto.CarDto;
import car.hire.dto.CustomerDto;
import car.hire.dto.RentDto;
import car.hire.dto.RentReturnDto;
import car.hire.entity.CarEntity;
import car.hire.entity.CustomerEntity;
import car.hire.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface RentService extends SuperService {

    public ArrayList<RentDto> getAllRentals() throws Exception;

    public ArrayList<RentDto> getOverdueRentals() throws Exception;

    public CustomerDto searchCustomer(Integer custId) throws Exception;

    public CarDto searchVehicle(Integer vehicleId) throws Exception;

    public CustomerEntity getCustomerEntity(Integer custId) throws Exception;

    public CarEntity getVehicleEntity(Integer carId) throws Exception;

    public String newRent(RentDto dto) throws Exception;

    public ArrayList<RentDto> getActiveRentals() throws Exception;

    public ArrayList<RentDto> getOldRentals() throws Exception;

    public RentReturnDto getRentData(Integer rentId) throws Exception;

    public String returnCar(RentReturnDto entity) throws Exception;

}
