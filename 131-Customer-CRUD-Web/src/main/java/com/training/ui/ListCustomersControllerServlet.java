package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.training.model.Customer;
import com.training.service.CustomerService;
import com.training.service.CustomerServiceImpl;


public class ListCustomersControllerServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerService service = new CustomerServiceImpl();
		List<Customer>allCustomers= service.getAllCustomers();
		
		request.setAttribute("customers", allCustomers);
		RequestDispatcher dispatcher = request.getRequestDispatcher("DisplayAllCustomers.jsp");
		dispatcher.forward(request, response);
	}

}
