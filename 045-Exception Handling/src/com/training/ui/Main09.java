package com.training.ui;

import com.training.model.Employee;

public class Main09 {
public static void main(String[] args)  {
	System.out.println("Program Begins.....");
//	System.out.println(100/0);
	Employee employee =new Employee();

	try {
		employee.setBasicSalary(-1000.00);
	} catch (Exception e) {
		e.printStackTrace();
	}	
//	}catch (RuntimeException e) {
///		System.out.println(e.getMessage());
	//}
	System.out.println(employee.computeAllowance());
	System.out.println("Program Ends.....");
	
	
}
}
