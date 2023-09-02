/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.service.custom;

import car.hire.dto.CarCategoryDto;
import car.hire.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface CarCategoryService extends SuperService{

    public String addCarCategory(CarCategoryDto categoryDto) throws Exception;

    public ArrayList<CarCategoryDto> getAllCarCategories()throws Exception;

    public CarCategoryDto getCarCategory(String id) throws Exception;

    public String updateCarCategory(CarCategoryDto categoryDto) throws Exception;

    public String deleteCarCategory(CarCategoryDto carCategoryDto) throws Exception;
    
}
