package com.self.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("ServletLifeCycle:init()");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("ServletLifeCycle:service()");
	}
	
	@Override
	public void destroy() {
		System.out.println("ServletLifeCycle:destroy()");
	}
	
}
