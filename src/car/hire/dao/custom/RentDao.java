/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.dao.custom;

import car.hire.dao.SuperDao;
import car.hire.dto.RentDto;
import car.hire.entity.CarEntity;
import car.hire.entity.CustomerEntity;
import car.hire.entity.RentEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface RentDao extends SuperDao{

    public ArrayList<RentEntity> getAllRentals() throws  Exception;

    public ArrayList<RentEntity> getOverdueRentals() throws  Exception;

    public CustomerEntity searchCustomer(Integer custId) throws  Exception;

    public CarEntity searchVehicle(Integer vehicleId) throws  Exception;

    public String newRent(RentEntity entity) throws  Exception;
    
}
