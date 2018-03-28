package run.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
			HttpSession sess= request.getSession();
			String page = sess.getAttribute("page").toString();
	
			RequestDispatcher rd= request.getRequestDispatcher(page);
			rd.include(request, response);
			int flag=0;
               String currentDirectory;
		currentDirectory = System.getProperty("user.dir");
		
		System.out.println("Current working directory : "+currentDirectory);
		      String fname= sess.getAttribute("fname").toString();
		      Process pro = Runtime.getRuntime().exec("gcc "+fname+".c");
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
			    	flag=1;
			        out.println(  " " + line);
			    }
			    if(flag==0) {
					 out.println("compiled Succesfully");
					 if(sess.getAttribute("ques").equals("1_c")) {
						 try
					        { 
							 String output = sess.getAttribute("email").toString()+"_"+sess.getAttribute("ques")+".txt";
					         sess.setAttribute("output", output);
							 // We are running "dir" and "ping" command on cmd
					         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"a.exe>"+output+" &exit \"");
					         String line1=null;
					         Thread.sleep(3000);
					         FileReader fr=new FileReader(output);
					      BufferedReader bf= new BufferedReader(fr);
					      out.println("<h3>");
					      while((line1=bf.readLine())!=null) {
					    	  out.print(line1);
					      }
					     out.println("</h3>");
					     
					     out.println("<a href='run.com.Comparec?q=1_c'>Submit</a>");
					        }
					        
					        
					        catch (Exception e)
					        {
					            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
					            e.printStackTrace();
					        } 
					 }
					 if(sess.getAttribute("ques").equals("2_c")) {
						 try
					        { 
							 String output = sess.getAttribute("email").toString()+"_"+sess.getAttribute("ques")+".txt";
							 sess.setAttribute("output", output);
					         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"a.exe<input2_c.txt>"+output+" &exit \"");
					         String line1=null;
					         Thread.sleep(3000);
					         FileReader fr=new FileReader(output);
					      BufferedReader bf= new BufferedReader(fr);
					      out.println("<h3>");
					      while((line1=bf.readLine())!=null) {
					    	  out.print(line1);
					      }
					     out.println("</h3>");
					     out.println("<a href='run.com.Comparec?q=2_c'>Submit</a>");
					        }
					        
					        
					        catch (Exception e)
					        {
					            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
					            e.printStackTrace();
					        } 
					 }
					 if(sess.getAttribute("ques").equals("3_c")) {
						 try
					        { 
							 String output = sess.getAttribute("email").toString()+"_"+sess.getAttribute("ques")+".txt";
							 sess.setAttribute("output", output);
					         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"a.exe<input3_c.txt>"+output+" &exit \"");
					         String line1=null;
					         Thread.sleep(3000);
					         FileReader fr=new FileReader(output);
					      BufferedReader bf= new BufferedReader(fr);
					      out.println("<h3>");
					      while((line1=bf.readLine())!=null) {
					    	  out.print(line1);
					      }
					     out.println("</h3>");
					     out.println("<a href='run.com.Comparec?q=3_c'>Submit</a>");
					        }
					        
					        
					        catch (Exception e)
					        {
					            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
					            e.printStackTrace();
					        } 
					 }
					 if(sess.getAttribute("ques").equals("4_c")) {
						 try
					        { 
							 String output = sess.getAttribute("email").toString()+"_"+sess.getAttribute("ques")+".txt";
							 sess.setAttribute("output", output);
					         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"a.exe<input4_c.txt>"+output+" &exit \"");
					         String line1=null;
					         Thread.sleep(3000);
					         FileReader fr=new FileReader(output);
					      BufferedReader bf= new BufferedReader(fr);
					      out.println("<h3>");
					      while((line1=bf.readLine())!=null) {
					    	  out.print(line1);
					      }
					     out.println("</h3>");
					     out.println("<a href='run.com.Comparec?q=4_c'>Submit</a>");
					        }
					        
					        
					        catch (Exception e)
					        {
					            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
					            e.printStackTrace();
					        } 
					 }
					 if(sess.getAttribute("ques").equals("5_c")) {
						 try
					        { 
							 String output = sess.getAttribute("email").toString()+"_"+sess.getAttribute("ques")+".txt";
							 sess.setAttribute("output", output);
					         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"a.exe<input5_c.txt>"+output+" &exit \"");
					         String line1=null;
					         Thread.sleep(3000);
					         FileReader fr=new FileReader(output);
					      BufferedReader bf= new BufferedReader(fr);
					      out.println("<h3>");
					      while((line1=bf.readLine())!=null) {
					    	  out.print(line1);
					      }
					     out.println("</h3>");
					     out.println("<a href='run.com.Comparec?q=5_c'>Submit</a>");
					        }
					        
					        
					        catch (Exception e)
					        {
					            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
					            e.printStackTrace();
					        } 
					 }
				}
			  }
		    catch (Exception e) {
		      e.printStackTrace();
		    }
		
	}
		

	}
