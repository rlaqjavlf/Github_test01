package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberInsertDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ����");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� �Է� :  ");
		String userID = sc.next();
		System.out.println("��й�ȣ �Է� :  ");
		String  userPW= sc.next();
		System.out.println("�̸� �Է� :  ");
		String userName = sc.next();
		System.out.println("���� �Է� :  ");
		int userAge = sc.nextInt();
	
		MemberDAO DAO = new MemberDAO();
		int rs =DAO.insert(userID, userPW, userName, userAge);
		
		if (rs == 1) {
			System.out.println("ȸ�����Լ��� ");
		}else
			System.out.println("ȸ�����Խ���");
	}

}
