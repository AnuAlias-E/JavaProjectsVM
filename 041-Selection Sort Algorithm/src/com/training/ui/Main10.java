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
	
	System.out.println("Before Sort" + Arrays.toString(employees));

	int n = employees.length;

	int imin;
	for (int i = 0; i < n - 1; i++) {
		imin = i;
		for (int j = i + 1; j < n; j++) {
			int r = employees[j].compareTo( employees[imin]);
			if (r < 0) {
				imin = j;
			}
		}
		Employee temp;
		temp = employees[i];
		employees[i] = employees[imin];
		employees[imin] = temp;

	}

	System.out.println("After Sort: " + Arrays.toString(employees));
	employees = null;
}
}
