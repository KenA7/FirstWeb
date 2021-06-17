package com.example.firstweb.service.impl;

import com.example.firstweb.model.Customer;
import com.example.firstweb.repository.CustomerRepository;
import com.example.firstweb.service.CustomerService;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    @Override
    public Customer createCustomer(Customer newCustomer) {
        return repository.save(newCustomer);
    }

    @Override
    public Customer updateCustomer(String email, Customer updatedCustomer) {
        Customer currentCustomer = repository.findById(updatedCustomer.getId()).get();
        if(currentCustomer.getEmail().equals(email)){
            throw new IllegalStateException("Email is token");
        }else{
            currentCustomer.setEmail(updatedCustomer.getEmail());
        }
        return repository.save(currentCustomer);
    }
    @NonNull
    @Override
    public void deleteCustomer(Long id) {
        repository.deleteById(id);
    }


}
