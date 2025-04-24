package com.training.ui;

import java.io.IOException;

import com.training.model.Student;
import com.training.service.StudentService;
import com.training.service.StudentServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentAddingControllerServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String str_rollNo = request.getParameter("txt_rollNo");
		String str_name = request.getParameter("txt_name");
		String str_gender = request.getParameter("rad_gender");
		String str_mark1 = request.getParameter("txt_mark1");
		String str_mark2 = request.getParameter("txt_mark2");

		int rollNo = Integer.parseInt(str_rollNo);
		String name = str_name;
		char gender = str_gender.charAt(0);
		int mark1 = Integer.parseInt(str_mark1);
		int mark2 = Integer.parseInt(str_mark2);

		Student student = new Student(rollNo, name, gender, mark1, mark2);
		StudentService service = new StudentServiceImpl();
		boolean status = false;
		try {
			status = service.addStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(status);
		if (status) {
			request.setAttribute("add_status", "New Student Added Successfully");
		} else {

			request.setAttribute("add_status", "Student Not Added");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("StudentAddResult.jsp");
		dispatcher.forward(request, response);
	}

}
