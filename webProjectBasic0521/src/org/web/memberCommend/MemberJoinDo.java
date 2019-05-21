package org.web.memberCommend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.memberdao.MemberDao;

public class MemberJoinDo implements MemberCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			System.out.println("ȸ�� ����");				
			
			String userId=request.getParameter("userId");
			String userPw=request.getParameter("userPw");
			String userName=request.getParameter("userName");
			int userAge=Integer.parseInt(request.getParameter("userAge"));
			
			//DAO
			MemberDao dao=MemberDao.getInstance();// �̱��� ȣ��
			int rs=dao.insert(userId, userPw, userName, userAge);

			String url="";
			
			if(rs==1) {
				System.out.println("ȸ�� ���� ����");
				url="/joinOk.jsp";				
			}else {
				System.out.println("ȸ�� ���� ����");
				url="/joinNo.jsp";								
			}
			
			request.setAttribute("url", url);
	}

}
