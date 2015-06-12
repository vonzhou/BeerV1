package com.example.web;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class BeerSessionCounter implements HttpSessionListener{
	
	private static int activeSessions;

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		activeSessions++;
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		activeSessions--;
	}

}
