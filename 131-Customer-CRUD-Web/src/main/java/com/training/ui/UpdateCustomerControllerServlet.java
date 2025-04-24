package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.training.model.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;


public class UpdateCustomerControllerServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str_customerId = request.getParameter("txt_customerId");
		String str_name = request.getParameter("txt_name");
		String str_balance = request.getParameter("txt_balance");
		String str_email = request.getParameter("txt_email");
		String str_phone = request.getParameter("txt_phone");

		int id = Integer.parseInt(str_customerId);
		String name = str_name;
		double gender = Double.parseDouble(str_balance);
		String  email= str_email;
		String phoneNo = str_phone;

		Customer customer = new Customer(id, name, gender, email, phoneNo);
		CustomerService service = new CustomerServiceImpl();
		boolean status = false;
		try {
			status = service.updateCustomer(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(status);
		if (status) {
			request.setAttribute("update_status", "Updated Customer Successfully");
		} else {

			request.setAttribute("update_status", "Customer not updated");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerUpdateResult.jsp");
		dispatcher.forward(request, response);
	}

}
