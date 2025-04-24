package com.training.service;

import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;

import com.training.db.ConnectionManager;
import com.training.db.StudentMySQLDAO;
import com.training.db.StudentDAOMySQLImpl;
import com.training.model.Student;

public class StudentServiceImpl implements StudentService {

	private List<Student> allStudents;

	@Override
	public boolean addStudent(Student student) {
		Connection connection = ConnectionManager.createConnection();
		StudentMySQLDAO dao = new StudentDAOMySQLImpl();
		boolean status = dao.insertStudent(connection, student);
		ConnectionManager.closeConnection(connection);
		return status;

	}

	@Override
	public Student searchStudent(int rollnumber) {
		Student student;

		Connection connection = ConnectionManager.createConnection();
		StudentMySQLDAO dao = new StudentDAOMySQLImpl();
		student = dao.findStudentByRollNumber(connection, rollnumber);
		ConnectionManager.closeConnection(connection);
		return student;
	}

	@Override
	public boolean updateStudent(Student student) {
		boolean status = false;
		Connection connection = ConnectionManager.createConnection();
		StudentMySQLDAO dao = new StudentDAOMySQLImpl();
		status = dao.updateStudent(connection, student);
		ConnectionManager.closeConnection(connection);
		return status;

	}

	@Override
	public List<Student> getAllStudents() {
		Connection connection=ConnectionManager.createConnection();
		StudentMySQLDAO dao = new StudentDAOMySQLImpl();
		List<Student>students=dao.findAllStudent(connection);
		ConnectionManager.closeConnection(connection);
		return students;
		
	}

	@Override
	public boolean deleteStudent(int rollNumber) {
		Student student=new Student();
		student.setRollNumber(rollNumber);
		Connection connection=ConnectionManager.createConnection();
		StudentMySQLDAO dao = new StudentDAOMySQLImpl();
		boolean status = dao.deleteStudent(connection, student);
		ConnectionManager.closeConnection(connection);
		return status;

	}

}
