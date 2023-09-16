/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.service.custom.impl;

import car.hire.dao.DaoFactory;
import car.hire.dao.custom.CustomerDao;
import car.hire.dto.CustomerDto;
import car.hire.entity.CustomerEntity;
import car.hire.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public class CustomerServiceImpl implements CustomerService{
    
    CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CUSTOMER);

    @Override
    public ArrayList<CustomerDto> getRentedCustomers() throws Exception {
        ArrayList<CustomerDto> dtos = new ArrayList<>();
        ArrayList<CustomerEntity> entity = customerDao.getRentedCustomers();
        
        for (CustomerEntity customerEntity : entity) {
            CustomerDto cd = new CustomerDto(
                    customerEntity.getCustId(), 
                    customerEntity.getCustTitle(), 
                    customerEntity.getCustName(), 
                    customerEntity.getCustAddress(), 
                    customerEntity.getNic(), 
                    customerEntity.getDob(), 
                    customerEntity.getCustPhoneNo());
            dtos.add(cd);
        }
        return dtos;
        
    }

    @Override
    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        ArrayList<CustomerDto> dtos = new ArrayList<>();
        ArrayList<CustomerEntity> entity = customerDao.getAllCustomers();
        
        for (CustomerEntity customerEntity : entity) {
            CustomerDto cd = new CustomerDto(
                    customerEntity.getCustId(), 
                    customerEntity.getCustTitle(), 
                    customerEntity.getCustName(), 
                    customerEntity.getCustAddress(), 
                    customerEntity.getNic(), 
                    customerEntity.getDob(), 
                    customerEntity.getCustPhoneNo());
            dtos.add(cd);
        }
        return dtos;
    }

    @Override
    public String addNewCustomer(CustomerDto dto) throws Exception{
        CustomerEntity entity  = new CustomerEntity(
                null, 
                dto.getTitle(), 
                dto.getName(), 
                dto.getAddress(), 
                dto.getNic(), 
                dto.getDob(), 
                dto.getMobileNo(), 
                Boolean.FALSE, 
                null);
        
        return customerDao.addNewCustomer(entity);
    }

    @Override
    public String deleteCustomer(Integer custId) throws Exception {
        return customerDao.deleteCustomer(custId);
    }

    @Override
    public CustomerDto getCustomerDto(Integer custId) throws Exception {
        CustomerEntity entity = customerDao.getCustomerEntity(custId);
        CustomerDto dto = new CustomerDto(
                entity.getCustId(), 
                entity.getCustTitle(), 
                entity.getCustName(), 
                entity.getCustAddress(), 
                entity.getNic(), 
                entity.getDob(), 
                entity.getCustPhoneNo());
        
        return dto;
    }

    @Override
    public String updateCustomer(CustomerDto dto) throws Exception {
        CustomerEntity ce = customerDao.getCustomerEntity(dto.getId());
        CustomerEntity entity = new CustomerEntity(
                dto.getId(), 
                dto.getTitle(), 
                dto.getName(), 
                dto.getAddress(), 
                dto.getNic(), 
                dto.getDob(), 
                dto.getMobileNo(), 
                ce.getIsRented(), 
                ce.getRentEntitys());
        return customerDao.updateCustomer(entity);
    }
    
}
