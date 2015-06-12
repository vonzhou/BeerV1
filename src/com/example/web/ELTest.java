package com.example.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ELTest extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String> musicMap = new HashMap<String, String>();
		musicMap.put("Jack", "Take me to your heart");
		musicMap.put("HuanXi", "Fire");
		musicMap.put("Vonzhou", "Sing Like a bird");
		musicMap.put("Luna", "Angel you!");
		musicMap.put("Feng", "Kong");
		
		request.setAttribute("musicMap", musicMap);
		request.setAttribute("vonzhou", "Vonzhou");
		
		RequestDispatcher view = request.getRequestDispatcher("ELresult.jsp");
		view.forward(request, response);
	}

}
