package org.wep.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class MemberController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
																						throws ServletException, IOException {
	
		doAction(request, response);
	}

		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) 
																							throws ServletException, IOException {
			
		doAction(request, response);
		}
		
	private void doAction(HttpServletRequest request, HttpServletResponse response)
																						throws ServletException, IOException {
	//�⺻ �ʼ�																					
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		//URI��û
		String uri = request.getRequestURI();
		//�⺻�н�
		String path = request.getContextPath();
		
			String userID = request.getParameter("userID");
			String userPW = request.getParameter("userPW");
			String userGender = request.getParameter("gender");
			String geust = request.getParameter("geust");
			//���(���߼���)========================================
			String[] hobbysArr = request.getParameterValues("hobbys");
			String hobbysStr = "";
			for(String str:hobbysArr) {
				hobbysStr +=str+", ";
				//System.out.println(str+"   ");
			}
			hobbysStr=hobbysStr.substring(0, hobbysStr.length()-1);
			System.out.println(hobbysStr);
			System.out.println(hobbysStr.length());
			
			//��ȭ��ȣ==========================================
			String[] phoneArr = request.getParameterValues("phone");
			String phoneStr = "";
			for(String str : phoneArr) {
			phoneStr+=str+"-";
			}
			phoneStr=phoneStr.substring(0,phoneStr.length()-1);
			System.out.println(phoneStr);
			
			
	}
}
