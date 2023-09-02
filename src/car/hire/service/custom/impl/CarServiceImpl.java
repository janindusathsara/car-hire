/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.CarDao;
import car.hire.dto.CarDto;
import car.hire.entity.CarEntity;
import car.hire.service.custom.CarService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public class CarServiceImpl implements CarService{
    
    CarDao carDao = (CarDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR);

    @Override
    public ArrayList<CarDto> getAllCars() throws Exception {
        ArrayList<CarDto> carDtos = new ArrayList<>();
        ArrayList<CarEntity> carEntitys = carDao.getAllCars();
        
        for (CarEntity carEntity : carEntitys) {
            CarDto dto = new CarDto(
                    carEntity.getVehicleId(), 
                    carEntity.getVehicleNumber(), 
                    carEntity.getCarCategoryEntity(), 
                    carEntity.getModel(), 
                    carEntity.getBrand(), 
                    carEntity.getYear(), 
                    carEntity.getColour(), 
                    carEntity.getChassisNo(), 
                    carEntity.getPricePerDay());
        }
        
        return carDtos;
    }
    
}


