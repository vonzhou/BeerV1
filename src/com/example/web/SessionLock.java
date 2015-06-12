package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionLock extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Test HTTP Session Attribute Synchronization<br>");
		HttpSession session = req.getSession();
		
		synchronized(session){
			session.setAttribute("foo", "78");
			session.setAttribute("bar", "88");
			out.println(session.getAttribute("foo"));
			out.println(session.getAttribute("bar"));
		}
	}
}
