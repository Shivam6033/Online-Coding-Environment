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

		try {

			file = new File("F:/eclipse-jee-oxygen-R-win32-x86_64//eclipse/Prog1.java");
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

