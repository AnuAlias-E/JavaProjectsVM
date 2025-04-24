package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.SalesEmployee;

public class Main14 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SalesEmployee salesEmployee = (SalesEmployee) context.getBean("salesEmployeeBean");
		System.out.println(salesEmployee);
	}
}
