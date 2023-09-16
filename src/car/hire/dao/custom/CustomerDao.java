/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.dao.custom;

import car.hire.dao.SuperDao;
import car.hire.entity.CustomerEntity;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface CustomerDao extends SuperDao{

    public ArrayList<CustomerEntity> getRentedCustomers() throws Exception;

    public ArrayList<CustomerEntity> getAllCustomers() throws Exception;

    public String addNewCustomer(CustomerEntity entity) throws Exception;

    public String deleteCustomer(Integer custId) throws Exception;

    public CustomerEntity getCustomerEntity(Integer custId) throws Exception;

    public String updateCustomer(CustomerEntity entity) throws Exception;
    
}
