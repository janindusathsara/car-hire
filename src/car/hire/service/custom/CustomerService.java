/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package car.hire.service.custom;

import car.hire.dto.CustomerDto;
import car.hire.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author DELL i5
 */
public interface CustomerService extends SuperService{

    public ArrayList<CustomerDto> getRentedCustomers() throws Exception;

    public ArrayList<CustomerDto> getAllCustomers() throws Exception;

    public String addNewCustomer(CustomerDto customerDto) throws Exception;

    public String deleteCustomer(Integer custId) throws Exception;

    public CustomerDto getCustomerDto(Integer custId) throws Exception;

    public String updateCustomer(CustomerDto dto) throws Exception;
    
}
