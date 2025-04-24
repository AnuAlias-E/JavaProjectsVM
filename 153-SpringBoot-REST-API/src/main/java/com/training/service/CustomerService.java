package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.db.CustomerRepository;

public class CustomerService {

	@Autowired
	CustomerRepository repo;
	
	
}
