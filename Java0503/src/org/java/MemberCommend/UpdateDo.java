package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class UpdateDo implements QueryCommend {

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		System.out.println("ȸ�� ���� ");
		
		MemberDAO DAO =new MemberDAO();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("���̵� �Է��ϼ��� : ");
		
		String userId=sc.next();

		
	}

}
