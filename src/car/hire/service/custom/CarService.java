/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.service.custom;

import car.hire.dto.CarDto;
import car.hire.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface CarService extends SuperService{

    public ArrayList<CarDto> getAllCars() throws Exception ;
    
}
