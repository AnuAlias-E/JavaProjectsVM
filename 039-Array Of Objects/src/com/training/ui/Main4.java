package com.training.ui;

import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.SalesEmployee;

public class Main4 {
	public static void main(String[] args) {
		Manager manager = new Manager(101, "Ram", "MALE", "Mumbai", 1000.00, 12);
		SalesEmployee salesEmployee1 = new SalesEmployee(102, "Dinesh", "MALE", "Delhi", 1000.00, 100000.00);
		SalesEmployee salesEmployee2 = new SalesEmployee(103, "Kiran", "MALE", "Pune", 1000.00, 200000.00);
		Employee employee = new Employee(104, "Menaka", "FEMALE", "Cochin", 1000.0);

		Employee[] employees = { manager, salesEmployee1, salesEmployee2, employee };
		for (Employee emp : employees) {
			System.out.println(emp);

			if (emp instanceof Manager) {
				Manager temp = (Manager) emp;
				System.out.println("Employee Count: " + temp.getEmployeeCount());
			}
			
			if (emp instanceof SalesEmployee) {
				SalesEmployee temp = (SalesEmployee) emp;
				System.out.println("Sales Amount: " + temp.getSalesAmount());
			}
		}
	}
}
