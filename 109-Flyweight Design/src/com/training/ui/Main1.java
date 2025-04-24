package com.training.ui;

import com.training.dp.Circle;
import com.training.dp.ShapeFactory;

public class Main1 {
	public static void main(String[] args) {
		Circle circle1 = ShapeFactory.getCircle("Green");
		System.out.println(circle1);
		Circle circle2 = ShapeFactory.getCircle("Green");
		System.out.println(circle2);
	}
}
