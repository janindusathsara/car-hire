/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.CarCategoryDao;
import car.hire.dto.CarCategoryDto;
import car.hire.entity.CarCategoryEntity;
import car.hire.service.custom.CarCategoryService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public class CarCategoryServiceImpl implements CarCategoryService{
    
    CarCategoryDao carCategoryDao = (CarCategoryDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CAR_CATEGORY);

    @Override
    public String addCarCategory(CarCategoryDto dto) throws Exception {
        CarCategoryEntity entity = new CarCategoryEntity(
                dto.getId(), 
                dto.getName(), null);
        Integer value  = carCategoryDao.addCarCategory(entity);
        if (value>=0) {
            return "Success";
        } else {
            return "Fail";
        }
        
    }

    @Override
    public ArrayList<CarCategoryDto> getAllCarCategories() throws Exception {
        ArrayList<CarCategoryDto> categoryDtos = new ArrayList<>();
        ArrayList<CarCategoryEntity> categoryEntitys = carCategoryDao.getAllCarCategories();
        
        for (CarCategoryEntity entity : categoryEntitys) {
            CarCategoryDto dto = new CarCategoryDto(entity.getCategoryId() , entity.getName());
            categoryDtos.add(dto);
        }
        
        return categoryDtos;
    }

    @Override
    public CarCategoryDto getCarCategory(String id) throws Exception {
        CarCategoryEntity entity = carCategoryDao.getCarCategory(id);
        CarCategoryDto dto = new CarCategoryDto(entity.getCategoryId(),entity.getName());
        return dto;
    }

    @Override
    public String updateCarCategory(CarCategoryDto dto) throws Exception{
        
        CarCategoryEntity entity = new CarCategoryEntity(
                dto.getId(), 
                dto.getName(), null);
        Integer value  = carCategoryDao.updateCarCategory(entity);
        if (value>=0) {
            return "Success";
        } else {
            return "Fail";
        }
        
    }

    @Override
    public String deleteCarCategory(CarCategoryDto dto) throws Exception {
        
        CarCategoryEntity entity = new CarCategoryEntity(
                dto.getId(), 
                dto.getName(), null);
        return carCategoryDao.deleteCarCategory(entity);
    }
    
}
