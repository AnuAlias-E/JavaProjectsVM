package com.training.ui;

import com.training.model.Course;

public class Main12 {
public static void main(String[] args) {
	Course course = new Course("Diploma in Web Development");
	course.addCourseItem("HTML", 40, 4500.00);
	course.addCourseItem("Java", 40, 5500.00);
	course.addCourseItem("CSS", 30, 4500.00);
	course.addCourseItem("JQuery", 20, 4500.00);
	course.addCourseItem("Angular", 15, 4500.00);
	course.printCourseDetails();
}
}
