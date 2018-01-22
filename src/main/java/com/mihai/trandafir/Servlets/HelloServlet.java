package com.mihai.trandafir.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1336768530004254101L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print("Hello");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("a pornit servletul " + this.getServletName());
	}

	@Override
	public void destroy() {
		System.out.println("a fost oprit servletul " + this.getServletName());
	}
}
