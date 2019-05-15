package org.java.memberController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberDelete2
 */
@WebServlet("/MemberDelete.do")
public class MemberDelete2 extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
																					throws ServletException, IOException {
		System.out.println("doGet");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		
		//클라이언트 request 정보 받기
		String userID = request.getParameter("userID");
		String userPW = request.getParameter("userPW");
		
		//서버에서 클라이언트에게 전송해준다(responce)
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");		
		out.print("<title>Login</title>");
		out.print("</head>");		
		out.print("<body>");
		out.print("로그인 정보 확인 <br>");
		out.print("아이디 : "+userID+"     ");
		out.print("비밀번호 : "+userPW+"     ");				
		out.print("</body>");
		out.print("</html>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
																					throws ServletException, IOException {
			System.out.println("doPost");
			doGet(request, response);
	}

	public void destroy() {
		
	}
}
