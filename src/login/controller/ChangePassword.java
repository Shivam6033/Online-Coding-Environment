package login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import login.db.Users;
import login.model.UsersDao;

@WebServlet("/login.controller.ChangePassword")
public class ChangePassword extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		
		String cntpassword = request.getParameter("cntpassword");
		String newpassword = request.getParameter("newpassword");
		String cnfpassword = request.getParameter("cnfpassword");
		
		HttpSession session = request.getSession();
		
		Users u = new Users();
		u.setEmail((String)session.getAttribute("email"));
		u.setPassword(cntpassword);
		
		int status = 	UsersDao.checkPassword(u);
		if(status > 0)
		{
			if(newpassword.equals(cnfpassword))
			{
				u.setPassword(newpassword);
				status = UsersDao.doChangePassword(u);
				if(status > 0)
				{
					response.sendRedirect("changePassword.jsp?msg1=Password Changed Successfully..");
				}
				else
					response.sendRedirect("changePassword.jsp?msg1=Error in password updation.");
			}
			else
				response.sendRedirect("changePassword.jsp?msg1=Password mismatched..");
		}
		else
			response.sendRedirect("changePassword.jsp?msg2=Invalid Current Password..");
		
	}
}















