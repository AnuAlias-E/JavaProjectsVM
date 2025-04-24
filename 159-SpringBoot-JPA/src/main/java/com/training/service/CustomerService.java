package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.CustomerRepository;
import com.training.model.Customer;
@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;
	

	public Customer addNewCustomer(Customer customer) {
		
		return repo.save(customer);
	}
	

	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);
	}

	public Customer getCustomerById(int customerId) {
		return repo.findById(customerId).orElse(null);
	}

	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	public boolean deleteCustomer(Customer customer) {
		repo.delete(customer);
		if (!repo.existsById(customer.getId())) {

			return true;
		}
		return false;
	}
	public List<Customer> getAllCustomersBySameName(String name) {
		return repo.findByName(name);
	}
	
	public Customer getCustomersByPhoneNumber(String phoneNumber) {
		return repo.findByPhoneNumber(phoneNumber);
	}
}
