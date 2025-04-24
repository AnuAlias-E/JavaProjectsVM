package com.training.ui;

import com.training.dp.Circle;
import com.training.dp.CircleAdapter;
import com.training.dp.Shape;
import com.training.dp.Square;
import com.training.dp.SquareAdapter;

public class Main01 {
	public static void main(String[] args) {
		Shape s = null;
		Circle circle = new Circle(10.0);
		s = new CircleAdapter(circle);
		System.out.println("Area of Circle :" + s.getArea());

		Square square = new Square(15);
		s = new SquareAdapter(square);
		System.out.println("Area of Square: " + s.getArea());
	}
}
