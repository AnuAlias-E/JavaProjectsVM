package com.training.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.training.model.Student;

public class StudentDAOMySQLImpl implements StudentMySQLDAO {

	@Override
	public boolean insertStudent(Connection connection, Student student) {
		boolean status = false;
		try {
			PreparedStatement statement = connection.prepareStatement(INSERT_QRY);
			statement.setInt(1, student.getRollNumber());
			statement.setString(2, student.getName());
			statement.setString(3, student.getGender() + "");
			statement.setInt(4, student.getMark1());
			statement.setInt(5, student.getMark2());
			int r = statement.executeUpdate();
			if (r > 0)
				status = true;
		} catch (SQLException e) {

			System.err.println(e);
		}
		return status;
	}

	@Override
	public boolean updateStudent(Connection connection, Student student) {
		boolean status = false;
		try {
			PreparedStatement statement = connection.prepareStatement(UPDATE_QRY);

			statement.setString(1, student.getName());
			statement.setString(2, student.getGender() + "");
			statement.setInt(3, student.getMark1());
			statement.setInt(4, student.getMark2());
			statement.setInt(5, student.getRollNumber());
			int r = statement.executeUpdate();
			if (r > 0)
				status = true;
		} catch (SQLException e) {
			System.err.println(e);
		}

		return status;
	}

	@Override
	public boolean deleteStudent(Connection connection, Student student) {
		boolean status = false;
		try {
			PreparedStatement statement = connection.prepareStatement(DELETE_QRY);
			statement.setInt(1, student.getRollNumber());
			int r = statement.executeUpdate();
			if (r > 0)
				status = true;

		} catch (SQLException e) {
			System.err.println(e);
		}

		return status;
	}

	@Override
	public Student findStudentByRollNumber(Connection connection, int rollNumber) {
		Student student = null;
		try {
			PreparedStatement statement = connection.prepareStatement(SEARCH_QRY);
			statement.setInt(1, rollNumber);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				student = new Student();
				student.setRollNumber(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setGender(rs.getString(3).charAt(0));
				student.setMark1(rs.getInt(4));
				student.setMark2(rs.getInt(5));
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		return student;
	}

	@Override
	public List<Student> findAllStudent(Connection connection) {
		List<Student> allStudents = new LinkedList<>();
		try {
			PreparedStatement statement = connection.prepareStatement(FINDALL_QRY);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setRollNumber(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setGender(rs.getString(3).charAt(0));
				student.setMark1(rs.getInt(4));
				student.setMark2(rs.getInt(5));
				allStudents.add(student);

			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		return allStudents;
	}

}
