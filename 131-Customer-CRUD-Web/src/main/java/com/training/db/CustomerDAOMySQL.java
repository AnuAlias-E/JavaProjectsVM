package com.training.db;

import java.sql.Connection;
import java.util.List;

import com.training.model.Customer;

public interface CustomerDAOMySQL {
	String INSERT_QRY = "insert into customers values(?,?,?,?,?)";
	String UPDATE_QRY = "update customers set name=?, balance=?, email=?, phoneno=? where cid=?";
	String DELETE_QRY = "delete  from customers where cid=?";
	String SEARCH_QRY = "select * from customers where cid=?";
	String FINDALL_QRY = "select * from customers";

	boolean insertCustomer(Connection connection, Customer customer);

	boolean updateCustomer(Connection connection, Customer customer);

	boolean deleteCustomer(Connection connection, Customer customer);

	Customer findCustomerByCustomerId(Connection connection, int customerId);

	List<Customer> findAllCustomers(Connection connection);
}
