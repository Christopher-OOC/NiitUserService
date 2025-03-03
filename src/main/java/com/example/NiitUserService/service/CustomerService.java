package com.example.NiitUserService.service;

import com.example.NiitUserService.model.Customer;
import com.example.NiitUserService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void createCustomer(Customer customer) {
        customer.setPublicId(UUID.randomUUID().toString());
        customerRepository.save(customer);
    }
}
