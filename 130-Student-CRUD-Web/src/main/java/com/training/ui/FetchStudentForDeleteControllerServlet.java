package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.training.model.Student;
import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;

public class FetchStudentForDeleteControllerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str_rollNo=request.getParameter("txt_rollNo");
		int rollNo=Integer.parseInt(str_rollNo);
		StudentService service = new StudentServiceImpl();
		Student student = service.searchStudent(rollNo);
		request.setAttribute("stud", student);
		RequestDispatcher dispatcher = request.getRequestDispatcher("DeleteStudent.jsp");
		dispatcher.forward(request, response);
	}

}
