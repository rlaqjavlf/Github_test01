package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class DeleteDo implements QueryCommend {

	@Override
	public void excuteCommend() {
		
		MemberDAO dao = new MemberDAO();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ ���̵� : ");
		String userID = scan.next();
		
		System.out.print("������ ��й�ȣ : ");
		String userPW = scan.next();
		
		int result = dao.delete(userID, userPW);
		
		if (result == 1) {
			System.out.println("ȸ�� Ż�� ����");
		} else {
			System.out.println("ȸ�� Ż�� ����");
		}
		
	}

}
