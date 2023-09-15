/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.CarDao;
import car.hire.dto.CarDto;
import car.hire.entity.CarCategoryEntity;
import car.hire.entity.CarEntity;
import car.hire.entity.RentEntity;
import car.hire.service.custom.CarService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL i5
 */
public class CarServiceImpl implements CarService {

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
            carDtos.add(dto);
        }
        return carDtos;
    }

    @Override
    public ArrayList<CarDto> getRentedCars() throws Exception {
        ArrayList<CarDto> carDtos = new ArrayList<>();
        ArrayList<CarEntity> carEntitys = carDao.getRentedCars();

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
            carDtos.add(dto);
        }

        return carDtos;
    }

    @Override
    public ArrayList<CarDto> getAvailableCars() throws Exception {
        ArrayList<CarDto> carDtos = new ArrayList<>();
        ArrayList<CarEntity> carEntitys = carDao.getAvailableCars();

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
            carDtos.add(dto);
        }

        return carDtos;
    }

    @Override
    public String deleteCar(String carId) throws Exception {
        return carDao.deleteCar(carId);
    }

    @Override
    public String addNewCar(CarDto dto) throws Exception {
        CarEntity entity = new CarEntity(
                dto.getVehicleId(),
                dto.getVehicleNumber(),
                dto.getCarCategoryEntity(),
                dto.getModel(),
                dto.getBrand(),
                dto.getYear(),
                dto.getColour(),
                dto.getChassisNo(),
                dto.getPricePerDay(),
                Boolean.TRUE,
                null);
        return carDao.addNewCar(entity);
    }

    @Override
    public CarCategoryEntity getCarCategoryEntity(Integer carId) throws Exception {
        CarCategoryEntity entity = carDao.getCarCategoryEntity(carId);
        if (entity == null) {
            return null;
        } else {
            return entity;
        }
    }

    @Override
    public CarDto getCarEntity(Integer carId) throws Exception {
        CarEntity entity = carDao.getCarEntity(carId);
        CarDto dto = new CarDto(
                entity.getVehicleId(), 
                entity.getVehicleNumber(), 
                entity.getCarCategoryEntity(), 
                entity.getModel(), 
                entity.getBrand(), 
                entity.getYear(), 
                entity.getColour(), 
                entity.getChassisNo(), 
                entity.getPricePerDay());
        
        if (entity == null) {
            return null;
        } else {
            return dto;
        }
    }

    @Override
    public String updateCar(CarDto dto) throws Exception {
        CarEntity entity = new CarEntity(
                dto.getVehicleId(),
                dto.getVehicleNumber(),
                dto.getCarCategoryEntity(),
                dto.getModel(),
                dto.getBrand(),
                dto.getYear(),
                dto.getColour(),
                dto.getChassisNo(),
                dto.getPricePerDay(),
                carDao.getCarEntity(dto.getVehicleId()).getIsAvailable(), 
                carDao.getCarEntity(dto.getVehicleId()).getRentEntitys());
        
        return carDao.updateCar(entity);
    }

}
