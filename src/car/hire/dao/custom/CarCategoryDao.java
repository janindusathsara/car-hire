/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.dao.custom;

import car.hire.dao.SuperDao;
import car.hire.dto.CarCategoryDto;
import car.hire.entity.CarCategoryEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface CarCategoryDao extends SuperDao{
    
    Integer addCarCategory(CarCategoryEntity categoryEntity) throws Exception;

    public ArrayList<CarCategoryEntity> getAllCarCategories() throws Exception;

    public CarCategoryEntity getCarCategory(String id) throws Exception;

    public Integer updateCarCategory(CarCategoryEntity entity) throws Exception;

    public String deleteCarCategory(CarCategoryEntity entity) throws Exception;
    
}
