package org.java.memberController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")//   *.do(마지막 세글자.do)
public class MemberController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
																					throws ServletException, IOException {
		
		doAtion(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
																					throws ServletException, IOException {
		System.out.println("doGet");
		doAtion(request, response);	
}
	private void doAtion(HttpServletRequest request, HttpServletResponse response)
																								throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			//URI요청
			String uri = request.getRequestURI();
			//기본패스
			String path = request.getContextPath();
			
			String basicPath =uri.substring(path.length());
			
			System.out.println(uri);
			System.out.println(path);
			System.out.println(basicPath);
			
			//if문을 이용해서 basicPath "/login.do"면 브라우저에 "로그인 페이지"
			//if문을 이용해서 basicPath "/logout.do"면 브라우저에 "로그아웃 페이지"
			//if문을 이용해서 basicPath "/joinMember.do"면 브라우저에 "회원가입 페이지"
			//if문을 이용해서 basicPath "/deleteMember.do"면 브라우저에 "탈퇴 페이지"
			
			PrintWriter out = response.getWriter();
			
			if(basicPath.equals("/Login.do")) {
				out.print("로그인페이지");
			}else if(basicPath.equals("/Logout.do")) {
				out.print("로그아웃페이지");
			}else if(basicPath.equals("/joinMember.do")) {
				out.print("회원가입페이지");				
			}else if(basicPath.equals("/deleteMember.do")) {
				out.print("회원탈퇴페이지");
			}else {
				out.print("해당페이지가 없습니다");
			}
			out.close();
			
			
	}
}
