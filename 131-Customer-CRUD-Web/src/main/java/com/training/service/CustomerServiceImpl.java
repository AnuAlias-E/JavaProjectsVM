package com.training.service;

import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;

import com.training.db.ConnectionManager;
import com.training.db.CustomerDAOMySQL;
import com.training.db.CustomerDAOMySQLImpl;
import com.training.model.Customer;

public class CustomerServiceImpl implements CustomerService {

	
	@Override
	public boolean addCustomer(Customer customer) throws Exception {
		Connection connection = ConnectionManager.createConnection();
		CustomerDAOMySQL dao = new CustomerDAOMySQLImpl();
		boolean status = dao.insertCustomer(connection, customer);
		ConnectionManager.closeConnection(connection);
		return status;

	}

	@Override
	public Customer searchCustomer(int customerId) {
		Customer customer;
		Connection connection = ConnectionManager.createConnection();
		CustomerDAOMySQL dao = new CustomerDAOMySQLImpl();
		customer = dao.findCustomerByCustomerId(connection, customerId);
		ConnectionManager.closeConnection(connection);
		return customer;
	}

	@Override
	public boolean updateCustomer(Customer customer) throws Exception {
		Connection connection = ConnectionManager.createConnection();
		CustomerDAOMySQL dao = new CustomerDAOMySQLImpl();
		boolean status = dao.updateCustomer(connection, customer);
		ConnectionManager.closeConnection(connection);
		return status;

	}

	@Override
	public List<Customer> getAllCustomers() {
		Connection connection = ConnectionManager.createConnection();
		CustomerDAOMySQL dao = new CustomerDAOMySQLImpl();
		List<Customer> customers = dao.findAllCustomers(connection);
		ConnectionManager.closeConnection(connection);
		return customers;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		Connection connection = ConnectionManager.createConnection();
		CustomerDAOMySQL dao = new CustomerDAOMySQLImpl();
		boolean status = dao.deleteCustomer(connection, customer);
		ConnectionManager.closeConnection(connection);
		return status;
	}

}
