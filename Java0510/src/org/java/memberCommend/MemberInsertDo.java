package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberInsertDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		// TODO Auto-generated method stub
		System.out.println("회원 가입");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디 입력 :  ");
		String userID = sc.next();
		System.out.println("비밀번호 입력 :  ");
		String  userPW= sc.next();
		System.out.println("이름 입력 :  ");
		String userName = sc.next();
		System.out.println("나이 입력 :  ");
		int userAge = sc.nextInt();
	
		MemberDAO DAO = new MemberDAO();
		int rs =DAO.insert(userID, userPW, userName, userAge);
		
		if (rs == 1) {
			System.out.println("회원가입성공 ");
		}else
			System.out.println("회원가입실패");
	}

}
