package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.User;

/**
 * Servlet implementation class SummaryServlet
 */
public class SummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SummaryServlet() {
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

		HttpSession session = request.getSession(false);// will not create new session it will participate in existing
		PrintWriter out = response.getWriter();									// session
		if (session != null) {
			User user = (User) session.getAttribute("user");
			user.setYoe(Float.parseFloat(request.getParameter("yoe")));
			user.setCompany(request.getParameter("company"));
			out.print("<h3>Hello, "+user.getFname()+"..... Your Details Are.......</h3>");
			out.print("<h4>"+user+"</h4><br/>");
			out.print("<h5>session was created at "+new Date(session.getCreationTime())+"</h5>");
			out.print("<h5>session ID is "+session.getId()+"</h5>");
			//session.setMaxInactiveInterval(360);//destroys the session if not active after 360 seconds
			//session.getMaxInactiveInterval();
			session.invalidate();//destroys the session
			
		} else {
			
			out.print(
					"<center><span style='color:red;'>Please use the app from first page only</span></center><br/><br/>");
			out.print("<center><a href='/http_session_demo'>CLICK HERE</a></center>");
		}
	}

}
