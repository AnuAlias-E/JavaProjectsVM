package com.training.ui;

import java.util.Collection;
import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.model.Employee;

@Controller
@RequestMapping(value = "/employees")
public class EmployeeController {
	
	
	@GetMapping(value = "/display")
	public String f1(Model model) {
		
		Employee employee = new Employee(1088, "Anu Alias", 35000.0,"Female");
		model.addAttribute("emp", employee);
		return "EmployeeDisplay";
	}
	
	@GetMapping(value = "/listing")
	public String f2(Model model) {
		
		Employee e1 = new Employee(1088, "Anu Alias", 35000.0,"Female");
		Employee e2 = new Employee(1089, "Mathew", 22000.0,"Male");
		Employee e3 = new Employee(1090, "Anju Sebastain", 65000.0,"Female");
		Employee e4 = new Employee(1091, "Arun Thomas", 75000.0,"Male");
		Employee e5 = new Employee(1092, "Felix Cletus", 45000.0,"Male");
		Employee e6 = new Employee(1093, "Athira B", 47000.0,"Female");
		Collection<Employee> employees=new LinkedList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		model.addAttribute("emps", employees);
		return "EmployeesListing";
		
		
	}
}
