package com.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main04 {

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

		String query = "select * from products ";
	
		Statement statement = null;
		try {
			statement = connection.createStatement();
			System.out.println("Statement created Successfully");
			System.out.println("------------------------------------------------------------");
			ResultSet rs = statement.executeQuery(query);
			System.out.println("PdtId\tPdtName\t\t\tPdtPrice\tPdtCategory");

			System.out.println("-----------------------------------------------------------");
			while (rs.next()) {
				int pid = rs.getInt(1);
				String pname = rs.getString(2);
				Double pprice = rs.getDouble(3);
				String pcategory = rs.getString(4);
				//System.out.print("\n" + pid + "\t\t" + pname + "\t\t" + pprice + "\t\t" + pcategory);
				System.out.printf("%d\t %-20s \t%10.2f \t %-20s",pid,pname,pprice,pcategory);
				System.out.println();
			}

			System.out.println("--------------------------------------------------------------");
			System.out.println("Read the record sucessfully");

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
