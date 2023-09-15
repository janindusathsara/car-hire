/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.controller;

import car.hire.dto.CarDto;
import car.hire.entity.CarCategoryEntity;
import car.hire.service.ServiceFactory;
import car.hire.service.custom.CarService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public class CarController {

    CarService carService = (CarService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CAR);

    public ArrayList<CarDto> getAllCars() throws Exception {
        return carService.getAllCars();
    }

    public ArrayList<CarDto> getRentedCars() throws Exception {
        return carService.getRentedCars();
    }

    public ArrayList<CarDto> getAvailableCars() throws Exception {
        return carService.getAvailableCars();
    }

    public String deleteCar(String carId) throws Exception {
        return carService.deleteCar(carId);
    }

    public String addNewCar(CarDto carDto) throws Exception {
        return carService.addNewCar(carDto);
    }

    public CarCategoryEntity getCarCategoryEntity(Integer carId) throws Exception {
        return carService.getCarCategoryEntity(carId);
    }

    public CarDto getCarEntity(Integer carId) throws Exception {
        return carService.getCarEntity(carId);
    }

    public String updateCar(CarDto carDto) throws Exception{
        return carService.updateCar(carDto);
    }

    
}
