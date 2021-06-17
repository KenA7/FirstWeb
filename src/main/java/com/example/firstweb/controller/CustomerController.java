package com.example.firstweb.controller;


import com.example.firstweb.model.Customer;
import com.example.firstweb.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/customer")
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers(){return customerService.getAllCustomers();}

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer){
       return customerService.createCustomer(customer);
    }

    @PutMapping
    public Customer updateProfile(@RequestParam("email") String email,@RequestBody Customer customer){
        return customerService.updateCustomer(email,customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id){customerService.deleteCustomer(id);}
}
