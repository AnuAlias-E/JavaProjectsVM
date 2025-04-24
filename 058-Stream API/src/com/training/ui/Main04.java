package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Employee;

public class Main04 {
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
		Employee e10 = new Employee(110, "Anna", "Female", "Kochi", 2000.00);
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

		System.out.println("Employees Basic Salary");
		employees
		.stream()
		.map(e -> e.getBasic())
		.forEach(b -> System.out.println(b));

		System.out.println("Employees City Names");
		employees
		.stream()
		.map(e -> e.getCityName().toUpperCase())
		.forEach(cn -> System.out.println(cn));
		
		
		System.out.println("Employees Gender");
		employees
		.stream()
		.map(e -> e.getGender().toUpperCase())
		.forEach(ge -> System.out.println(ge));
		
		
		System.out.println("Employees Net Salary");
		employees
		.stream()
		.mapToDouble(e->e.getNetSalary())
		.forEach(d->System.out.println(d));
		
		
		
	}
}
