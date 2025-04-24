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


public class CustomerAddingControllerServlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String str_id = request.getParameter("txt_id");
			String str_name = request.getParameter("txt_name");
			String str_balance = request.getParameter("txt_balance");
			String str_email = request.getParameter("txt_email");
			String str_phoneNo = request.getParameter("txt_phoneNo");

			int customerId = Integer.parseInt(str_id);
			String name = str_name;
			double balance = Double.parseDouble(str_balance);
			String email = str_email;
			String phoneNo = str_phoneNo;

			Customer customer = new Customer(customerId, name, balance, email, phoneNo);
			CustomerService service = new CustomerServiceImpl();
			boolean status = false;
			try {
				status = service.addCustomer(customer);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(status);
			if (status) {
				request.setAttribute("add_status", "New Customer Added Successfully");
			} else {

				request.setAttribute("add_status", "Customer Not Added");
			}

			RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerAddResult.jsp");
			dispatcher.forward(request, response);
	}

}
