package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberDeleteDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		// TODO Auto-generated method stub
		
		System.out.println("ȸ�� Ż��");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ż���ϽǾ��̵� �Է� :  ");
		String userID = sc.next();
		System.out.println("Ż���ϽǺ�й�ȣ �Է� :  ");
		String  userPW= sc.next();
		
		MemberDAO DAO = new MemberDAO();
		boolean bool=DAO.Login(userID, userPW);
		
		if(bool ==true) {
			System.out.println("�α��� �Ϸ��߽��ϴ�.");
		}else {
			System.out.println("���̵�Ȯ�����ּ���.");
			System.out.println("��й�ȣȮ�����ּ���.");
			
		}
		
		
		MemberDAO DAO2 = new MemberDAO();
		int rs = DAO2.delete(userID, userPW);
		
		if(rs == 1) {
			System.out.println("ȸ�� Ż�� ����");
		}else {
			System.out.println("ȸ�� Ż�� ����");
		}
		
	
	}

}
