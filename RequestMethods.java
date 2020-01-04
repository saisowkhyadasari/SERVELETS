package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestMethods
 */
@WebServlet("/RequestMethods")
public class RequestMethods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println(request.getRequestURI()+"<br>");
		out.println(request.getLocalPort()+"<br>");
		out.println(request.getServerName()+"<br>");
		out.println(request.getContentType()+"<br>");
		out.println(request.getServletPath()+"<br>");
	    out.println(request.getRemoteAddr()+"<br>");
	    out.println(request.getRequestURL()+"<br>");
		out.println(request.getLocalAddr()+"<br>");	
		out.println(request.getLocalName()+"<br>");	
		out.println(request.getProtocol()+"<br>");	
	    out.println(request.getLocale()+"<br>");	
	    out.println(request.getSession()+"<br>");	
	}

}
