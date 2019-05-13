package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberIDcheckDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		

		System.out.println("아이디 체크입니다.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 :  ");
		
		String userID = sc.next();
		
		MemberDAO DAO = new MemberDAO();
		boolean bool=DAO.IDcheck(userID);
		
		if(bool ==false) {
			System.out.println("아이디가존재하지 않습니다.");
		}else {
			System.out.println("중복아이디입니다.");
			System.out.println("존재하는아이디입니다.");
		}
	}

}
