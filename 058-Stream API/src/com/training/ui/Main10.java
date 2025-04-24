package com.training.ui;

import com.training.model.Course;

public class Main10 {
public static void main(String[] args) {
	Course course = new Course("Diploma in Web Development");
	course.addCourseItem("HTML", 40, 4500.00);
	course.addCourseItem("Java", 50, 5500.00);
	course.addCourseItem("CSS", 30, 4500.00);
	course.addCourseItem("JQuery", 20, 14500.00);
	course.addCourseItem("Angular", 15, 1500.00);
	
	System.out.println("Longest Duration Course: "+course.getLongestDurationCourseItem());
	System.out.println("Shortest Duration Course: "+course.getShortestDurationCourseItem());
	
	System.out.println("Highest Priced Course: "+course.getHighestPricedCourseItem());
	System.out.println("Lowest Duration Course: "+course.getLowestPricedCourseItem());
}
}
