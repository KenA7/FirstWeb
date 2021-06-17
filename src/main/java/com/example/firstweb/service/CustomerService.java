package com.example.firstweb.service;

import com.example.firstweb.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer createCustomer(Customer newCustomer);

    Customer updateCustomer(String email, Customer updatedCustomer);

    void deleteCustomer(Long id);

}
