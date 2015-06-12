package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

public class BeerSelect extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		//out.println("Beer Selection advice<br>");
		String c = request.getParameter("color");
		//out.println("<br>Got the beer color: " + c);
		// Call The Model To Handle
		BeerExpert be = new BeerExpert();
		List<String> res = be.getBrands(c);
		/*
		Iterator<String> iter = res.iterator();
		while(iter.hasNext()){
			out.print("<br>You May Like :" + iter.next());
		}
		*/
		request.setAttribute("styles", res);
		request.setAttribute("adminEmail", getServletConfig().getInitParameter("adminEmail"));
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}
