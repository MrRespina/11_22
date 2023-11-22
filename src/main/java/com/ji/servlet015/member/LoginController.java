package com.ji.servlet015.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			MemberDAO.login(request, response);
			// 1. 로그인 성공 > loginSuccess.jsp
			// 2. 로그인 실패 > index.jsp

			if(MemberDAO.loginCheck(request)) {	// true 일 때!
				
				request.getRequestDispatcher("loginSuccess.jsp").forward(request, response);;
				
			}else {
				
				request.getRequestDispatcher("index.jsp").forward(request, response);		
			}

	}

}
