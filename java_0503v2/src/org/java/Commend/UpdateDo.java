package org.java.Commend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class UpdateDo implements QueryCommend{
	@Override
	public void excuteCommend() {
		System.out.println("회원 수정");
		//로그인 이후 데이터베이스의 아이디로 조회하고(Session이용) 데이터를 가져온후 수정
		
		
		MemberDAO dao = new MemberDAO();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String userID = sc.next();
		
		MemberDTO list = dao.member(userID);
		
		if(list!=null) {
			System.out.println("회원 수정작업 진행");
		}
		else {
			System.out.println("회원 수정 작업 실패");
		}
	}
}
