package org.java.MemberDAO;

import java.util.ArrayList;

import org.java.memberDTO.MemberDTO;

public class MemberDAO {
	//�⺻������==============================
	public MemberDAO() {
		System.out.println("DAO");
	}
	
	//ȸ�� ���� 
	public boolean insert(String userID, String userPW, String userName, int userAge) {
		boolean rs =false;
		//��� ����Ʈ ��ü ���� 
		ArrayList<MemberDTO> member=new ArrayList<MemberDTO>();
		
		member.add(new MemberDTO(userID, userPW, userName, userAge));
		
		if(member.get(0)!=null) {
				System.out.println("ȸ�� ���� ����");
				rs= true;
		}else {
			System.out.println("ȸ�� ���� ����");
		}
			return rs;
	}
	//ȸ�� ���� 
	public boolean update(MemberDTO member) {
		boolean rs =false;
		ArrayList<MemberDTO> memberArr = new ArrayList<MemberDTO>();
		
		memberArr.add(new MemberDTO(member.getMemberID(),
												member.getMemberPW(),
												member.getMemberName(),
												member.getMemberAge()));
		
		if(memberArr.get(0)!=null) {
			System.out.println("ȸ�� ���� ����");
			rs=true;
		}else {
			System.out.println("ȸ�� ���� ����");
				rs=false;
		}
		return rs;
	}
	
	
	
	
	
	
	
}
