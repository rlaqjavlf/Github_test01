package org.java.Commend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;

public class DeleteDo implements QueryCommend{
	@Override
	public void excuteCommend() {
		System.out.println("회원 삭제");
		
		
		
		
		MemberDAO dao= new MemberDAO();
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String userID = sc.next();
		System.out.print("비밀번호 입력 : ");
		String userPW = sc.next();
		
		int result = dao.delete(userID, userPW);
		
		String url = "";
		
		if(result == 1) {
			url = "index페이지로 이동";
		}
		else {
			url ="회원 탈퇴 실패 페이지로 이동";
		}
		System.out.println(url);
	}
}
