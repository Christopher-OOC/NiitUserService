package com.example.NiitUserService.repository;

import com.example.NiitUserService.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
