package run.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Compare
 */
@WebServlet("/run.com.Compare")
public class Compare extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	response.setContentType("text/html");
	HttpSession sess = request.getSession();
	if(request.getParameter("q").equals("1_java")) {
	 String output=sess.getAttribute("output").toString();
	 int flag=0;
	 String arr[]=new String[100];
	 String arr2[]=new String[100];
	 int i=0;
	 int k=0;
	 String line1=null;
	 FileReader fr=new FileReader("F:\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\correct_output_j1.txt");
    BufferedReader bf= new BufferedReader(fr);
    out.println("Expected Output:"); out.println("<br>");
   while((line1=bf.readLine())!=null) {
	   out.print(line1);
	   arr[i++]=line1;
    }
   out.println("<br>"); out.println("<br>"); out.println("<br>");
   
    FileReader fr1=new FileReader("F:\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\"+output);
    BufferedReader bf1= new BufferedReader(fr1);
    out.println("Your Output:"); out.println("<br>");
    while((line1=bf1.readLine())!=null) {
  	  out.print(line1);
  	  arr2[k++]=line1;
    }
    out.println("<br>");
    out.println("<br>"); out.println("<br>");
if(i==k) {
	
	for(int j=0;j<i;j++) {
		if(arr[j].equals(arr2[j])) {
			flag=0;
		}
		else {
			flag=1;
			break;
		}
	}
	if(flag==0) {
	out.println("<h2> Output Matched</h2>");
	}
	else {
		out.println("<h2> Output Not Matched</h2>");
	}
}
else {
	out.println("<h2> Output Not Matched</h2>");
}
	}
	if(request.getParameter("q").equals("2_java")) {
		 String output=sess.getAttribute("output").toString();
		
		
		 int flag=0;
		 String arr[]=new String[100];
		 String arr2[]=new String[100];
		 int i=0;
		 int k=0;
		 String line1=null;
		 FileReader fr=new FileReader("F:\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\correct_output_j2.txt");
	    BufferedReader bf= new BufferedReader(fr);
	    out.println("Expected Output:"); out.println("<br>");
	    while((line1=bf.readLine())!=null) {
	  	  out.print(line1);
	  	  arr[i++]=line1;
	    }out.println("<br>");
	   
	    FileReader fr1=new FileReader("F:\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\"+output);
	    BufferedReader bf1= new BufferedReader(fr1);
	    out.println("Your Output:"); out.println("<br>");
	    while((line1=bf1.readLine())!=null) {
	  	  out.print(line1);
	  	  arr2[k++]=line1;
	    }

	    out.println("<br>");
	    out.println("<br>"); out.println("<br>");
	if(i==k) {
		
		for(int j=0;j<i;j++) {
			if(arr[j].equals(arr2[j])) {
				flag=0;
			}
			else {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			out.println("<h2> Output Matched</h2>");
		}
		else {
			out.println("<h2> Output Not Matched</h2>");
		}
	}
	else {
		out.println("<h2> Output Not Matched</h2>"); 
	}
		}
	if(request.getParameter("q").equals("3_java")) {
		 String output=sess.getAttribute("output").toString();
		 int flag=0;
		 String arr[]=new String[100];
		 String arr2[]=new String[100];
		 int i=0;
		 int k=0;
		 String line1=null;
		 FileReader fr=new FileReader("F:\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\correct_output_j3.txt");
	    BufferedReader bf= new BufferedReader(fr);
	    out.println("Expected Output:"); out.println("<br>");
	   while((line1=bf.readLine())!=null) {
		   out.print(line1);
		   arr[i++]=line1;
	    }
	   out.println("<br>"); out.println("<br>"); out.println("<br>");
	   
	    FileReader fr1=new FileReader("F:\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\"+output);
	    BufferedReader bf1= new BufferedReader(fr1);
	    out.println("Your Output:"); out.println("<br>");
	    while((line1=bf1.readLine())!=null) {
	  	  out.print(line1);
	  	  arr2[k++]=line1;
	    }
	    out.println("<br>");
	    out.println("<br>"); out.println("<br>");
	if(i==k) {
		
		for(int j=0;j<i;j++) {
			if(arr[j].equals(arr2[j])) {
				flag=0;
			}
			else {
				flag=1;
				break;
			}
		}
		if(flag==0) {
		out.println("<h2> Output Matched</h2>");
		}
		else {
			out.println("<h2> Output Not Matched</h2>");
		}
	}
	else {
		out.println("<h2> Output Not Matched</h2>");
	}
		}
	if(request.getParameter("q").equals("4_java")) {
		 String output=sess.getAttribute("output").toString();
		 int flag=0;
		 String arr[]=new String[100];
		 String arr2[]=new String[100];
		 int i=0;
		 int k=0;
		 String line1=null;
		 FileReader fr=new FileReader("F:\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\correct_output_j4.txt");
	    BufferedReader bf= new BufferedReader(fr);
	    out.println("Expected Output:"); out.println("<br>");
	   while((line1=bf.readLine())!=null) {
		   out.print(line1);
		   arr[i++]=line1;
	    }
	   out.println("<br>"); out.println("<br>"); out.println("<br>");
	   
	    FileReader fr1=new FileReader("F:\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\"+output);
	    BufferedReader bf1= new BufferedReader(fr1);
	    out.println("Your Output:"); out.println("<br>");
	    while((line1=bf1.readLine())!=null) {
	  	  out.print(line1);
	  	  arr2[k++]=line1;
	    }
	    out.println("<br>");
	    out.println("<br>"); out.println("<br>");
	if(i==k) {
		
		for(int j=0;j<i;j++) {
			if(arr[j].equals(arr2[j])) {
				flag=0;
			}
			else {
				flag=1;
				break;
			}
		}
		if(flag==0) {
		out.println("<h2> Output Matched</h2>");
		}
		else {
			out.println("<h2> Output Not Matched</h2>");
		}
	}
	else {
		out.println("<h2> Output Not Matched</h2>");
	}
		}
	if(request.getParameter("q").equals("5_java")) {
		 String output=sess.getAttribute("output").toString();
		 int flag=0;
		 String arr[]=new String[100];
		 String arr2[]=new String[100];
		 int i=0;
		 int k=0;
		 String line1=null;
		 FileReader fr=new FileReader("F:\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\correct_output_j5.txt");
	    BufferedReader bf= new BufferedReader(fr);
	    out.println("Expected Output:"); out.println("<br>");
	   while((line1=bf.readLine())!=null) {
		   out.print(line1);
		   arr[i++]=line1;
	    }
	   out.println("<br>"); out.println("<br>"); out.println("<br>");
	   
	    FileReader fr1=new FileReader("F:\\eclipse-jee-oxygen-R-win32-x86_64\\eclipse\\"+output);
	    BufferedReader bf1= new BufferedReader(fr1);
	    out.println("Your Output:"); out.println("<br>");
	    while((line1=bf1.readLine())!=null) {
	  	  out.print(line1);
	  	  arr2[k++]=line1;
	    }
	    out.println("<br>");
	    out.println("<br>"); out.println("<br>");
	if(i==k) {
		
		for(int j=0;j<i;j++) {
			if(arr[j].equals(arr2[j])) {
				flag=0;
			}
			else {
				flag=1;
				break;
			}
		}
		if(flag==0) {
		out.println("<h2> Output Matched</h2>");
		}
		else {
			out.println("<h2> Output Not Matched</h2>");
		}
	}
	else {
		out.println("<h2> Output Not Matched</h2>");
	}
		}
	
	
}
	

}
