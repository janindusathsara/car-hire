/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.hire.controller;

import car.hire.dto.CustomerDto;
import car.hire.service.ServiceFactory;
import car.hire.service.custom.CustomerService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public class CustomerController {
    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CUSTOMER);


    public String addNewCustomer(CustomerDto customerDto) throws Exception{
        return customerService.addNewCustomer(customerDto);
    }   
    
    public ArrayList<CustomerDto> getRentedCustomers() throws Exception {
        return customerService.getRentedCustomers();
    }

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        return customerService.getAllCustomers();
    }

    public String deleteCustomer(Integer custId) throws Exception {
        return customerService.deleteCustomer(custId);
    }

    public CustomerDto getCustomerDto(Integer custId) throws Exception {
        return customerService.getCustomerDto(custId);
    }

    public String updateCustomer(CustomerDto dto) throws Exception {
        return customerService.updateCustomer(dto);
    }
    
    
}
