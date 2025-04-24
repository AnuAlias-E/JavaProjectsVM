package com.training.ui;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.config.MyConfiguration1;
import com.training.config.MyConfiguration2;
import com.training.model.Address;
import com.training.model.Customer;
import com.training.model.Employee;
import com.training.model.HelloWorld;

public class Main01 {
	public static void main(String[] args) {
		//AnnotationConfigApplicationContext context ;
		ConfigurableApplicationContext context;
		context= new AnnotationConfigApplicationContext(MyConfiguration1.class);
		
		HelloWorld helloWorld1 = (HelloWorld) context.getBean("f1");
		System.out.println(helloWorld1);
		
		helloWorld1.setMessage("welcome");
		System.out.println(helloWorld1);
		
		HelloWorld helloWorld2 = (HelloWorld) context.getBean("f1");
		System.out.println(helloWorld2);
		
		Employee employee = (Employee) context.getBean("f2");
		System.out.println(employee);
		
		context= new AnnotationConfigApplicationContext(MyConfiguration2.class);
		Address address = (Address) context.getBean("ChennaiAddress");
		System.out.println(address);
		
		Customer customer = (Customer) context.getBean("f4");
		System.out.println(customer);
		
		context.close();
	}

}
