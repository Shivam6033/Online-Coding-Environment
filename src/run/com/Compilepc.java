package run.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Compilepc
 */
@WebServlet("/run.com.Compilepc")
public class Compilepc extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); 
		try {
			
               String currentDirectory;
		currentDirectory = System.getProperty("user.dir");
		System.out.println("Current working directory : "+currentDirectory);
	Process pro = Runtime.getRuntime().exec("gcc Prog1.c");
		      InputStream ins=pro.getInputStream();
		      
		      String line = null;
			    BufferedReader in = new BufferedReader(
			        new InputStreamReader(ins));
			    while ((line = in.readLine()) != null) {
			    	
			        out.println(  " " + line);
			    }
			 	   
			    ins=pro.getErrorStream();
			    line = null;
			   in = new BufferedReader(
			        new InputStreamReader(ins));
			    while ((line = in.readLine()) != null) {
			        out.println(  " " + line);
			    }
			 out.println("compiled Succesfully");
			 try
		        { 
		         // We are running "dir" and "ping" command on cmd
		         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"a.exe<input.txt>output.txt\"");
		      }
		        catch (Exception e)
		        {
		            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
		            e.printStackTrace();
		        }
				    
				   
				 
			  }
		    catch (Exception e) {
		      e.printStackTrace();
		    }
		
	}
		

	}
