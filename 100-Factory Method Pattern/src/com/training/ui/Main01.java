package com.training.ui;

import com.training.model.Shape;
import com.training.model.ShapeFactory;

public class Main01 {
	public static void main(String[] args) {
		Shape shape = ShapeFactory.createShape(1);
		shape.setSize(10);
		System.out.println("Area of Circle : " + shape.getArea());
		System.out.println("--------------------------------------------");
		shape = ShapeFactory.createShape(2);
		shape.setSize(10);
		System.out.println("Area of Square : " + shape.getArea());
		System.out.println("--------------------------------------------");
		shape = ShapeFactory.createShape(3);
		shape.setSize(10);
		System.out.println("Area of Rectangle : " + shape.getArea());
	}
}
