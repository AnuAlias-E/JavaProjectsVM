package com.training.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.training.model.Department;
import com.training.util.ConsoleIO;

public class Main01 {
public static void main(String[] args) throws IOException {
	String deptName;
	String managerName;
	
	System.out.println("Enter the Dept Name: ");
	deptName = ConsoleIO.inputString();

	System.out.println("Enter the Manager Name: ");
	managerName = ConsoleIO.inputString();
	
	Department department = new Department(deptName, managerName);
	char anyMore;
	do {
		
		int id;
		 String name;
		 String gender;
		 String cityName;
		 double basic;
		 
		 System.out.println("Enter the Employee ID: ");
			id = ConsoleIO.inputInt();

			System.out.println("Enter the Employee Name: ");
			name = ConsoleIO.inputString();
			System.out.println("Enter the Employee gender: ");
			gender = ConsoleIO.inputString();
			System.out.println("Enter the Employee City Name: ");
			cityName = ConsoleIO.inputString();
			System.out.println("Enter the Employee Basic Salary: ");
			basic = ConsoleIO.inputDouble();
			
			department.addEmployee(id, name, gender, cityName, basic);
			
			
			
		System.out.println("Anymore employees ? :");
		anyMore=ConsoleIO.inputChar();

	}while(anyMore=='y'||anyMore=='Y');
	
	department.printReport();
	
	OutputStream os = new FileOutputStream("department.dat");
	ObjectOutputStream oos = new ObjectOutputStream(os);
	oos.writeObject(department);

	oos.flush();
	oos.close();
	os.close();

}
}
