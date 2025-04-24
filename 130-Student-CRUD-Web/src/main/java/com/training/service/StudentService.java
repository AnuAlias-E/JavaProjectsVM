package com.training.service;

import java.util.List;

import com.training.model.Student;

public interface StudentService {
	boolean addStudent(Student student) throws Exception;

	Student searchStudent(int rollNumber);

	boolean updateStudent(Student student) throws Exception;

	List<Student> getAllStudents();

	boolean deleteStudent(int rollNumber);

}
