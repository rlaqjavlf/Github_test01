package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberDeleteDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		// TODO Auto-generated method stub
		
		System.out.println("회원 탈퇴");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("탈퇴하실아이디 입력 :  ");
		String userID = sc.next();
		System.out.println("탈퇴하실비밀번호 입력 :  ");
		String  userPW= sc.next();
		
		MemberDAO DAO = new MemberDAO();
		boolean bool=DAO.Login(userID, userPW);
		
		if(bool ==true) {
			System.out.println("로그인 완료했습니다.");
		}else {
			System.out.println("아이디확인해주세요.");
			System.out.println("비밀번호확인해주세요.");
			
		}
		
		
		MemberDAO DAO2 = new MemberDAO();
		int rs = DAO2.delete(userID, userPW);
		
		if(rs == 1) {
			System.out.println("회원 탈퇴 성공");
		}else {
			System.out.println("회원 탈퇴 실패");
		}
		
	
	}

}
