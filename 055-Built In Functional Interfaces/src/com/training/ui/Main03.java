package com.training.ui;

import java.util.function.Predicate;

import com.training.model.Circle;
import com.training.model.Course;
import com.training.model.Department;
import com.training.model.Square;

public class Main03 {

	static void process1(Predicate<Circle> predicate) {
		Circle c = new Circle(20);
		System.out.println(predicate.test(c));
	}

	static void process2(Predicate<Square> predicate) {
		Square square = new Square(20);
		System.out.println(predicate.test(square));
	}

	static void process3(Predicate<Department> predicate) {
		Department department = new Department("IT", "Kiran");

		department.addEmployee(101, "Anju", "Female", "Kochi", 2000.00);
		department.addEmployee(102, "Nivedha", "Female", "Delhi", 1000.00);
		department.addEmployee(103, "Shyam", "Male", "Mumbai", 3000.00);
		department.addEmployee(104, "Dinesh", "Male", "Mumbai", 4000.00);
		department.addEmployee(105, "Sandhya", "Female", "Kochi", 6000.00);
		System.out.println(predicate.test(department));
	}

	static void process4(Predicate<Course> predicate) {
		Course course = new Course("Diploma in Web Development");
		course.addCourseItem("HTML", 40, 4500.00);
		course.addCourseItem("Java", 40, 5500.00);
		course.addCourseItem("CSS", 30, 4500.00);
		course.addCourseItem("JQuery", 20, 4500.00);
		course.addCourseItem("Angular", 15, 4500.00);
		System.out.println(predicate.test(course));
	}

	public static void main(String[] args) {
		process1(circle -> circle.getRadius() >= 10);
		process2(square -> square.getSize() >= 50);
		process3(department -> department.getEmployees().size() >= 10);
		process4(course -> course.getCourseItems().size() >= 3);

	}
}
