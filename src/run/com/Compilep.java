package run.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.File;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/com.run.Compilep")
public class Compilep extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter(); 
		try {
			
               String currentDirectory;
		currentDirectory = System.getProperty("user.dir");
		System.out.println("Current working directory : "+currentDirectory);
		      runProcess("javac Prog1.java");
		      runProcess("java Prog1");
		      Process pro = Runtime.getRuntime().exec("javac Prog1.java");
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
			    pro = Runtime.getRuntime().exec("java Prog1");
			      ins=pro.getInputStream();
			      
			      line = null;
				     in = new BufferedReader(
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
			  }
		    catch (Exception e) {
		      e.printStackTrace();
		    }
		
	}
		  private static void printLines(String name, InputStream ins) throws Exception {
			
		    String line = null;
		    BufferedReader in = new BufferedReader(
		        new InputStreamReader(ins));
		    while ((line = in.readLine()) != null) {
		        System.out.println(name + " " + line);
		    }
		  }

		  private static void runProcess(String command) throws Exception {
			
		    Process pro = Runtime.getRuntime().exec(command);
		    printLines(command + " stdout:", pro.getInputStream());
		    printLines(command + " stderr:", pro.getErrorStream());
		    pro.waitFor();
		    System.out.println(command + " exitValue() " + pro.exitValue());
		  }

	}

	


