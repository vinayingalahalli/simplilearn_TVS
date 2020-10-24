package com.app.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<center><h2><u>ServletConfig and ServletContext Demo</u></h2></center><br/></br>");
		
		ServletConfig config=getServletConfig(); //fetches keyvalue(init-param) pairs from web.xml
		
		out.print("<h3><u>Accessing Servlet1's ServletConfig Parameters in Servlet1</u></h3>");
		out.print("<h4>query1 : "+config.getInitParameter("query1")+"</h4>");
		out.print("<h4>query2 : "+config.getInitParameter("query2")+"</h4>");
		out.print("<h4>query3 : "+config.getInitParameter("query3")+"</h4>");
		
		
		ServletContext context=getServletContext(); //fetches context-params from the web.xml
		out.print("<br/><h3><u>Accessing ServletContext Parameters in Servlet1</u></h3>");
		out.print("<h4>driver : "+context.getInitParameter("driver")+"</h4>");
		out.print("<h4>url : "+context.getInitParameter("url")+"</h4>");
		out.print("<h4>username : "+context.getInitParameter("username")+"</h4>");
		out.print("<h4>password : "+context.getInitParameter("password")+"</h4>");
		
		
	}

}
