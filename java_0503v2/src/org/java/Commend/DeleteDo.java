package org.java.Commend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class DeleteDo implements QueryCommend{
	@Override
	public void excuteCommend() {
		System.out.println("ȸ�� ����");
		
		
		
		
		MemberDAO dao= new MemberDAO();
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("���̵� �Է� : ");
		String userID = sc.next();
		System.out.print("��й�ȣ �Է� : ");
		String userPW = sc.next();
		
		int result = dao.delete(userID, userPW);
		
		String url = "";
		
		if(result == 1) {
			url = "index�������� �̵�";
		}
		else {
			url ="ȸ�� Ż�� ���� �������� �̵�";
		}
		System.out.println(url);
	}
}
