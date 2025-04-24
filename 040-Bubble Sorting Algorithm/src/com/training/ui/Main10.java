package com.training.ui;

import java.util.Arrays;

import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.SalesEmployee;

public class Main10 {
public static void main(String[] args) {
	Manager manager = new Manager(104, "Ram", "MALE", "Mumbai", 1000.00, 12);
	SalesEmployee salesEmployee1 = new SalesEmployee(102, "Dinesh", "MALE", "Delhi", 1000.00, 100000.00);
	SalesEmployee salesEmployee2 = new SalesEmployee(103, "Kiran", "MALE", "Pune", 1000.00, 200000.00);
	Employee employee = new Employee(101, "Menaka", "FEMALE", "Cochin", 1000.0);
	Employee[] employees = { manager, salesEmployee1, salesEmployee2, employee };
	
	//System.out.println("Before Sort" + Arrays.toString(employees));

	for (int i = 0; i < employees.length; i++) {

		for (int j = 0; j < employees.length - i - 1; j++) {
			int r = employees[j].compareTo(employees[j + 1]);
			if (r > 0) {// when the current item is greater than next
				Employee temp;
				temp = employees[j];
				employees[j] = employees[j + 1];
				employees[j + 1] = temp;
			}
		}
	}
	System.out.println( Arrays.toString(employees));
	
	employees=null;
}
}
