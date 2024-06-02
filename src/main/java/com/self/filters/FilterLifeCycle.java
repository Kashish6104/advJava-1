package com.self.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
@WebFilter(urlPatterns = {"/FilterLifeCycle","/ServletLifeCycle"})
public class FilterLifeCycle implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("FilterLifeCycle:init()");
	}
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FilterLifeCycle:doFilter()");
		chain.doFilter(request, response);
	}
	
	
	@Override
	public void destroy() {
		System.out.println("FilterLifeCycle:destroy()");
		
	}

}
