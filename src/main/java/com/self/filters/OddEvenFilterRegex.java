package com.self.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;


@WebFilter("/EvenOddServlet")
public class OddEvenFilterRegex  implements Filter{

	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("OddEvenFilterRegex :init()");
	}
	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String numStr = request.getParameter("number");
		String numRegEx = "[0-9]+";

		boolean isError = false;

		if (numStr.matches(numRegEx) == false) {
			isError = true;
			request.setAttribute("numError", "Please Enter valid Number");
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
	
	
	@Override
	public void destroy() {
		System.out.println("OddEvenFilterRegex:destroy()");
		
	}


}
