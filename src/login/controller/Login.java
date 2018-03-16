package login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login.db.Users;
import login.model.UsersDao;

@WebServlet("/login.controller.Login")
public class Login extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Users u = new Users();
		u.setEmail(email);;
		u.setPassword(password);
		
		boolean result = 	UsersDao.checkLogin(u);
		if(result == true)
		{
			HttpSession session = request.getSession();
			session.setAttribute("email", u.getEmail());
			response.sendRedirect("Choose.jsp?msg1=Sucessfully Login ...");
		}
		else
			response.sendRedirect("login.jsp?msg2=Invalid Email or Password...");
		
	}
}















