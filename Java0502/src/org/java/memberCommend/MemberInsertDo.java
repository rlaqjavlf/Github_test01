package org.java.memberCommend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class MemberInsertDo implements MemberCommend{

	@Override
	public void excuteQueryCommend() {
		// TODO Auto-generated method stub
		System.out.println("회원 가입");
		
		MemberDAO DAO = new MemberDAO(); //싱글톤
			
		Scanner sc =new Scanner(System.in);
		System.out.println("아이디 입력 : " );
		String userID=sc.next();
		
		System.out.println("비번 입력 : " );
		String userPW=sc.next();
		
		System.out.println("이름 입력 : " );
		String userName=sc.next();
		
		System.out.println("나이 입력 : " );
		int userAge=sc.nextInt();
		
		boolean rs =	DAO.insert(userID, userPW, userName, userAge);

		String ur1 = " ";
		
		if (rs=true) {
			System.out.println("회원 가입 성공 페이지로 이동 ");
		}else {
			System.out.println("회원 가입 실패 페이지로 이동");
		}
	}

}
