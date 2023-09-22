/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.dao.custom;

import car.hire.dao.SuperDao;
import car.hire.entity.UserEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface UserDao extends SuperDao{

    public ArrayList<Object[]> getAllUsers() throws Exception;

    public String registerNewUser(UserEntity userEntity) throws Exception;

    public String deleteUser(Integer userId) throws Exception;

    public Boolean checkOldPassword(UserEntity userEntity) throws Exception;

    public String updateUser(UserEntity userEntity) throws Exception;

    public UserEntity getUserData(Integer userId) throws Exception;
    
}
