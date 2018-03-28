package run.com;



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Get
 */
@WebServlet("/run.com.Recieve")
public class Recieve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String code= request.getParameter("area");
		FileOutputStream fop = null;
		File file;
		String content = code;
		HttpSession sess= request.getSession();
		System.out.println(sess.getAttribute("email"));
	
	sess.setAttribute("page", request.getParameter("page"));
	sess.setAttribute("ques", request.getParameter("ques"));

	sess.setAttribute("mark", request.getParameter("mark"));
	String fname="Prog";
	sess.setAttribute("fname", fname);

		try {

			file = new File("F:/eclipse-jee-oxygen-R-win32-x86_64//eclipse/"+fname+".java");
			fop = new FileOutputStream(file);

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			// get the content in bytes
			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();

			System.out.println("Done");
			RequestDispatcher rd= request.getRequestDispatcher("com.run.Compilep");
			rd.forward(request, response);

		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
	}


}

