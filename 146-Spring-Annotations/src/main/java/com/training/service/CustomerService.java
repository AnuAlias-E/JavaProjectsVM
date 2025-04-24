package com.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.CustomerDAO;

@Service
public class CustomerService {

	@Autowired
	CustomerDAO dao;

	@Override
	public String toString() {
		return "CustomerService [dao=" + dao + "]";
	}
	
	

}
