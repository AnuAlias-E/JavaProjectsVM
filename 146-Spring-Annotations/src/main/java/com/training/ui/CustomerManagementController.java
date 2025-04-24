package com.training.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.training.service.CustomerService;

@Controller
public class CustomerManagementController {

	@Autowired
	CustomerService service;

	@Override
	public String toString() {
		return "CustomerManagementController [service=" + service + "]";
	}
	
	
}
