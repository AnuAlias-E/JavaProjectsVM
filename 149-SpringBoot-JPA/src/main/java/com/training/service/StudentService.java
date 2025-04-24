package com.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.db.StudentRepository;
import com.training.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository repo;

	public Student addStudent(Student student) {
		Student s = repo.save(student);
		return s;
	}

	public Student updateStudent(Student student) {
		Student s = repo.save(student);
		return s;
	}

	public void deleteStudent(Student student) {
		repo.delete(student);
	}

	public Student searchStudent(int rollNumber) {
		Optional<Student> optional = repo.findById(rollNumber);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}
	}

	public List<Student> getAllStudents(){
		return repo.findAll();
	}
	
}
