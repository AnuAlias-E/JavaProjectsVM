package com.training.ui;

import java.util.Arrays;
import java.util.List;

import com.training.model.Circle;
import com.training.model.CourseItem;

public class Main02 {
	public static void main(String[] args) {
		List<Integer> iList = Arrays.asList(3, 2, 1, 5, 4, 6, 7);
		System.out.println(iList);
		System.out.println("--------------------------------------------------------");
		List<Circle> cList = Arrays.asList(new Circle(10), new Circle(20), new Circle(30), new Circle(15));
		System.out.println(cList);
		System.out.println("--------------------------------------------------------");

		List<CourseItem> courseItems;
		courseItems = Arrays.asList(new CourseItem("Java", 40, 5000), new CourseItem("Jquery", 15, 1500),
				new CourseItem("CSS", 10, 1000), new CourseItem("Spring Boot", 60, 7000));
		System.out.println(courseItems);
		System.out.println("--------------------------------------------------------");

	}
}
