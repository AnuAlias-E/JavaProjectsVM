package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Circle;

public class Main12 {
	public static void main(String[] args) {
		List<Circle> circles = new LinkedList<>();
		circles.add(new Circle(10));
		circles.add(new Circle(200));
		circles.add(new Circle(30));
		circles.add(new Circle(170));
		circles.add(new Circle(23));

		boolean result1 = circles.stream().anyMatch(c -> c.getRadius() > 10);
		System.out.println(result1);

		boolean result2 = circles.stream().allMatch(c -> c.getRadius() > 2);
		System.out.println(result2);

		boolean result3 = circles.stream().noneMatch(c -> c.equals(new Circle(0)));
		System.out.println(result3);

	}
}
