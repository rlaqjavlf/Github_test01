package org.java.MemberDAO;

import java.lang.reflect.Member;
import java.util.ArrayList;

import org.java.MemberDTO.MemberDTO;

public class MemberDAO {

	public MemberDAO() {
		System.out.println("DAO");
	}

	public int insert(MemberDTO dto) {// 데이터베이스를 세팅
		int result = 0;
		return result;
	}

	public int update(MemberDTO dto) {// 데이터베이스를 세팅
		int result = 0;
		ArrayList<MemberDTO>member=
									new ArrayList<MemberDTO>();
		member.add(dto);
		result =1;	
		return result;
	}

	public ArrayList<MemberDTO> select() {// 전체 데이터를 가져옴
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();

		// 데이터베이스를 get
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "22", "s2", 11));
		lists.add(new MemberDTO("m3", "33", "s3", 11));
		lists.add(new MemberDTO("m4", "44", "s4", 11));
		lists.add(new MemberDTO("m5", "55", "s5", 11));

		return lists;
	}

	public int delete(String userID, String userPW) {// userID와userPW가 일치하면 회원탈퇴 성공(1)아니면(나머지)
		int result = 0;
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();

		// 데이터베이스를 가져옴
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "22", "s2", 11));
		lists.add(new MemberDTO("m3", "33", "s3", 11));
		lists.add(new MemberDTO("m4", "44", "s4", 11));
		lists.add(new MemberDTO("m5", "55", "s5", 11));

		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).getUserID().equals(userID) && lists.get(i).getUserPW().equals(userPW)) {
				result = 1;// 회원 탈퇴 성공시
				break;
			} else {
				result = 0;// 회원 탈퇴 실패시
			}
		}

		return result;
	}

//특정 데이터를 가져옴
	public MemberDTO member(String userID) {
		MemberDTO list = null;
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();

		// 데이터베이스를 가져옴
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "22", "s2", 11));
		lists.add(new MemberDTO("m3", "33", "s3", 11));
		lists.add(new MemberDTO("m4", "44", "s4", 11));
		lists.add(new MemberDTO("m5", "55", "s5", 11));

		// userID만 일치
		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).getUserID().equals(userID)) {
				list = new MemberDTO(lists.get(i).getUserID(), lists.get(i).getUserPW(), lists.get(i).getUserNAME(),
						lists.get(i).getUserAGE());
				return list;
			} else {
				System.out.println("일치하는 맴버가 없습니다.");
			}
		}
		return list;
	}

	public int MemeberLogin(String userID, String userPW) {// userID와 userPW가 같을시 성공 다를시 실패
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();
		int result = 0;

		// 데이터베이스를 가져옴
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "22", "s2", 11));
		lists.add(new MemberDTO("m3", "33", "s3", 11));
		lists.add(new MemberDTO("m4", "44", "s4", 11));
		lists.add(new MemberDTO("m5", "55", "s5", 11));

		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).getUserID().equals(userID) && lists.get(i).getUserPW().equals(userPW)) {
				result = 1;// 회원 탈퇴 성공시

				return result;// 메소드,함수가 return을 만나면 종료가 됨
			} else {
				result = 0;// 회원 탈퇴 실패시
			}
		}
		return result;

	
	
	}

}
