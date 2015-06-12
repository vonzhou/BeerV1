package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextLock extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Test Context Attribute Synchronization<br>");
		
		synchronized(getServletContext()){
			getServletContext().setAttribute("foo", 33);
			getServletContext().setAttribute("bar", 88);
			out.println(getServletContext().getAttribute("foo"));
			out.println(getServletContext().getAttribute("bar"));
		}
	}
}
