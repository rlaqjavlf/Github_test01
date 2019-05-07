package org.java.Commend;

import java.util.Scanner;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class ModifyDo implements QueryCommend{

	@Override
	public void excuteCommend() {
		// TODO Auto-generated method stub
		
		System.out.println("회원 수정");
		//userId,userPW,userName,userAge
		//Scanner를 이용해서 입력하고 
		//MemberDAO에 update메서드를 구현 
		//변환값이 1이면 "회원 수정 성공" 
		//변환값이 1이아니면 "회원 수정 실패" ==> 콘솔창에 표시
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력 : ");
		String userID=sc.next();
		System.out.print("비밀번호 입력 : ");
		String userPW=sc.next();
		System.out.print("이름 입력 : ");
		String userNAME=sc.next();
		System.out.print("나이 입력 : ");
		int userAGE=sc.nextInt();
		
		MemberDAO dao =new MemberDAO();
		
		int result = dao.update(new MemberDTO(userID, userPW, userNAME, userAGE));
	}
}
