package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SecondServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		HttpSession session = request.getSession(false);//will not create new session it will participate in existing session
		if (session != null) {
			User user = (User) session.getAttribute("user");
			user.setQualification(request.getParameter("qualification"));
			user.setMarks(Double.parseDouble(request.getParameter("marks")));
			user.setUniveristy(request.getParameter("university"));
			user.setYop(Integer.parseInt(request.getParameter("yop")));
			session.setAttribute("user", user);
			response.sendRedirect("three.html");
		} else {
			PrintWriter out = response.getWriter();
			out.print(
					"<center><span style='color:red;'>Please use the app from first page only</span></center><br/><br/>");
			out.print("<center><a href='/http_session_demo'>CLICK HERE</a></center>");
		}
	}

}
