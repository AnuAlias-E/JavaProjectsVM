package com.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main09 {

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

		String query = "select * from products where pid=?";

		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(query);

			Scanner sc = new Scanner(System.in);
			int pid;

			System.out.print("Enter Product Id to search:");
			pid = Integer.parseInt(sc.nextLine());

			preparedStatement.setInt(1, pid);

			ResultSet rs = preparedStatement.executeQuery();
			System.out.println("------------------------------------------------------------");
			if (rs.next()) {
				System.out.println("PdtId\tPdtName\t\t\tPdtPrice\tPdtCategory");

				System.out.println("-----------------------------------------------------------");

				int personid = rs.getInt(1);
				String pname = rs.getString(2);
				Double pprice = rs.getDouble(3);
				String pcategory = rs.getString(4);
				// System.out.print("\n" + pid + "\t\t" + pname + "\t\t" + pprice + "\t\t" +
				// pcategory);
				System.out.printf("%d\t %-20s \t%10.2f \t %-20s", personid, pname, pprice, pcategory);
				System.out.println();
			} else {
				System.out.println("Record Not Found !!!");
			}
			System.out.println("------------------------------------------------------------");
			System.out.println("Prepared Statement for select created Successfully");
			System.out.println("Read the values successfully");
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
