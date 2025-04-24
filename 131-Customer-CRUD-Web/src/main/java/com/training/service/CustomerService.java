package com.training.service;

import java.util.List;

import com.training.model.Customer;

public interface CustomerService {
	boolean addCustomer(Customer customer) throws Exception;

	Customer searchCustomer(int customerId);

	boolean updateCustomer(Customer customer) throws Exception;

	List<Customer> getAllCustomers();

	boolean deleteCustomer(int customerId);

}
