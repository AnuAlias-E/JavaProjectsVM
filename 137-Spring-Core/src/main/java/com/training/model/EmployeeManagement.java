package com.training.model;

import java.util.LinkedList;
import java.util.List;

public class EmployeeManagement {
List<Employee> employees;
public void initialize() {
	employees= new LinkedList<>();
	System.out.println("Intialising employees");
	
}

public void cleanUp() {
	this.employees.clear();
	this.employees=null;
	System.out.println("Clearing employees");
}

@Override
public String toString() {
	return "EmployeeManagement [employees=" + employees + "]";
}
}
