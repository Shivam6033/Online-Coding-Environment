package run.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileReader;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/com.run.Compilep")
public class Compilep extends HttpServlet {
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
		      Process pro = Runtime.getRuntime().exec("javac "+fname+".java");
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
					 if(sess.getAttribute("ques").equals("1_java")) {
						 try
					        { 
							 String output = sess.getAttribute("email").toString()+"_"+sess.getAttribute("ques")+".txt";
					         sess.setAttribute("output", output);
						
					         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"java "+fname+">"+output+" &exit \"");
					         String line1=null;
					         Thread.sleep(3000);
					         FileReader fr=new FileReader(output);
					      BufferedReader bf= new BufferedReader(fr);
					      out.println("<h3>");
					      while((line1=bf.readLine())!=null) {
					    	  out.print(line1);
					      }
					     out.println("</h3>");
					     
					     out.println("<a href='run.com.Compare?q=1_java'>Submit</a>");
					        }
					        
					        
					        catch (Exception e)
					        {
					            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
					            e.printStackTrace();
					        } 
					 }
					 if(sess.getAttribute("ques").equals("2_java")) {
						 try
					        { 
							 String output = sess.getAttribute("email").toString()+"_"+sess.getAttribute("ques")+".txt";
							 sess.setAttribute("output", output);
					         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"java "+fname+"<input.txt>"+output+" &exit \"");
					         String line1=null;
					         Thread.sleep(3000);
					         FileReader fr=new FileReader(output);
					      BufferedReader bf= new BufferedReader(fr);
					      out.println("<h3>");
					      while((line1=bf.readLine())!=null) {
					    	  out.print(line1);
					      }
					     out.println("</h3>");
					     out.println("<a href='run.com.Compare?q=2_java'>Submit</a>");
					        }
					        
					        
					        catch (Exception e)
					        {
					            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
					            e.printStackTrace();
					        } 
					 }
					 if(sess.getAttribute("ques").equals("3_java")) {
						 try
					        { 
							 String output = sess.getAttribute("email").toString()+"_"+sess.getAttribute("ques")+".txt";
							 sess.setAttribute("output", output);
					         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"java "+fname+"<input3.txt>"+output+" &exit \"");
					         String line1=null;
					         Thread.sleep(3000);
					         FileReader fr=new FileReader(output);
					      BufferedReader bf= new BufferedReader(fr);
					      out.println("<h3>");
					      while((line1=bf.readLine())!=null) {
					    	  out.print(line1);
					      }
					     out.println("</h3>");
					     out.println("<a href='run.com.Compare?q=3_java'>Submit</a>");
					        }
					        
					        
					        catch (Exception e)
					        {
					            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
					            e.printStackTrace();
					        } 
					 }
					 if(sess.getAttribute("ques").equals("4_java")) {
						 try
					        { 
							 String output = sess.getAttribute("email").toString()+"_"+sess.getAttribute("ques")+".txt";
							 sess.setAttribute("output", output);
					         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"java "+fname+"<input4.txt>"+output+" &exit \"");
					         String line1=null;
					         Thread.sleep(3000);
					         FileReader fr=new FileReader(output);
					      BufferedReader bf= new BufferedReader(fr);
					      out.println("<h3>");
					      while((line1=bf.readLine())!=null) {
					    	  out.print(line1);
					      }
					     out.println("</h3>");
					     out.println("<a href='run.com.Compare?q=4_java'>Submit</a>");
					        }
					        
					        
					        catch (Exception e)
					        {
					            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
					            e.printStackTrace();
					        } 
					 }
					 if(sess.getAttribute("ques").equals("5_java")) {
						 try
					        { 
							 String output = sess.getAttribute("email").toString()+"_"+sess.getAttribute("ques")+".txt";
							 sess.setAttribute("output", output);
					         Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"java "+fname+"<input5.txt>"+output+" &exit \"");
					         String line1=null;
					         Thread.sleep(3000);
					         FileReader fr=new FileReader(output);
					      BufferedReader bf= new BufferedReader(fr);
					      out.println("<h3>");
					      while((line1=bf.readLine())!=null) {
					    	  out.print(line1);
					      }
					     out.println("</h3>");
					     out.println("<a href='run.com.Compare?q=5_java'>Submit</a>");
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

	


