package org.java.Commend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class MemberLoginDO implements QueryCommend{
	
	@Override
	public void excuteCommend() {
		System.out.println("�α���");
		
		
		
		MemberDAO dao= new MemberDAO();
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("���̵� �Է� : ");
		String userID = sc.next();
		System.out.print("��й�ȣ �Է� : ");
		String userPW = sc.next();
		
		int result = dao.MemeberLogin(userID, userPW);
		
		if(result ==1) {
			System.out.println("�α��� ����");
		}
		else {
			System.out.println("�α��� ����");
		}
	}
}
