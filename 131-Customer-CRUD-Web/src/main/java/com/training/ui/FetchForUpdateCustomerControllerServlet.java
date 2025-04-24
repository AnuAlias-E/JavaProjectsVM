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


public class FetchForUpdateCustomerControllerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str_customerId=request.getParameter("txt_customerId");
		int customerId=Integer.parseInt(str_customerId);
		CustomerService service = new CustomerServiceImpl();
		Customer customer = service.searchCustomer(customerId);
		request.setAttribute("customer", customer);
		RequestDispatcher dispatcher = request.getRequestDispatcher("EditCustomer.jsp");
		dispatcher.forward(request, response);
	}

}
