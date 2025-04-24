package com.training.ui;

import java.util.HashMap;
import java.util.Map;

import com.training.model.Employee;

public class Main03 {
public static void main(String[] args) {

	
	Map<Integer, Employee> empMap = new HashMap<>();

	Employee e1 = new Employee(101, "Ram", "Male", "COC", 1000.00);
	Employee e2 = new Employee(102, "Saranya", "Female", "TVM", 2000.00);
	Employee e3 = new Employee(103, "Lakshmi", "Female", "BNGLR", 3000.00);
	Employee e4 = new Employee(104, "Vicky", "Male", "COC", 4000.00);
	Employee e5 = new Employee(105, "Reshmi", "Female", "TVM", 5000.00);
	

	
	empMap.put(Integer.valueOf(4), e4);
	empMap.put(Integer.valueOf(1), e1);
	empMap.put(2, e2);
	empMap.put(Integer.valueOf(3), e3);

	empMap.put(Integer.valueOf(5), e5);

	System.out.println(empMap);
	
	for(Map.Entry<Integer, Employee>entry:empMap.entrySet()) {
		System.out.println(entry.getKey());
		Employee e=entry.getValue();
		System.out.println(e.getName()+"-"+e.getNetSalary());
		
		
	}

	

}
}
