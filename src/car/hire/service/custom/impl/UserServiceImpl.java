/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.UserDao;
import car.hire.dto.UserDto;
import car.hire.entity.UserEntity;
import car.hire.service.custom.UserService;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DELL i5
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public ArrayList<UserDto> getAllUsers() throws Exception {
        ArrayList<UserDto> dtos = new ArrayList<>();
        ArrayList<Object[]> data = userDao.getAllUsers();
        
        for (Object[] dataOb : data) {
            UserDto ud = new UserDto(
                    (Integer) dataOb[0],
                    (String) dataOb[1],
                    (String) dataOb[2],
                    (String) dataOb[3],
                    (String) dataOb[4],
                    ((Date)dataOb[6]),
                    (Integer) dataOb[7],
                    (String) dataOb[5],
                    (String) dataOb[8],
                    (String) dataOb[9]);
            dtos.add(ud);
        }
        return dtos;
    }

    @Override
    public String registerNewUser(UserDto dto) throws Exception {
        UserEntity userEntity = new UserEntity(
                dto.getUserID(),
                dto.getTitle(),
                dto.getName(),
                dto.getAddress(),
                dto.getNic(),
                dto.getEmail(),
                dto.getDob(),
                dto.getMobile(),
                dto.getUserName(),
                dto.getUserPassword());

        return userDao.registerNewUser(userEntity);
    }

    @Override
    public String deleteUser(Integer userId) throws Exception {
        return userDao.deleteUser(userId);
    }

    @Override
    public Boolean checkOldPassword(UserDto dto) throws Exception {
        UserEntity userEntity = new UserEntity(
                dto.getUserID(),
                dto.getTitle(),
                dto.getName(),
                dto.getAddress(),
                dto.getNic(),
                dto.getEmail(),
                dto.getDob(),
                dto.getMobile(),
                dto.getUserName(),
                dto.getUserPassword());

        return userDao.checkOldPassword(userEntity);
    }

    @Override
    public String updateUser(UserDto dto) throws Exception {
        UserEntity userEntity = new UserEntity(
                dto.getUserID(),
                dto.getTitle(),
                dto.getName(),
                dto.getAddress(),
                dto.getNic(),
                dto.getEmail(),
                dto.getDob(),
                dto.getMobile(),
                dto.getUserName(),
                dto.getUserPassword());

        return userDao.updateUser(userEntity);
    }

    @Override
    public UserDto getUserData(Integer userId) throws Exception {
        UserEntity entity = userDao.getUserData(userId);
        UserDto dto = new UserDto(
                entity.getUserId(), 
                entity.getUTitle(), 
                entity.getUname(), 
                entity.getUAddress(), 
                entity.getUNic(), 
                entity.getDob(), 
                entity.getUPhoneNo(), 
                entity.getEmail(), 
                entity.getUserName(), 
                entity.getPassword());
        return dto;
    }

}
