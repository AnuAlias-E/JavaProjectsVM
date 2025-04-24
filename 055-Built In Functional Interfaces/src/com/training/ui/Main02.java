package com.training.ui;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import com.training.model.BillItem;
import com.training.model.Circle;
import com.training.model.Course;
import com.training.model.CourseItem;
import com.training.model.Department;
import com.training.model.Employee;

public class Main02 {
	static void process(Consumer<Circle> c) {
		Circle circle = new Circle(20);
		c.accept(circle);
	}
	
	static void process1(Consumer<Department> d) {
		Department department = new Department("IT", "Kiran");

		department.addEmployee(101, "Anju", "Female", "Kochi", 2000.00);
		department.addEmployee(102, "Nivedha", "Female", "Delhi", 1000.00);
		department.addEmployee(103, "Shyam", "Male", "Mumbai", 3000.00);
		department.addEmployee(104, "Dinesh", "Male", "Mumbai", 4000.00);
		department.addEmployee(105, "Sandhya", "Female", "Kochi", 6000.00);
		
		d.accept(department);
	}
	
	static void process2(Consumer<Course> c) {
		Course course = new Course("Diploma in Web Development");
		course.addCourseItem("HTML", 40, 4500.00);
		course.addCourseItem("Java", 40, 5500.00);
		course.addCourseItem("CSS", 30, 4500.00);
		course.addCourseItem("JQuery", 20, 4500.00);
		course.addCourseItem("Angular", 15, 4500.00);
		c.accept(course);
	}
	
	static void process3(Consumer<Course> c) {
		Course course = new Course("Diploma in Web Development");
		course.addCourseItem("HTML", 40, 4500.00);
		course.addCourseItem("Java", 40, 5500.00);
		course.addCourseItem("CSS", 30, 4500.00);
		course.addCourseItem("JQuery", 20, 4500.00);
		course.addCourseItem("Angular", 15, 4500.00);
		c.accept(course);
	}

	public static void main(String[] args) {
		Consumer<BillItem> consumer1;
		consumer1 = bi -> System.out.println(bi.getItemName() + "," + bi.getItemValue());
		consumer1.accept(new BillItem("OPPO", 2, 30000.00));

		Consumer<Department> consumer2;
		consumer2 = d -> System.out.println(d.getName() + "\n" + d.getManagerName());

		consumer2.accept(new Department("Accounts", "Anu"));

		Department department = new Department("IT", "Kiran");

		department.addEmployee(101, "Anju", "Female", "Kochi", 2000.00);
		department.addEmployee(102, "Nivedha", "Female", "Delhi", 1000.00);
		department.addEmployee(103, "Shyam", "Male", "Mumbai", 3000.00);
		department.addEmployee(104, "Dinesh", "Male", "Mumbai", 4000.00);
		department.addEmployee(105, "Sandhya", "Female", "Kochi", 6000.00);

		Consumer<Department> consumer3;
		consumer3 = d -> {
			List<Employee> empList = d.getEmployees();
			double sum = 0.0;
			for (Employee e : empList) {
				sum += e.getBasic();
			}
			System.out.println("Total Salary: " + sum);

		};
		consumer3.accept(department);

		Consumer<Department> consumer4;
		consumer4 = d -> d.printReport();
		consumer4.accept(department);

		Course course = new Course("Diploma in Web Development");
		course.addCourseItem("HTML", 40, 4500.00);
		course.addCourseItem("Java", 40, 5500.00);
		course.addCourseItem("CSS", 30, 4500.00);
		course.addCourseItem("JQuery", 20, 4500.00);
		course.addCourseItem("Angular", 15, 4500.00);
		Consumer<Course> consumer5;
		consumer5 = c -> c.printCourseDetails();
		consumer5.accept(course);

		Consumer<Circle> consumer6;
		consumer6 = c -> System.out.println(c.getRadius() + "," + c.getArea());
		process(consumer6);// calling the function process function by passing another function

		process((c) -> System.out.println(c.getRadius() + "," + c.getArea()));//function passing as an argument
		
		process1(d->d.printReport());//functional programming
		
		process2(crs->crs.printCourseDetails());
		System.out.println("---------------------------------");
		process3(crs->{
			int totalDuration=0;
			Set<CourseItem> courseSet=crs.getCourseItems();
			for(CourseItem courseItem : courseSet) {
				totalDuration+=courseItem.getDurationInHours();
			}
			System.out.println("Total Duration: "+totalDuration);
			});

	}
}
