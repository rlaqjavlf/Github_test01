package org.java.memberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class MemberInsertDo implements MemberCommend{

	@Override
	public void excuteQueryCommend() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ����");
		
		MemberDAO DAO = new MemberDAO(); //�̱���
			
		Scanner sc =new Scanner(System.in);
		System.out.println("���̵� �Է� : " );
		String userID=sc.next();
		
		System.out.println("��� �Է� : " );
		String userPW=sc.next();
		
		System.out.println("�̸� �Է� : " );
		String userName=sc.next();
		
		System.out.println("���� �Է� : " );
		int userAge=sc.nextInt();
		
		boolean rs =	DAO.insert(userID, userPW, userName, userAge);

		String ur1 = " ";
		
		if (rs=true) {
			System.out.println("ȸ�� ���� ���� �������� �̵� ");
		}else {
			System.out.println("ȸ�� ���� ���� �������� �̵�");
		}
	}

}
