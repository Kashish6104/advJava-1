package com.self.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
@WebFilter("/EvenOddServlet")
public class EvenOddFilters implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String numStr = request.getParameter("number");

		boolean isError = false;

		if (numStr == null || numStr.trim().length() == 0) {
			isError = true;
			request.setAttribute("numError", "Please Enter Number");
		}
				if (isError == true) {
			
			System.out.println("ERROR");
			RequestDispatcher rd = request.getRequestDispatcher("EvenOdd.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("SUCCESS");
			chain.doFilter(request, response);
		}

	}
		
	}


