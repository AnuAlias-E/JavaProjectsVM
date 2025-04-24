package com.training.ui;

import com.training.model.Department;

public class Main12 {
public static void main(String[] args) {
	Department department = new Department("IT", "Manju");
	department.addEmployee(101, "Anju", "Female", "Kochi", 1000);
	department.addEmployee(102, "Arjun", "Male", "Pune", 4000);
	department.addEmployee(103, "Kiran", "Male", "TVM", 3000);
	department.addEmployee(104, "Sara", "Female", "Mumbai", 6000);
	department.addEmployee(105, "Mili", "Female", "Kochi", 5000);
	department.printReport();
	System.out.println("****************************************************************************************");
	System.out.println();
	department.updateEmployee(105, "Keerthu", "Female", "TVM", 40000.00);
	department.printReport();
	department.deleteEmployee(105);
	department.printReport();
//	System.out.println(department.isEmployeePresent(104));
	//System.out.println(department.findByEmployeeId(105));
	
	
}
}
