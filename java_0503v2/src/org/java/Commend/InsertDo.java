package org.java.Commend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class InsertDo implements QueryCommend{
	@Override
	public void excuteCommend() {
		System.out.println("ȸ�� ����");
		
		
		
		MemberDAO DAO = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� �Է� : ");
		String userID=sc.next();
		System.out.print("��й�ȣ �Է� : ");
		String userPW=sc.next();
		System.out.print("�̸� �Է� : ");
		String userNAME=sc.next();
		System.out.print("���� �Է� : ");
		int userAGE=sc.nextInt();
		
		
		
		
		MemberDTO DTO = new MemberDTO(userID, userPW, userNAME, userAGE);
	
				int reult = DAO.insert(DTO);
	}
}
