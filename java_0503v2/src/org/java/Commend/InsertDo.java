package org.java.Commend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class InsertDo implements QueryCommend{
	@Override
	public void excuteCommend() {
		System.out.println("회원 가입");
		
		
		
		MemberDAO DAO = new MemberDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String userID=sc.next();
		System.out.print("비밀번호 입력 : ");
		String userPW=sc.next();
		System.out.print("이름 입력 : ");
		String userNAME=sc.next();
		System.out.print("나이 입력 : ");
		int userAGE=sc.nextInt();
		
		
		
		
		MemberDTO DTO = new MemberDTO(userID, userPW, userNAME, userAGE);
	
				int reult = DAO.insert(DTO);
	}
}
