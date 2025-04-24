package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.training.model.Account;

/**
 * Servlet implementation class AccountControllerServlet
 */
@WebServlet(name = "AccountController", urlPatterns = { "/ACS" })
public class AccountControllerServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	Account account = new Account(1010, "Keerthana", 8000, "Savings")	;
	request.setAttribute("acc", account);
	
	RequestDispatcher dispatcher=request.getRequestDispatcher("AccountOutput.jsp");
	dispatcher.forward(request, response);
	
	}

}
