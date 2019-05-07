package org.java.Commend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class MemberLoginDO implements QueryCommend{
	
	@Override
	public void excuteCommend() {
		System.out.println("로그인");
		
		
		
		MemberDAO dao= new MemberDAO();
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String userID = sc.next();
		System.out.print("비밀번호 입력 : ");
		String userPW = sc.next();
		
		int result = dao.MemeberLogin(userID, userPW);
		
		if(result ==1) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
}
