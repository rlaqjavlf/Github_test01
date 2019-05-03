package org.java.MemberCommend;

import java.util.ArrayList;
import java.util.Iterator;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class SelectDo implements QueryCommend {

	@Override
	public void excuteCommend() {
		
		MemberDAO dao = new MemberDAO();
		
		ArrayList<MemberDTO> lists = dao.select();
		
		// ��ȯ���� null�̸� �����ͺ��̽� ������ ����
		// null�� �ƴϸ� �����ͺ��̽� ������ �ִ�
		
		if (lists == null) {
			System.out.println("ȸ�� ��ȸ ����");
		} else {
			System.out.println("ȸ�� ��ȸ ����");
			
			Iterator<MemberDTO> iterator = lists.iterator();
			while (iterator.hasNext()) {
				MemberDTO i = iterator.next();
				System.out.print(i.getUserID() + " | " + 
								 i.getUserPW() + " | " +
								 i.getUserName() + " | " +
								 i.getUserAge());
				System.out.println("\n------------------");
			}
		}
		
	}

}
