package com.training.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
