/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.service.custom;

import car.hire.dto.UserDto;
import car.hire.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface UserService extends SuperService {

    public ArrayList<UserDto> getAllUsers() throws Exception;

    public String registerNewUser(UserDto userDto) throws Exception;

    public String deleteUser(Integer userId) throws Exception;

    public Boolean checkOldPassword(UserDto userDto) throws Exception;

    public String updateUser(UserDto userDto) throws Exception;

    public UserDto getUserData(Integer userId) throws Exception;

    public boolean login(String userName, String password) throws Exception;

    public UserDto getUserID(String userName, String password) throws Exception;

}
