package com.cheven.myserver.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloController extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet method");
		ServletConfig config = this.getServletConfig();	
		resp.getWriter().write("Hello, Web!");
		System.out.println(config.getInitParameter("data"));

	}


	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method");
		super.service(arg0, arg1);
	}


	@Override
	public void destroy() {
		System.out.println("destroy method");
	}


	@Override
	public void init() throws ServletException {
		System.out.println("init method");

	}
}
