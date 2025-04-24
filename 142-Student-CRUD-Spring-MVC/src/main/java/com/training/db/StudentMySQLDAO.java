package com.training.db;

import java.sql.Connection;
import java.util.List;

import com.training.model.Student;

public interface StudentMySQLDAO {
	
	String INSERT_QRY="insert into students values(?,?,?,?,?)";
	String UPDATE_QRY="update students set name=?, gender=?,mark1=?,mark2=? where rollnumber=?";
	String DELETE_QRY="delete from students where rollnumber=?";
	String SEARCH_QRY="select * from students where rollnumber=?";
	String FINDALL_QRY="Select * from students";
	
	boolean insertStudent(Connection connection,Student student);
	boolean updateStudent(Connection connection,Student student);
	boolean deleteStudent(Connection connection,Student student);
	Student findStudentByRollNumber(Connection connection,int rollNumber);
	List<Student>findAllStudent(Connection connection);
	
	

}
