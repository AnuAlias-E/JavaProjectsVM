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

public class UpdateStudentControllerServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

		Student student = new Student();
		student.setRollNumber(rollNo);
		student.setName(name);
		student.setMark1(mark1);
		student.setMark2(mark2);
		student.setGender(gender);
		StudentService service = new StudentServiceImpl();
		boolean status = false;
		try {
			status = service.updateStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(status);
		if (status) {
			request.setAttribute("update_status", "Updated Student Successfully");
		} else {

			request.setAttribute("update_status", "Student not updated");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("StudentUpdateResult.jsp");
		dispatcher.forward(request, response);
	}

}
