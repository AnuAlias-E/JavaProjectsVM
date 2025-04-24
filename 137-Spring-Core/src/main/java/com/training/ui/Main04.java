package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Student;

public class Main04 {
public static void main(String[] args) {
	Student student1;
	Student student2;
	Student student3;
	
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	student1 = (Student)context.getBean("studentBean");
	student1.setRollNo(1001);
	System.out.println("RollNo of Student1: "+student1.getRollNo());
	
	student2 = (Student)context.getBean("studentBean");
	student2.setRollNo(1002);
	System.out.println("RollNo of Student2: "+student2.getRollNo());
	
	student3 = (Student)context.getBean("studentBean");
	student3.setRollNo(1003);
	System.out.println("RollNo of Student3: "+student3.getRollNo());
}
}
