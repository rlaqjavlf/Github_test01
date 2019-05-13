package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberLoginDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		System.out.println("로그인 입니다.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 :  ");
		String userID = sc.next();
		
		System.out.print("비밀번호 입력 :  ");
		String userPW = sc.next();
		
		MemberDAO DAO = new MemberDAO();
		boolean bool=DAO.Login(userID, userPW);
		
		if(bool ==true) {
			System.out.println("로그인 완료했습니다.");
		}else {
			System.out.println("아이디확인해주세요.");
			System.out.println("비밀번호확인해주세요.");
			
		}
	}
	}


