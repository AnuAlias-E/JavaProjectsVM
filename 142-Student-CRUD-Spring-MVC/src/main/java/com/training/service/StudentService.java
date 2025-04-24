package com.training.service;

import java.util.List;

import com.training.model.Student;

public interface StudentService {
	
		boolean addStudent(Student student);
		Student searchStudent(int rollNumber);
		boolean updateStudent(Student student);
		List<Student> getAllStudents();
		boolean deleteStudent(int rollNumber);
}
