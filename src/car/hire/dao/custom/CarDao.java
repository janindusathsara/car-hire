/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.dao.custom;

import car.hire.dao.SuperDao;
import car.hire.entity.CarCategoryEntity;
import car.hire.entity.CarEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface CarDao extends SuperDao{

    public ArrayList<CarEntity> getAllCars() throws Exception;

    public ArrayList<CarEntity> getRentedCars() throws Exception;

    public ArrayList<CarEntity> getAvailableCars() throws Exception;

    public String deleteCar(String carId) throws Exception;

    public String addNewCar(CarEntity entity) throws Exception;

    public CarCategoryEntity getCarCategoryEntity(Integer carId) throws Exception;

    public CarEntity getCarEntity(Integer carId) throws Exception;

    public String updateCar(CarEntity entity) throws Exception;

}
