package org.java.Commend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class UpdateDo implements QueryCommend{
	@Override
	public void excuteCommend() {
		System.out.println("ȸ�� ����");
		//�α��� ���� �����ͺ��̽��� ���̵�� ��ȸ�ϰ�(Session�̿�) �����͸� �������� ����
		
		
		MemberDAO dao = new MemberDAO();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է� : ");
		String userID = sc.next();
		
		MemberDTO list = dao.member(userID);
		
		if(list!=null) {
			System.out.println("ȸ�� �����۾� ����");
		}
		else {
			System.out.println("ȸ�� ���� �۾� ����");
		}
	}
}
