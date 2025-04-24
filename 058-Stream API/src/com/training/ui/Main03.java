package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Employee;

public class Main03 {
public static void main(String[] args) {
	Employee e1= new Employee(101, "Anu", "Female", "Mumbai", 1000.00);
	Employee e2= new Employee(102, "Anju", "Female", "TVM", 30000.00);
	Employee e3= new Employee(103, "Meera", "Female", "Mumbai", 20000.00);
	Employee e4= new Employee(104, "Arun", "Male", "Chennai", 1000.00);
	Employee e5= new Employee(105, "Arjun", "Male", "Pune", 33000.00);
	Employee e6= new Employee(106, "Meethi", "Female", "Cochin", 1000.00);
	Employee e7= new Employee(107, "Parvathi", "Female", "TVM", 24000.00);
	Employee e8= new Employee(108, "Vivek", "Male", "Chennai", 56000.00);
	Employee e9= new Employee(109, "Sinoj", "Male", "Hyderbad", 1000.00);
	Employee e10= new Employee(110, "Anna", "Female", "Kochi", 2000.00);
	Employee e11= new Employee(111, "Alok", "Male", "Chennai", 1000.00);
	
	List<Employee> employees=new LinkedList<>();
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
	System.out.println("-----------------------------------------------------------");
	System.out.println("Employee List in Chennai");
	employees.stream()
	.sorted()
	.filter(e->e.getCityName().equalsIgnoreCase("Chennai"))
	.forEach(e->System.out.println(e));
	System.out.println("-----------------------------------------------------------");
	System.out.println("Male Employee List");
	employees.stream()
	.sorted()
	.filter(e->e.getGender().equalsIgnoreCase("male"))
	.forEach(e->System.out.println(e));
	System.out.println("----------------------------------------------------------");
	System.out.println("Female Employee List");
	employees.stream()
	.sorted()
	.filter(e->e.getGender().equalsIgnoreCase("Female"))
	.forEach(e->System.out.println(e));
	System.out.println("---------------------------------------------------------");
	System.out.println("Employee List whose salary above 20000");
	employees.stream()
	.sorted()
	.filter(e->e.getBasic()>=20000.00)
	.forEach(e->System.out.println(e));
}
}
