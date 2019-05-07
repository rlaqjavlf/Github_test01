package org.java.Commend;

import java.util.ArrayList;
import java.util.Iterator;

import org.java.MemberDAO.MemberDAO;
import org.java.MemberDTO.MemberDTO;

public class SelectDo implements 	QueryCommend{
	@Override
	public void excuteCommend() {
		System.out.println("회원 조회");
		
		
		MemberDAO dao = new MemberDAO();
		
		ArrayList<MemberDTO> lists = dao.select();
		
		if(lists==null) {//lists의 반환값이 null이면 회원 정보가 없습니다 출력
			System.out.println("회원 정보가 없습니다");
		}
		else {//반환값이 null이아니면 iterator를 이용하여 출력
			Iterator<MemberDTO> it = lists.iterator();
			while(it.hasNext()) {
				MemberDTO dto = it.next();
				System.out.print("아이디 : "+dto.getUserID()+ " , ");
				System.out.print("비밀번호 : "+dto.getUserPW()+ " , ");
				System.out.print("이름 : "+dto.getUserNAME()+ " , ");
				System.out.print("나이 : "+dto.getUserAGE()+ "\n");
			}
		}
	}
}
