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

/**
 *
 * @author DELL i5
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public ArrayList<UserDto> getAllUsers() throws Exception {
        ArrayList<UserDto> dtos = new ArrayList<>();
        ArrayList<UserEntity> entity = userDao.getAllUsers();

        for (UserEntity userEntity : entity) {
            UserDto ud = new UserDto(
                    userEntity.getUserId(),
                    userEntity.getUTitle(),
                    userEntity.getUname(),
                    userEntity.getUAddress(),
                    userEntity.getUNic(),
                    userEntity.getDob(),
                    userEntity.getUPhoneNo(),
                    userEntity.getEmail(),
                    userEntity.getUserName(),
                    userEntity.getPassword());
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

}
