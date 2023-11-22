package com.ji.servlet014.main;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// Model(DAO)

// 값
//	parameter(a,b)
//	attribute(c)
//	값을 이동하거나 전달하거나 받아오거나 할 때 사용 가능
//		- 새로운 요청이 또 일어나는 상황에서는 값 사용이 불가!
//	First > Second > Third 까지는 갈 수 없다.(현재 : Third 쪽으로는 위 요청이 닿지 않는다. Second에서 인자를 넘겨주지 못했기 떄문에.) : session

//	parameter
//		GET : 주소에 표시(Controller?param=value&param=value) 식으로.
//		POST : 내부적으로 전달(주소에 보이지 않음.)

//	request 소속 parameter(M의 Method에서 요청 파라미터 부를 때 Method 파라미터에 request추가)
//		값 읽기 : 
//			Java : request.getParameter("파라미터명")
//			JSP(EL) : ${param.파라미터명}

//	request 소속 attribute
//		Model(DAO) 에서 만든 값
//		Object
//		request 소속

//	M 에서 C를 거쳐 V로 값 보낼 때
//		request.setAttribute("이름" Java 변수명);
//	값 읽기 :
//		Java : request.getAttribute("이름");
//		JSP(EL) : ${"이름"}

//	HTTP 프로토콜의 특성이자 약점
//		1. Connectionless
//			Client가 요청을 한 후에 응답을 받으면 거기서 연결이 끊김.
//		2. stateless
//			통신이 끝나면 상태도 끊어버림.

//	이 약점을 보완하기 위해서 쿠키/세션이 사용됨.

//	쿠키(Cookie)
//		사용자의 상태 정보를 컴퓨터에 저장해뒀다가 나중에 참조함!
//		사용자가 별도로 요청을 하지 않아도 브라우저가 요청을 하면
//		컴퓨터에 저장되어있는 정보를 자동으로 서버에 전송해줌.
//		한번 시간을 설정해두면 브라우저의 종료 여부와는 상관없이 유지가 가능.
//		=> ID/PW 저장하기, 쇼핑몰 장바구니, 팝업창(오늘 하루 보지 않기), ...

//		Model에서 만든 값
//		기본 자료형 : String
//		기본 유지시간 - 24시간?
//		사용자 컴퓨터에 저장 > 요즘은 암호화해서 저장한다고는 하더라 .
//		그래도 위험한 편 > 노출되면 위험해지는 정보는 쿠키에 저장하지 않는 것이 좋다.

//		값 읽기
//			Java : 현재 사용자 컴퓨터에 만들어져 있는 쿠키들 > 중에 해당 프로젝트꺼 찾아서
//			JSP(EL) : ${cookie.이름.value}
//			${sessionScope.ee(attribute 명)}

//	세션(Session)
//		쿠키를 기반으로 동작 but 사용자의 정보를 server에서 관리
//		접속 시간을 설정 > 일정 시간동안 응답이 없으면 정보를 삭제함!
//		쿠키보다는 보안성이 더 좋음, 메모리 사용량이 크다는 단점이 있음.
//		동접자 수가 많으면 > 서버 과부하 > 성능 저하

//		session 소속 attribute
//		Model 에서 만든 값
//		Object
//		연결만 되어 있으면 어디서든지 사용 가능.
//		유지시간 : 기본 30분, 설정 가능.
//			해당 시간동안 아무런 요청이 없는 경우 자동으로 끊김.

//	쿠키 : 정해놓은 시간이 만료되거나, 쿠키를 삭제하기 전까지는 유지됨.
//	세션 : 만료되는 시간은 지정할 수 있으나, 브라우저에 요청이 없거나, 브라우저를 종료하면 바로 삭제


public class M {
	
	public static void makeSecondData(HttpServletRequest req,HttpServletResponse res) {
		
		// request 소속 attribute
		int d = 3000;
		req.setAttribute("dd", d);
		
		// session 소속 attribute
		int e = 44444;
		HttpSession hs = req.getSession();	// client와 server 간의 연결 상태
		hs.setMaxInactiveInterval(15);		// session의 유지시간을 15초로 설정
		hs.setAttribute("ee", e);
		
		// Cookie
		String f = "55555";
		Cookie ck = new Cookie("ff",f);
		ck.setMaxAge(15);		// 15초 동안 사용자 컴퓨터에 파일로 저장
		res.addCookie(ck); 		// 응답 객체에 쿠키를 추가
		
	}
	
	public static void getSum(HttpServletRequest request) {
		
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		
		int sum = a + b;
		
		request.setAttribute("sum", sum);
		
	}

}
