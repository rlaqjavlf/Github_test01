package org.java.Commend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class ModifyDo implements QueryCommend{

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		
		System.out.println("ȸ�� ����");
		//userId,userPW,userName,userAge
		//Scanner�� �̿��ؼ� �Է��ϰ� 
		//MemberDAO�� update�޼��带 ���� 
		//��ȯ���� 1�̸� "ȸ�� ���� ����" 
		//��ȯ���� 1�̾ƴϸ� "ȸ�� ���� ����" ==> �ܼ�â�� ǥ��
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� �Է� : ");
		String userID=sc.next();
		System.out.print("��й�ȣ �Է� : ");
		String userPW=sc.next();
		System.out.print("�̸� �Է� : ");
		String userNAME=sc.next();
		System.out.print("���� �Է� : ");
		int userAGE=sc.nextInt();
		
		MemberDAO dao =new MemberDAO();
		
		int result = dao.update(new MemberDTO(userID, userPW, userNAME, userAGE));
	}
}
