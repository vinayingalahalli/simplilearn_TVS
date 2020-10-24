package com.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeUserServlet
 */
public class WelcomeUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>Welcome "+request.getParameter("fullname")+"</h1>");
		out.print("<h2>Age : "+request.getParameter("age")+"</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>Welcome "+request.getParameter("fullname")+"</h1>");
		out.print("<h2>Age : "+request.getParameter("age")+"</h2>");
		out.print("<h2>Gender : "+request.getParameter("gender")+"</h2>");
		out.print("<h2>Contact Number : "+request.getParameter("contact")+"</h2>");
		out.print("<h2>Country : "+request.getParameter("country")+"</h2>");
		out.print("<h2>Hobbies are  : "+Arrays.toString(request.getParameterValues("hobby"))+"</h2>");
	}

}
