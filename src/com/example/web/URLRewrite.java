package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class URLRewrite extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
		
		boolean b = session.isNew();
		
		out.println("<html><body>Test URL Rewriting<br>");
		out.println(b);
		out.println("<br><a href=\"" + resp.encodeRedirectUrl("/BeerV1/form.html") + "\">click me</a>");
		out.println("</body></html>");
		out.println();
		
	}
}
