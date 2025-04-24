package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.model.Employee;

import jakarta.validation.Valid;

@Controller
public class EmployeeController {
	@RequestMapping("/emp")
	public ModelAndView f1() {
		ModelAndView mav = new ModelAndView("empOutput");
		Employee employee = new Employee(1001, "Kiran", "Male", "Mumbai", 40000.00);
		mav.addObject("empl",employee);
		return mav;
	}
	
	@RequestMapping("/input")
	public ModelAndView f2() {
		ModelAndView mav = new ModelAndView("empInput");
		Employee employee = new Employee();
		mav.addObject("emp",employee);
		return mav;
	}
	
	
	@RequestMapping("/output")
	public String f3(@ModelAttribute(value="emp") @Valid Employee employee,BindingResult result,Map< String, Object> modelMap) {
		
		System.out.println(result.getAllErrors());
		if(result.hasErrors()) {
		return "empInput";
		}
		else {
			modelMap.put("empl",employee);
			return "empOutput";
		}
		
	}
	
	

	@RequestMapping("/allEmployees")
	public ModelAndView f4(@ModelAttribute(name="emp") Employee employee) {
		
		ModelAndView mav = new ModelAndView("empList");
		
		Employee employee1 = new Employee(1001, "Kiran", "Male", "Mumbai", 40000.00);
		Employee employee2 = new Employee(1002, "Arjun", "Male", "Pune", 35000.00);
		Employee employee3 = new Employee(1003, "Megha", "Female", "Kochi", 60000.00);
		Employee employee4 = new Employee(1004, "Mythri", "Female", "TVM", 55000.00);
		Employee employee5 = new Employee(1005, "Renjith", "Male", "Mumbai", 33000.00);
		
		List<Employee> employeeList= new LinkedList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);		
		employeeList.add(employee5);
		
		mav.addObject("employeeList",employeeList);
		
		return mav;
	}
}
