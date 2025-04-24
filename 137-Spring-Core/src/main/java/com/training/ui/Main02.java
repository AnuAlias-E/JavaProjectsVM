package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.HelloWorld;

public class Main02 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorldBean");
		System.out.println(helloWorld);
		helloWorld.setMessage("Spring Framwork manages objects using dependency injection");
		System.out.println(helloWorld);
		System.out.println(helloWorld.getMessage());
	}
}
