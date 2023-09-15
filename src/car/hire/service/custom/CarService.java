/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.service.custom;

import car.hire.dto.CarDto;
import car.hire.entity.CarCategoryEntity;
import car.hire.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface CarService extends SuperService {

    public ArrayList<CarDto> getAllCars() throws Exception;

    public ArrayList<CarDto> getRentedCars() throws Exception;

    public ArrayList<CarDto> getAvailableCars() throws Exception;

    public String deleteCar(String carId) throws Exception;

    public String addNewCar(CarDto carDto) throws Exception;

    public CarCategoryEntity getCarCategoryEntity(Integer carId) throws Exception;

    public CarDto getCarEntity(Integer carId) throws Exception;

    public String updateCar(CarDto carDto) throws Exception;

}
