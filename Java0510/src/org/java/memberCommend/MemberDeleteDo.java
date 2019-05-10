package org.java.memberCommend;

import java.util.Scanner;

import org.java.memberDAO.MemberDAO;

public class MemberDeleteDo implements QueryCommend{

	@Override
	public void excuteQueryCommend() {
		// TODO Auto-generated method stub
		System.out.println("È¸¿ø Å»Åð");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Å»ÅðÇÏ½Ç¾ÆÀÌµð ÀÔ·Â :  ");
		String userID = sc.next();
		System.out.println("Å»ÅðÇÏ½Çºñ¹Ð¹øÈ£ ÀÔ·Â :  ");
		String  userPW= sc.next();
		
		MemberDAO DAO = new MemberDAO();
		int rs = DAO.delete(userID, userPW);
		
		if(rs == 1) {
			System.out.println("È¸¿ø Å»Åð ¼º°ø");
		}else {
			System.out.println("È¸¿ø Å»Åð ½ÇÆÐ");
		}
		
	
	}

}
