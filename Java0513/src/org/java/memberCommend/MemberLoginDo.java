package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberLoginDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("�α��� �Դϴ�.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� �Է� :  ");
		String userID = sc.next();
		
		System.out.print("��й�ȣ �Է� :  ");
		String userPW = sc.next();
		
		MemberDAO DAO = new MemberDAO();
		boolean bool=DAO.Login(userID, userPW);
		
		if(bool ==true) {
			System.out.println("�α��� �Ϸ��߽��ϴ�.");
		}else {
			System.out.println("���̵�Ȯ�����ּ���.");
			System.out.println("��й�ȣȮ�����ּ���.");
			
		}
	}
	}


