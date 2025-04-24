package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Circle;

public class Main02 {
	public static void main(String[] args) {
		List<Integer> iList = new LinkedList<>();

		iList.add(Integer.valueOf(200));
		iList.add(Integer.valueOf(10));
		iList.add(Integer.valueOf(150));
		iList.add(Integer.valueOf(75));
		iList.add(Integer.valueOf(80));

		iList.stream()// Create a pipeline
				.sorted()// Intermediate Operation, after this operation, it will go the pipeline
				.filter(i -> i >= 100)// Predicate as argument that is test() method
				.forEach((i) -> System.out.println(i));// Terminal Operation

		List<String> cities = new LinkedList<>();
		cities.add("Pune");
		cities.add("Patna");
		cities.add("Kolkatta");
		cities.add("Cochin");

		cities
		.stream()
		.sorted()
		.filter(c->c.length()>=6)
		.forEach(city -> System.out.println(city));
		
		
		List<Circle> circles = new LinkedList<>();
		circles.add(new Circle(10));
		circles.add(new Circle(200));
		circles.add(new Circle(30));
		circles.add(new Circle(170));
		circles.add(new Circle(23));
		
		circles
		.stream()
		.filter(c->c.getRadius()>=100)
		.forEach(c->System.out.println(c.getRadius()+","+c.getArea()));
		
		

	}
}
