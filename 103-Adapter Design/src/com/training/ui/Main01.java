package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.dp.CollegeStudent;
import com.training.dp.SchoolStudent;
import com.training.dp.SchoolStudentAdapter;
import com.training.dp.Student;
import com.training.dp.UniversityStudent;
import com.training.dp.UniversityStudentAdapter;

public class Main01 {
	public static void main(String[] args) {
		List<Student> students = new LinkedList<>();
		CollegeStudent cs = new CollegeStudent("Suresh", "Iyer", "suresh@gmail.com");

		students.add(cs);
		System.out.println(students);

		SchoolStudent schoolStudent = new SchoolStudent("Arun", "nair", "arun@gmail.com");
		SchoolStudentAdapter schoolStudentAdapter = new SchoolStudentAdapter(schoolStudent);

		students.add(schoolStudentAdapter);

		System.out.println(students);

		UniversityStudent universityStudent = new UniversityStudent("Anju", "Alias", "anju.alias@gmail.com");

		UniversityStudentAdapter universityStudentAdapter = new UniversityStudentAdapter(universityStudent);
		students.add(universityStudentAdapter);
		System.out.println(students);
	}
}
