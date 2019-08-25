package com.wallmart.ourapplication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class OurFirstServlet extends HttpServlet {

	private static int i = 0;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	
		String responseText = "Hello " + i + "  times.";

		resp.getOutputStream().write(responseText.getBytes());

		i++;
	}
	
	

}
