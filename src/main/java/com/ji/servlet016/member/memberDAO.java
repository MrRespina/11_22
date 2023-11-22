package com.ji.servlet016.member;

import javax.servlet.http.HttpServletRequest;

public class memberDAO {
	
	public static boolean loginCheck(HttpServletRequest req) {
	
		// 로그인된 상태면 Member 자바빈이 채워질 것.
		Member m = (Member) req.getSession().getAttribute("loginMember");
		if(m!=null) {
			//성공
			req.setAttribute("log", "member/welcome.jsp");
			return true;
		}else {
			req.setAttribute("log", "member/login.jsp");
			return false;
		}
		
		
	}

}
