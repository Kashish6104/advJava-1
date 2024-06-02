package com.self.controller;

import java.io.IOException;
import java.util.StringTokenizer;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/EvenOddServlet")
public class EvenOddServlet  extends HttpServlet{

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  n = request.getParameter("number");
		
		Integer num = Integer.parseInt(n);
		
		if(num%2 ==0) {
			request.setAttribute("msg", "Even");
		}else {
			request.setAttribute("msg", "Odd");
		}
		
		request.setAttribute("num", num);
		
		RequestDispatcher rd =  request.getRequestDispatcher("PrintEvenOdd.jsp");
			rd.forward(request, response);
		
		
	}

	
}
