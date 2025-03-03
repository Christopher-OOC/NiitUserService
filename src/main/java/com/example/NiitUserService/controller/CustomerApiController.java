package com.example.NiitUserService.controller;

import com.example.NiitUserService.model.Customer;
import com.example.NiitUserService.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/customers")
public class CustomerApiController {

    private CustomerService customerService;

    public CustomerApiController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<?> createCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);

        return ResponseEntity.ok("Customer Created!");
    }

}
