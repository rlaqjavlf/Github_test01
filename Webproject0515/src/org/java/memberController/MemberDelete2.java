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
		
		//Ŭ���̾�Ʈ request ���� �ޱ�
		String userID = request.getParameter("userID");
		String userPW = request.getParameter("userPW");
		
		//�������� Ŭ���̾�Ʈ���� �������ش�(responce)
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head>");		
		out.print("<title>Login</title>");
		out.print("</head>");		
		out.print("<body>");
		out.print("�α��� ���� Ȯ�� <br>");
		out.print("���̵� : "+userID+"     ");
		out.print("��й�ȣ : "+userPW+"     ");				
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
