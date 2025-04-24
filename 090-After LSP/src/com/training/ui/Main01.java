package com.training.ui;

import com.training.model.Rectangle;
import com.training.model.Shape;
import com.training.model.Square;

public class Main01 {
	public static void main(String[] args) {
		Shape shape = new Rectangle(10, 5);
		System.out.println(shape.getArea());
		shape = new Square(10);
		System.out.println(shape.getArea());
	}
}
