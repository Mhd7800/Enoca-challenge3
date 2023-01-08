package com.example.EnocaChallenge3.service;



import com.example.EnocaChallenge3.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer updateCustomer(Customer customer, Long id);
    void deleteCustomer(Long id);
    //Customer getCustomerByName(String name);

}
