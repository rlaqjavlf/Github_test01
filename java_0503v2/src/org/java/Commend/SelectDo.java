package org.java.Commend;

import java.util.ArrayList;
import java.util.Iterator;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class SelectDo implements 	QueryCommend{
	@Override
	public void excuteCommend() {
		System.out.println("ȸ�� ��ȸ");
		
		
		MemberDAO dao = new MemberDAO();
		
		ArrayList<MemberDTO> lists = dao.select();
		
		if(lists==null) {//lists�� ��ȯ���� null�̸� ȸ�� ������ �����ϴ� ���
			System.out.println("ȸ�� ������ �����ϴ�");
		}
		else {//��ȯ���� null�̾ƴϸ� iterator�� �̿��Ͽ� ���
			Iterator<MemberDTO> it = lists.iterator();
			while(it.hasNext()) {
				MemberDTO dto = it.next();
				System.out.print("���̵� : "+dto.getUserID()+ " , ");
				System.out.print("��й�ȣ : "+dto.getUserPW()+ " , ");
				System.out.print("�̸� : "+dto.getUserNAME()+ " , ");
				System.out.print("���� : "+dto.getUserAGE()+ "\n");
			}
		}
	}
}
