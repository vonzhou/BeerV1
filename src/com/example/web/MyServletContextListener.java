package com.example.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// ------------
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext();
		String dogBreed = context.getInitParameter("breed");
		Dog d = new Dog(dogBreed);
		
		context.setAttribute("dog", d);
	}

}
