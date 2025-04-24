package com.training.ui;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main02 {


	public static void main(String[] args) {
		// step1 load a driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
		// step2 Establish a connection to a ride
		Connection connection = null;
		try {
			String dburl = "jdbc:mysql://localhost:3306/trainingdb10?useSSL=false";

			String userName = "root";
			String password = "root";
			connection = DriverManager.getConnection(dburl, userName, password);
			System.out.println("Connected to Database");
		} catch (SQLException e) {
			System.err.println(e);
		}
		// step3 Execute queries

		
		CallableStatement statement = null;
		try {
			statement = connection.prepareCall("{call incrementsalary(?,?,?)}");
			statement.setString(1, "INDIA");
			statement.setInt(2, 5);
			statement.registerOutParameter(3, java.sql.Types.DOUBLE);
			statement.execute();
			System.out.println(statement.getInt(3));

		} catch (SQLException e) {
			System.err.println(e);
		}
		// step 4 close statement
		try {
			statement.close();
			connection.close();
			System.out.println("Closed Connection Successfully");
		} catch (SQLException e) {
			System.err.println(e);
		}
	}




}
