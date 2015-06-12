package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieCheck extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		Cookie[] cookies = req.getCookies();
		
		if(cookies == null)
			out.println("Cookie is NULL");
		else{
			for(int i=0; i<cookies.length; i++){
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("username")){
					String username = cookie.getValue();
					out.println("Hello " + username + ", Welcome to our Home.");
					break;
				}
			}
		}
	}
}
