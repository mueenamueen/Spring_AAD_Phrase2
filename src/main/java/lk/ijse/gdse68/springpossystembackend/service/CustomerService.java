package lk.ijse.gdse68.springpossystembackend.service;

import lk.ijse.gdse68.springpossystembackend.customerObj.CustomerResponse;
import lk.ijse.gdse68.springpossystembackend.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void saveCustomer(CustomerDTO customerDTO);
    void updateCustomer(String id,CustomerDTO customerDTO);
    void deleteCustomer(String id);
    CustomerResponse getSelectedCustomer(String id);

    List<CustomerDTO> getAllCustomers();
}
