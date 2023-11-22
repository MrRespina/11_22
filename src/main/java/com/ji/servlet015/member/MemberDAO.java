package com.ji.servlet015.member;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberDAO {

	// 로그인 기능(간략 ver)
	public static void login(HttpServletRequest req,HttpServletResponse res) {
		
		try {
			
			req.setCharacterEncoding("UTF-8");
			
			// jsp 에서 만든 parameter 값 읽어오기
			String id = req.getParameter("id");
			String pw = req.getParameter("pw");
			
			// 로그인이 성공한 유저 정보를
			// 	사이트 어디서든지 사용 가능(* 로그인 정보를 Member 자바 빈에 담음.)
			// 	내가 설정한 시간이 지나면 로그인 상태 풀리도록.(10초 제한)
			
			if(id.equals("헬프") && pw.equals("me")) {
				
				Member m = new Member(id,pw);
				req.getSession().setAttribute("m", m); 	// session 소속 attribute
				req.getSession().setMaxInactiveInterval(10); 	// 10초로 제한
				
			}
			
			// 한번 로그인에 성공했다면, 다음에 이 사이트에 들어왔을 때
			// <input>에 id는 남아있었으면 ...
			// 접속을 끊어도 재부팅을 해도 지정 시간 안에 포함이 된다면 남아있도록 > Cookie
			Cookie c = new Cookie("lastLoginId",id); 	// index의 id 부분에 넣어줘야.
			c.setMaxAge(60);
			res.addCookie(c);
			
		}catch (Exception e) {
			
			e.printStackTrace();
		
		}
		
	}
	
	// 페이지 여기저기 다닐텐데 로그인이 되어있는지 확인해야겠다 .
	public static boolean loginCheck(HttpServletRequest req) {
		
		Member m = (Member) req.getSession().getAttribute("m");
		// 로그인이 유지중이거나 로그인이 성공하면 바로 윗줄이 존재한다. > Null이 아니다.
		
		return (m!=null);	// 로그인 유지중 or 로그인이 되었다 : true
		
	}
	
	
}
