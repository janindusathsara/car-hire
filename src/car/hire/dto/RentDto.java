/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dto;

import car.hire.entity.CarEntity;
import car.hire.entity.CustomerEntity;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author DELL i5
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RentDto {

    private Integer rentId;
    private CustomerEntity customerEntity;
    private CarEntity car;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Double perDayRent;
    private Double advance;
    private Double keyMoney;

}
