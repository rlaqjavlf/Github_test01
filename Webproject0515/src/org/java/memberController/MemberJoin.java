package org.java.memberController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.servlet.JspServlet;
//������̼�
@WebServlet("/MemberJoin.do") // ���� ���� 
public class MemberJoin extends HttpServlet{

		@Override
		public void init() throws ServletException {
			System.out.println("���� ����");
		}
		
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			System.out.println("doGet");
			doAction(request, response);
		}		
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) 
																					throws ServletException, IOException {
			System.out.println("doPost");
			doAction(request, response);
		}
		private void doAction(HttpServletRequest request, HttpServletResponse response) 
																					throws ServletException, IOException{
				//Ŭ���̾�Ʈ�� ���ڿ�
				request.setCharacterEncoding("utf-8");
				//������ ����
				response.setContentType("text/html;charset=utf-8");
				//URI��û
				String userID = request.getParameter("userID");
				String userPW = request.getParameter("userPW");
				String userName = request.getParameter("userName");
				String userAge = request.getParameter("userAge");
				
		}
		
		
		
		
		@Override
		public void destroy() {
		System.out.println("���� ����");
		}
}
