package com.company.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;

import com.company.dao.userdaoimp;
import com.company.dao.userdao;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static userdao userd=new userdaoimp();
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				System.out.println("Login chal rha hai");
				String name=request.getParameter("username");
				String password=request.getParameter("password");
				
				System.out.println(name);
				System.out.println(password);
			
				
				if(name.equals("rishu")&& password.equals("rishu")) {
					response.sendRedirect("contact.jsp");
					HttpSession s=request.getSession();
					s.setAttribute("name",name);
					
				}
				else {
					response.sendRedirect("index.html");
				}
				
				
	}

}
