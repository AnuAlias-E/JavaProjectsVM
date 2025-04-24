package com.training.model;

import java.util.List;

public interface StudentService {
	void addStudent(Student student) throws Exception;

	Student searchStudent(int rollNumber);

	void updateStudent(Student student) throws Exception;

	List<Student> getAllStudents();

	void deleteStudent(int rollNumber);

}
