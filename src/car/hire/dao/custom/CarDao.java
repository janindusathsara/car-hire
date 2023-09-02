/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.dao.custom;

import car.hire.dao.SuperDao;
import car.hire.entity.CarEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface CarDao extends SuperDao{

    public ArrayList<CarEntity> getAllCars() throws Exception;
    
}
