package com.ji.servlet015.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ji.servlet015.member.MemberDAO;


@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(MemberDAO.loginCheck(request)) {	// true 일 때!
			
			request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);;
			
		}else {
			
			request.getRequestDispatcher("index.jsp").forward(request, response);		
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
