package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Employee;

public class Main07 {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	Employee employee = (Employee)context.getBean("employeeBean");
	System.out.println(employee);
}
}
