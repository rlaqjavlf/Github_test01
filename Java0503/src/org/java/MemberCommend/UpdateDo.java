package org.java.MemberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class UpdateDo implements QueryCommend {

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		System.out.println("회원 수정 ");
		
		MemberDAO DAO =new MemberDAO();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요 : ");
		
		String userId=sc.next();

		
	}

}
