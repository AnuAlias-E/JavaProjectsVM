package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Shape;

public class Main01 {
public static void main(String[] args) {
	Shape shape;
	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

	shape=(Shape) context.getBean("circleBean");
	shape.setSize(10);
	System.out.println(shape.getArea());
	System.out.println(shape);
	
	shape=(Shape) context.getBean("squareBean");
	shape.setSize(10);
	System.out.println(shape.getArea());
	System.out.println(shape);
	
	shape=(Shape) context.getBean("rectangleBean");
	shape.setSize(10);
	System.out.println(shape.getArea());
	System.out.println(shape);
	
	
	
}
}
