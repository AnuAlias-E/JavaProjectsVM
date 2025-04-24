package com.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.CustomerRepository;
import com.training.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;

	public Customer addCustomer(Customer customer) {
		return repo.save(customer);
	}

	public Customer updateCustomer(Customer customer) {
		return repo.save(customer);
	}

	public boolean deleteCustomer(Customer customer) {
		repo.delete(customer);
		
		boolean existsCustomer =repo.existsById(customer.getId());
		if(existsCustomer)
		{
			return false;
		}
		return true;
	}

	public Customer searchCustomer(int id) {
		Optional<Customer> optional = repo.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

}
