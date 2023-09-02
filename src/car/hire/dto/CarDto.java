/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dto;

import car.hire.entity.CarCategoryEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author DELL i5
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CarDto {
    
    private Integer vehicleId;
    private String vehicleNumber;
    private CarCategoryEntity carCategoryEntity;
    private String model;
    private String brand;
    private Integer year;
    private String colour;
    private String chassisNo;
    private Double pricePerDay;
    
}
