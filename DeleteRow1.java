package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.deloitte.empl.dao.Emp1Dao;
import com.deloitte.empl.dao.impl.Emp1DaoImpl;

/**
 * Servlet implementation class DeleteRow1
 */
@WebServlet("/DeleteRow1")
public class DeleteRow1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		int empno=Integer.parseInt(request.getParameter("empno"));
		Emp1Dao dao=new Emp1DaoImpl();
		//Emp emp=new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
		dao.delEmp(empno);
		out.println("deleted");
			}

}
	


