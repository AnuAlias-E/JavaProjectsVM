package com.training.ui;

import com.training.ds.Stack;
import com.training.ds.StackImpl;
import com.training.model.Employee;
import com.training.model.Manager;
import com.training.model.SalesEmployee;

public class Main13 {


	public static void main(String[] args) {
		try {
		Stack<Employee> stack = new StackImpl<>(10);
		stack.push(new Employee(101, "Menaka", "FEMALE", "Cochin", 1000.0));
		stack.push( new Manager(104, "Ram", "MALE", "Mumbai", 5000.00, 12));
		stack.push( new SalesEmployee(102, "Dinesh", "MALE", "Delhi", 3000.00, 100000.00));
		
		
		System.out.println(stack);
		System.out.println("---------------------------");
		Employee employee = stack.pop();
		System.out.println("Removed Element");
		System.out.println(" ID: "+employee.getId()
							+ " , Name: " + employee.getName() 
							+ " , Basic: " + employee.getBasic() 
							+ " , City: " + employee.getCityName() 
							+ " , Gender: " + employee.getGender() 
							+ " , NetSalary: " + employee.getNetSalary() );
		System.out.println("---------------------------");

		System.out.println(stack);
		Employee employee1 = stack.pop();
		System.out.println("---------------------------");
		System.out.println("Removed Element");
	
		System.out.println(" ID: "+employee1.getId()
							+ " , Name: " + employee1.getName() 
							+ " , Basic: " + employee1.getBasic() 
							+ " , City: " + employee1.getCityName() 
							+ " , Gender: " + employee1.getGender() 
							+ " , NetSalary: " + employee.getNetSalary() );
		System.out.println("---------------------------");

		System.out.println(stack);
		Employee employee2 = stack.pop();
		System.out.println("Removed Element");
		System.out.println(" ID: "+employee2.getId()
							+ " , Name: " + employee2.getName() 
							+ " , Basic: " + employee2.getBasic() 
							+ " , City: " + employee2.getCityName() 
							+ " , Gender: " + employee2.getGender() 
							+ " , NetSalary: " + employee2.getNetSalary() );
		System.out.println("---------------------------");
		}catch (Throwable e) {
			System.err.println(e.getMessage());
		}

	}



}
