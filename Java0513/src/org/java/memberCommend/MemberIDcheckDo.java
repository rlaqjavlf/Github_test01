package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberIDcheckDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		

		System.out.println("���̵� üũ�Դϴ�.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է� :  ");
		
		String userID = sc.next();
		
		MemberDAO DAO = new MemberDAO();
		boolean bool=DAO.IDcheck(userID);
		
		if(bool ==false) {
			System.out.println("���̵��������� �ʽ��ϴ�.");
		}else {
			System.out.println("�ߺ����̵��Դϴ�.");
			System.out.println("�����ϴ¾��̵��Դϴ�.");
		}
	}

}
