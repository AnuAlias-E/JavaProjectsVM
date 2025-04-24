package com.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main07 {
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

		String query = "update products set pname=?, pprice=? , pcategory=? where pid=?";

		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(query);

			Scanner sc = new Scanner(System.in);
			int pid;
			String pname;
			double pprice;
			String category;

			System.out.print("Enter Product Id to Update:");
			pid = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Product Name :");
			pname = sc.nextLine();
			System.out.print("Enter Product Price :");
			pprice = Double.parseDouble(sc.nextLine());
			System.out.print("Enter Product Category :");
			category = sc.nextLine();

			preparedStatement.setString(1, pname);
			preparedStatement.setDouble(2, pprice);
			preparedStatement.setString(3, category);
			preparedStatement.setInt(4, pid);

			int r = preparedStatement.executeUpdate();
			System.out.println("Prepared Statement for update created Successfully");
			System.out.println(r + " row(s) updates");
			sc.close();
		} catch (SQLException e) {
			System.err.println(e);
		}
		// step 4 close statement
		try {
			preparedStatement.close();
			connection.close();
			System.out.println("Closed Connection Successfully");
		} catch (SQLException e) {
			System.err.println(e);
		}

	}
}
