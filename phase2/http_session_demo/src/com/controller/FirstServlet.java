package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/*
		 * request.getSession() or request.getSession(true) will create a new session
		 * for the user so technically that should be used in the entry page of our
		 * application and only once.
		 * 
		 * request.getSession(false) will not create a new session and if there is
		 * existing session which is running for the user that particular servlet/jsp
		 * will participate in that session.
		 */
		HttpSession session = request.getSession();
		User user = new User();

		user.setFname(request.getParameter("fname"));
		user.setLname(request.getParameter("lname"));
		user.setContact(Long.parseLong(request.getParameter("contact")));
		user.setCity(request.getParameter("city"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setEmail(request.getParameter("email"));
		
		session.setAttribute("user", user);

		response.sendRedirect("two.html");

	}

}
