package com.training.dp;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static final Map<String, Circle> circlesMap = new HashMap<>();

	public static Circle getCircle(String color) {
		Circle circle = (Circle) circlesMap.get(color);
		if (circle == null) {
			circle = new Circle(color);
			circlesMap.put(color, circle);
			System.out.println("Creating circle of color: " + color);
		}
		return circle;
	}
}
