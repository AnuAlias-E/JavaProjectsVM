package com.training.ui;

import com.training.model.Student;

public class Main10 {
	public static void main(String[] args)  {
		System.out.println("Program Begins.....");
		Student student = new Student();
		//try {
			student.setMark(20);
		//} catch (RuntimeException e) {
			//System.out.println(e.getMessage());
		//}
			try {
			student.setName("Anu");
			student.setGrade('F');
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends.....");
	}
}
