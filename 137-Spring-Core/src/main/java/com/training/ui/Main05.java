package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Shape;

public class Main05 {
public static void main(String[] args) {
	Shape circle;
	Shape square;
	Shape rectangle;
	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

	circle=(Shape) context.getBean("circleBean");
	System.out.println(circle);
	System.out.println(circle.getArea());
	
	square=(Shape) context.getBean("squareBean");
	System.out.println(square);
	System.out.println(square.getArea());
	
	rectangle=(Shape) context.getBean("rectangleBean");
	System.out.println(rectangle);
	System.out.println(rectangle.getArea());
}
}
