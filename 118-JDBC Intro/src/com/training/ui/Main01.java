package com.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main01 {
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

		String query = "insert into products values(1005,'OPPO',55000.00,'Mobile')";
		Statement statement = null;
		try {
			statement = connection.createStatement();
			System.out.println("Statement created Successfully");
			int r = statement.executeUpdate(query);
			System.out.println(r + " row(s) inserted");

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
