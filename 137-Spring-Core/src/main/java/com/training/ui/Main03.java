package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.HelloWorld;

public class Main03 {
	public static void main(String[] args) {
		HelloWorld helloWorld1;
		HelloWorld helloWorld2;
		HelloWorld helloWorld3;
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		helloWorld1 = (HelloWorld) context.getBean("helloWorldBean");
		System.out.println(helloWorld1);
		helloWorld1.setMessage("Welcome to JSF");
		System.out.println(helloWorld1);

		
		helloWorld2 = (HelloWorld) context.getBean("helloWorldBean");
		helloWorld2.setMessage("Welcome to JS");
		System.out.println(helloWorld2);
		
		helloWorld3 = (HelloWorld) context.getBean("helloWorldBean");
		helloWorld3.setMessage("Welcome to Angular");
		System.out.println(helloWorld3);
		
	}
}
