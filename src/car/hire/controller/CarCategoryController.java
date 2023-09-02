/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.controller;

import car.hire.dto.CarCategoryDto;
import car.hire.service.ServiceFactory;
import car.hire.service.custom.CarCategoryService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public class CarCategoryController {
    
    CarCategoryService carCategoryService = (CarCategoryService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CAR_CATEGORY);

    public String addCarCategory(CarCategoryDto categoryDto) throws Exception{
        return carCategoryService.addCarCategory(categoryDto);
    }

    public ArrayList<CarCategoryDto> getAllCarCategories() throws Exception {
        return carCategoryService.getAllCarCategories();
    }

    public CarCategoryDto getCarCategory(String id) throws Exception {
        return carCategoryService.getCarCategory(id);
    }

    public String updateCarCategory(CarCategoryDto categoryDto) throws Exception {
        return carCategoryService.updateCarCategory(categoryDto);
    }

    public String deleteCarCategory(CarCategoryDto carCategoryDto) throws Exception{
        return carCategoryService.deleteCarCategory(carCategoryDto);
    }
    
}
