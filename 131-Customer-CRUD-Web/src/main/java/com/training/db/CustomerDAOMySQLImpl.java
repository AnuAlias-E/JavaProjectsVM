package com.training.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.model.Customer;

public class CustomerDAOMySQLImpl implements CustomerDAOMySQL {

	@Override
	public boolean insertCustomer(Connection connection, Customer customer) {
		boolean status = false;
		try {
			PreparedStatement statement = connection.prepareStatement(INSERT_QRY);
			statement.setInt(1, customer.getCustomerId());
			statement.setString(2, customer.getName());
			statement.setDouble(3, customer.getBalance());
			statement.setString(4, customer.getEmail());
			statement.setString(5, customer.getPhoneNo());
			int r = statement.executeUpdate();
			if (r > 0) {
				status = true;
			}

		} catch (SQLException e) {
			System.err.println(e);
		}
		return status;
	}

	@Override
	public boolean updateCustomer(Connection connection, Customer customer) {
		boolean status = false;
		try {
			PreparedStatement statement = connection.prepareStatement(UPDATE_QRY);
			statement.setString(1, customer.getName());
			statement.setDouble(2, customer.getBalance() );
			statement.setString(3, customer.getEmail());
			statement.setString(4, customer.getPhoneNo());
			statement.setInt(5, customer.getCustomerId());
			int r = statement.executeUpdate();
			if (r > 0) {
				status = true;
			}

		} catch (SQLException e) {
			System.err.println(e);
		}

		return status;
	}

	@Override
	public boolean deleteCustomer(Connection connection, Customer customer) {
		boolean status = false;
		try {
			PreparedStatement statement = connection.prepareStatement(DELETE_QRY);
			statement.setInt(1, customer.getCustomerId());
			int r = statement.executeUpdate();
			if (r > 0) {
				status = true;
			}

		} catch (SQLException e) {
			System.err.println(e);
		}
		return status;
	}

	@Override
	public Customer findCustomerByCustomerId(Connection connection, int customerId) {
		Customer customer = null;
		try {
			PreparedStatement statement = connection.prepareStatement(SEARCH_QRY);
			statement.setInt(1, customerId);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				customer = new Customer();
				customer.setCustomerId(customerId);
				customer.setName(rs.getString(2));
				customer.setBalance(rs.getDouble(3));
				customer.setEmail(rs.getString(4));
				customer.setPhoneNo(rs.getString(5));
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		return customer;
	}

	@Override
	public List<Customer> findAllCustomers(Connection connection) {

		List<Customer> allCustomers= new ArrayList<>();
		try {
			PreparedStatement statement = connection.prepareStatement(FINDALL_QRY);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer();
				customer.setCustomerId(rs.getInt(1));
				customer.setName(rs.getString(2));
				customer.setBalance(rs.getDouble(3));
				customer.setEmail(rs.getString(4));
				customer.setPhoneNo(rs.getString(5));
				allCustomers.add(customer);
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		return allCustomers;
	}

}
