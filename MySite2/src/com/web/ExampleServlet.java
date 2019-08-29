package com.web;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example")
public class ExampleServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int hitCounter=0;
	
	public void init() {
		System.out.println("init...");
	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.getWriter().append("Served at: ").append(req.getContextPath());
		res.getWriter().print("<html><body><h1>"+(hitCounter++)+"</html></body></h1>");
	}
	
	public void destroy() {
		System.out.println("Bye bye...");
	}

}