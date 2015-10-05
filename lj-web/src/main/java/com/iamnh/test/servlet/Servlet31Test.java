package com.iamnh.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Servlet31Test", urlPatterns={"/Servlet31Test"},initParams={@WebInitParam(name="t1",value="testValue")}) 
public class Servlet31Test extends HttpServlet{

	private static final long serialVersionUID = -1168839392085653322L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(this.getInitParameter("t1"));
		resp.sendRedirect("test/servlet3_1_test_01.jsp");
	}
	
	
}
