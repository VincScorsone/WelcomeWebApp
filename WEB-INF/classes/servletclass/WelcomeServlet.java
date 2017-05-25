package servletclass;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.ServletException;
import java.io.PrintWriter;

public class WelcomeServlet extends HttpServlet{
	
	public  void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException{
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.println("<!DOCTYPE><html><head><title>Welcome Servlet</title></head>");
		writer.println("<body><h3>Hello world!</h3></body></html>");
	}
}