package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberUpdateDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ����");
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է� :  ");
		String userID = sc.next();
		System.out.println("���� ��й�ȣ �Է� :  ");
		String  userPW= sc.next();
		System.out.println("���� �̸� �Է� :  ");
		String userName = sc.next();
		System.out.println("���� ���� �Է� :  ");
		int userAge = sc.nextInt();
	
		MemberDAO DAO = new MemberDAO();
		int rs =DAO.update(userID, userPW, userName, userAge);
		
		if (rs == 1) {
			System.out.println("ȸ����������");
		}else
			System.out.println("ȸ����������");
	}
	}


