package login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.db.Users;
import login.model.UsersDao;

@WebServlet("/login.controller.Register")
public class Register extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String mobile = request.getParameter("mobile");
		String city = request.getParameter("city");
		
		Users u = new Users();
		u.setEmail(email);;
		u.setPassword(password);
		u.setMobile(mobile);
		u.setCity(city);
		
		int status = 	UsersDao.save(u);
		if(status > 0)
		{
			response.sendRedirect("register.jsp?msg1=Sucessfully Registerd ...");
		}
		else
			response.sendRedirect("register.jsp?msg2=Error in Registration...");
		
	}
}















