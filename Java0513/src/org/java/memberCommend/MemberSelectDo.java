package org.java.memberCommend;

import java.util.ArrayList;
import java.util.Iterator;

import org.java.memberDAO.MemberDAO;
import org.java.memberDTO.MemberDTO;

public class MemberSelectDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ��ȸ");
		MemberDAO DAO = new MemberDAO();
		ArrayList<MemberDTO> lists=DAO.select();
		
		//Iterator�� �ݼֿ� ���
		Iterator<MemberDTO> iterator = lists.iterator();
		
		while(iterator.hasNext()) {
				MemberDTO DTO = iterator.next();
				System.out.println("============================");
				System.out.println(DTO.getUserID()+"  |  "+DTO.getUserPW()+"  |  "+
													DTO.getUserName()+"  |  "+DTO.getUserAge());
				
		}
		
		
	}

}
