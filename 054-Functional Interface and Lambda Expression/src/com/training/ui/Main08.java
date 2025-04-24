package com.training.ui;

import com.training.model.Account;
import com.training.model.Circle;
import com.training.model.Employee;
import com.training.model.Tester;

public class Main08 {
	public static void main(String[] args) {
		Tester<Circle> tester1;
		tester1 = c -> c.getArea() > 100;
		System.out.println(tester1.test(new Circle(10)));
		System.out.println("-----------------------------");
		Tester<Account> tester2;
		tester2 = acc -> acc.getBalance() > 1000.00;
		System.out.println(tester2.test(new Account("Account", 3000.00)));

		System.out.println("-----------------------------");
		Tester<Employee> tester3;
		tester3 = emp -> emp.getCityName().equalsIgnoreCase("Mumbai");
		System.out.println(
				"Employee is from Mumbai: " + tester3.test(new Employee(101, "Kiran", "Male", "mumbai", 10000.00)));
		System.out.println("-----------------------------");
		Tester<Employee> tester4;
		tester4 = emp -> emp.getGender().equalsIgnoreCase("female");
		System.out.println("Female Employee: " + tester4.test(new Employee(102, "Ram", "Male", "Kochi", 23000.00)));

		System.out.println("-----------------------------");
		Tester<Employee> tester5;
		tester5 = emp -> emp.getNetSalary() > 50000.00;
		System.out.println("Employee Net Salary is greater than 50000.00: "
				+ tester5.test(new Employee(103, "Nicky", "Female", "TVM", 44000.00)));

	}
}
