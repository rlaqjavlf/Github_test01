package org.web.memberCommend;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.web.MemberDTO.MemberDTO;
import org.web.memberdao.MemberDao;

public class MemberListDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("ȸ����ȸ");
		
		//DAO
		MemberDao DAO=MemberDao.getInstance();// �̱��� ȣ��
		
		ArrayList<MemberDTO> Members= DAO.Members();
		
		//DB������
		request.setAttribute("members", Members);
		
		//URL
		request.setAttribute("url", "/MemberList.jsp");
		
		
	}

}
