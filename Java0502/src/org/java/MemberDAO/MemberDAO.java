package org.java.MemberDAO;

import java.util.ArrayList;

import org.java.memberDTO.MemberDTO;

public class MemberDAO {
	//기본생성자==============================
	public MemberDAO() {
		System.out.println("DAO");
	}
	
	//회원 가입 
	public boolean insert(String userID, String userPW, String userName, int userAge) {
		boolean rs =false;
		//어레이 리스트 객체 생성 
		ArrayList<MemberDTO> member=new ArrayList<MemberDTO>();
		
		member.add(new MemberDTO(userID, userPW, userName, userAge));
		
		if(member.get(0)!=null) {
				System.out.println("회원 가입 성공");
				rs= true;
		}else {
			System.out.println("회원 가입 실패");
		}
			return rs;
	}
	//회원 수정 
	public boolean update(MemberDTO member) {
		boolean rs =false;
		ArrayList<MemberDTO> memberArr = new ArrayList<MemberDTO>();
		
		memberArr.add(new MemberDTO(member.getMemberID(),
												member.getMemberPW(),
												member.getMemberName(),
												member.getMemberAge()));
		
		if(memberArr.get(0)!=null) {
			System.out.println("회원 수정 성공");
			rs=true;
		}else {
			System.out.println("회원 수정 실패");
				rs=false;
		}
		return rs;
	}
	
	
	
	
	
	
	
}
