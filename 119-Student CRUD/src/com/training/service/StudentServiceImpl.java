package com.training.service;

import java.sql.Connection;
import java.util.LinkedList;
import java.util.List;

import com.training.db.ConnectionManager;
import com.training.db.StudentDAOMySQL;
import com.training.db.StudentDAOMySQLImpl;
import com.training.model.Student;

public class StudentServiceImpl implements StudentService {

	private List<Student> students;

	public StudentServiceImpl() {
		super();
		this.students = new LinkedList<Student>();
	}

	@Override
	public boolean addStudent(Student student) throws Exception {
		Connection connection = ConnectionManager.createConnection();
		StudentDAOMySQL dao = new StudentDAOMySQLImpl();
		boolean status = dao.insertStudent(connection, student);
		ConnectionManager.closeConnection(connection);
		return status;

	}

	@Override
	public Student searchStudent(int rollNumber) {
		Student student;
		Connection connection = ConnectionManager.createConnection();
		StudentDAOMySQL dao = new StudentDAOMySQLImpl();
		student = dao.findStudentByRollNumber(connection, rollNumber);
		ConnectionManager.closeConnection(connection);
		return student;
	}

	@Override
	public boolean updateStudent(Student student) throws Exception {
		Connection connection = ConnectionManager.createConnection();
		StudentDAOMySQL dao = new StudentDAOMySQLImpl();
		boolean status = dao.updateStudent(connection, student);
		ConnectionManager.closeConnection(connection);
		return status;

	}

	@Override
	public List<Student> getAllStudents() {
		Connection connection = ConnectionManager.createConnection();
		StudentDAOMySQL dao = new StudentDAOMySQLImpl();
		students = dao.findAllStudents(connection);
		ConnectionManager.closeConnection(connection);
		return students;
	}

	@Override
	public boolean deleteStudent(int rollNumber) {
		Student student = new Student();
		student.setRollNumber(rollNumber);
		Connection connection = ConnectionManager.createConnection();
		StudentDAOMySQL dao = new StudentDAOMySQLImpl();
		boolean status = dao.deleteStudent(connection, student);
		ConnectionManager.closeConnection(connection);
		return status;
	}

}
