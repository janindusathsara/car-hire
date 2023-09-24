/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.controller;

import car.hire.dto.UserDto;
import car.hire.service.ServiceFactory;
import car.hire.service.custom.UserService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public class UserController {
    UserService userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);

    public ArrayList<UserDto> getAllUsers() throws Exception {
        return userService.getAllUsers();
    }

    public String registerNewUser(UserDto userDto) throws Exception {
        return userService.registerNewUser(userDto);
    }

    public String deleteUser(Integer userId) throws Exception {
        return userService.deleteUser(userId);
    }

    public Boolean checkOldPassword(UserDto userDto) throws Exception {
        return userService.checkOldPassword(userDto);
    }

    public String updateUser(UserDto userDto) throws Exception {
        return userService.updateUser(userDto);
    }

    public UserDto getUserData(Integer userId) throws Exception {
        return userService.getUserData(userId);
    }

    public boolean login(String userName, String password) throws Exception {
        return userService.login(userName, password);
    }

    public UserDto getUserID(String userName, String password) throws Exception {
        return userService.getUserID(userName, password);
    }

    
}
