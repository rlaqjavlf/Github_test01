package org.java.memberController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")//   *.do(������ ������.do)
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
			//URI��û
			String uri = request.getRequestURI();
			//�⺻�н�
			String path = request.getContextPath();
			
			String basicPath =uri.substring(path.length());
			
			System.out.println(uri);
			System.out.println(path);
			System.out.println(basicPath);
			
			//if���� �̿��ؼ� basicPath "/login.do"�� �������� "�α��� ������"
			//if���� �̿��ؼ� basicPath "/logout.do"�� �������� "�α׾ƿ� ������"
			//if���� �̿��ؼ� basicPath "/joinMember.do"�� �������� "ȸ������ ������"
			//if���� �̿��ؼ� basicPath "/deleteMember.do"�� �������� "Ż�� ������"
			
			PrintWriter out = response.getWriter();
			
			if(basicPath.equals("/Login.do")) {
				out.print("�α���������");
			}else if(basicPath.equals("/Logout.do")) {
				out.print("�α׾ƿ�������");
			}else if(basicPath.equals("/joinMember.do")) {
				out.print("ȸ������������");				
			}else if(basicPath.equals("/deleteMember.do")) {
				out.print("ȸ��Ż��������");
			}else {
				out.print("�ش��������� �����ϴ�");
			}
			out.close();
			
			
	}
}
