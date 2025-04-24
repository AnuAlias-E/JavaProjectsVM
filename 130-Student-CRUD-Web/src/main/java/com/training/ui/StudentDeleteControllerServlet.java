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

public class StudentDeleteControllerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str_rollNo = request.getParameter("txt_rollNo");

		int rollNo = Integer.parseInt(str_rollNo);

		StudentService service = new StudentServiceImpl();
		boolean status  = service.deleteStudent(rollNo);
		
		System.out.println(status);
		if (status) {
			request.setAttribute("delete_status", "Deleted Student Successfully");
		} else {

			request.setAttribute("delete_status", "Student not deleted");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("StudentDeleteResult.jsp");
		dispatcher.forward(request, response);
	}

}
