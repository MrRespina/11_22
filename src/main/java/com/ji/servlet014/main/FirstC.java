package com.ji.servlet014.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Controller
//	JSP 환경에서 상황판단 > 전체적인 흐름을 제어함
//	GET or POST 하기에는 Servlet이 적합함.
//		계산, 작업 : M(Model, DAO)
//		뭔가 보여줘야 됨 : V(View)

@WebServlet("/FirstC") // FirstC를 Tomcat에 등록
public class FirstC extends HttpServlet {
	
	// 이 프로젝트(JSP Model 2) 에는 Main Method가 존재하지 않음.
	// 톰캣으로 실행.(Main이 톰캣에 있음) > 알아서 FirstC 객체를 만듬.
	
	// Constructor(생성자). 이 프로젝트가 처음 시작했을 때 ...
	public FirstC() {
		// TODO Auto-generated constructor stub
		super();
		// 처음 실행했을 때 처리에 필요한 데이터들을 받아오기 위해 사용함.(어제 프로젝트의 사과/바나나 총 갯수 받아서 미리 페이징)
	}
	
	private static final long serialVersionUID = 1L;
       
	// 웹 사이트의 페이지 전환 : C로 요청 > M에서 작업 > V로 포워딩
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 사이트에 처음 들어옴 or FirstC로 요청 파라미터 하나도 없이 GET으로 요청 시?
		if(!request.getParameterNames().hasMoreElements()) {
			
			// 이것의 정식적인 사용 방법
			// request.getRequestDispatcher("FirstV.jsp").forward(request, response);	
			
			// FirstV.jsp로 지금 일어난 요청을 제보해주는 객체
			RequestDispatcher rd = request.getRequestDispatcher("FirstV.jsp");
			// 요청과 응답을 FirstV.jsp로 포워딩
			rd.forward(request, response);
			
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
