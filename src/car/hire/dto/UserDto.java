/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.dto;

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
public class UserDto {
    
    private Integer userID;
    private String title;
    private String name;
    private String address;
    private String nic;
    private Date dob;
    private Integer mobile;
    private String email;
    private String userName;
    private String userPassword;
    
}
