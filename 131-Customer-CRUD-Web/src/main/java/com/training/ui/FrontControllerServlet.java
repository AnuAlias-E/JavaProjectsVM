package com.training.ui;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FrontController", urlPatterns = { "*.do" })
public class FrontControllerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestedUri=request.getRequestURI();
		System.out.println("---------------------------------------------------");
		System.out.println(requestedUri);
		System.out.println("---------------------------------------------------");
		System.out.println(request.getPathInfo());
		
		int positionOfSlash=requestedUri.lastIndexOf("/");
		System.out.println(positionOfSlash);
		String s1= requestedUri.substring(positionOfSlash+1);
		System.out.println(s1);
		int positionOfDot=s1.lastIndexOf(".");
		String s2= s1.substring(0,positionOfDot);
		System.out.println(s2);
	
		
		
		RequestDispatcher dispatcher =request.getRequestDispatcher(s2);
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
