package com.training.ui;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.training.model.Employee;
import com.training.model.comparators.EmployeeBasicSalaryAscendingCompartor;

public class Main01 {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Anu", "Female", "Mumbai", 1000.00);
		Employee e2 = new Employee(102, "Anju", "Female", "TVM", 30000.00);
		Employee e3 = new Employee(103, "Meera", "Female", "Mumbai", 20000.00);
		Employee e4 = new Employee(104, "Arun", "Male", "Chennai", 7000.00);
		Employee e5 = new Employee(105, "Arjun", "Male", "Pune", 33000.00);
		Employee e6 = new Employee(106, "Meethi", "Female", "Cochin", 9000.00);
		Employee e7 = new Employee(107, "Parvathi", "Female", "TVM", 24000.00);
		Employee e8 = new Employee(108, "Vivek", "Male", "Chennai", 56000.00);
		Employee e9 = new Employee(109, "Sinoj", "Male", "Hyderbad", 11000.00);
		Employee e10 = new Employee(110, "Anna", "Female", "Cochin", 2000.00);
		Employee e11 = new Employee(111, "Alok", "Male", "Chennai", 17000.00);

		List<Employee> employees = new LinkedList<>();
		employees.add(e1);
		employees.add(e2);

		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		employees.add(e9);
		employees.add(e10);

		employees.add(e11);
		System.out.println(employees);
		System.out
				.println("-------------------------------------------------------------------------------------------");
		Collections.sort(employees);

		System.out.println(employees);
		System.out
				.println("-------------------------------------------------------------------------------------------");

		Collections.sort(employees, new EmployeeBasicSalaryAscendingCompartor());

		System.out.println(employees);
		System.out
				.println("-------------------------------------------------------------------------------------------");

		Employee minEmp = Collections.min(employees, new EmployeeBasicSalaryAscendingCompartor());
		System.out.println(minEmp);

		System.out
				.println("-------------------------------------------------------------------------------------------");
		Employee maxEmp = Collections.max(employees, new EmployeeBasicSalaryAscendingCompartor());
		System.out.println(maxEmp);

		System.out
				.println("-------------------------------------------------------------------------------------------");

		Object[] array = employees.toArray();
		for (Object obj : array) {
			System.out.println(obj.toString());
			Employee e = (Employee) obj;
			System.out.println("Net Salary : " + e.getNetSalary());
		}

	}
}
