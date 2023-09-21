/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dto;

import car.hire.entity.CarEntity;
import car.hire.entity.CustomerEntity;
import java.util.Date;
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
public class RentReturnDto {
    
    private Integer rentId;
    private CustomerEntity customerEntity;
    private CarEntity car;
    private Date fromDate;
    private Date toDate;
    private Double perDayRent;
    private Double advance;
    private Double keyMoney;
    private Double total;
    private Double finalBalance;
    private Integer userId;
    
}
