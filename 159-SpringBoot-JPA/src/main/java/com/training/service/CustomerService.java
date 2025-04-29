package com.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.CustomerRepository;
import com.training.exception.CustomerNotFoundException;
import com.training.model.Customer;
@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;
	

	public Customer addNewCustomer(Customer customer) {
		
		return repo.save(customer);
	}
	

	public Customer updateCustomer(Customer customer)throws CustomerNotFoundException  {
		
		return repo.save(customer);
	}

	public Customer getCustomerById(int customerId) throws CustomerNotFoundException {
		Optional<Customer> cust=repo.findById(customerId);
		if(cust.isPresent()) {
			cust.get();
		}
		return repo.findById(customerId).orElseThrow(()-> new CustomerNotFoundException("Customer Not Found"));
	}

	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	public boolean deleteCustomer(Customer customer) {
	
		repo.delete(customer);
		boolean existsById = repo.existsById(customer.getId());
		if (!existsById) {

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
