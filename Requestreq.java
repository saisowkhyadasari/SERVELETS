package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Requestreq
 */
@WebServlet("/Requestreq")
public class Requestreq extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Requestreq() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String name=request.getParameter("empname");
		String mailid=request.getParameter("mailid");
		String doj=request.getParameter("doj");
		String job=request.getParameter("job");
		int sal=Integer.parseInt(request.getParameter("sal"));
		out.println("Employee name = "+name+"<br>");
		out.println("Mail Id = "+mailid+"<br>");
		out.println("Date Of Joining = "+doj+"<br>");
		out.println("Job = "+job+"<br>");
		out.println("Salary = "+sal);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
