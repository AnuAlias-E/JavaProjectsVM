package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.training.model.Student;
import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;


public class ListStudentsControllerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService service = new StudentServiceImpl();
		List<Student>allStudents= service.getAllStudents();
		
		request.setAttribute("studs", allStudents);
		RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayAllStudents.jsp");
		dispatcher.forward(request, response);
	}

}
