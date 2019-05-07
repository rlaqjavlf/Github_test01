package org.java.MemberDAO;

import java.lang.reflect.Member;
import java.util.ArrayList;

import org.java.MemberDTO.MemberDTO;

public class MemberDAO {

	public MemberDAO() {
		System.out.println("DAO");
	}

	public int insert(MemberDTO dto) {// �����ͺ��̽��� ����
		int result = 0;
		return result;
	}

	public int update(MemberDTO dto) {// �����ͺ��̽��� ����
		int result = 0;
		ArrayList<MemberDTO>member=
									new ArrayList<MemberDTO>();
		member.add(dto);
		result =1;	
		return result;
	}

	public ArrayList<MemberDTO> select() {// ��ü �����͸� ������
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();

		// �����ͺ��̽��� get
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "22", "s2", 11));
		lists.add(new MemberDTO("m3", "33", "s3", 11));
		lists.add(new MemberDTO("m4", "44", "s4", 11));
		lists.add(new MemberDTO("m5", "55", "s5", 11));

		return lists;
	}

	public int delete(String userID, String userPW) {// userID��userPW�� ��ġ�ϸ� ȸ��Ż�� ����(1)�ƴϸ�(������)
		int result = 0;
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();

		// �����ͺ��̽��� ������
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "22", "s2", 11));
		lists.add(new MemberDTO("m3", "33", "s3", 11));
		lists.add(new MemberDTO("m4", "44", "s4", 11));
		lists.add(new MemberDTO("m5", "55", "s5", 11));

		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).getUserID().equals(userID) && lists.get(i).getUserPW().equals(userPW)) {
				result = 1;// ȸ�� Ż�� ������
				break;
			} else {
				result = 0;// ȸ�� Ż�� ���н�
			}
		}

		return result;
	}

//Ư�� �����͸� ������
	public MemberDTO member(String userID) {
		MemberDTO list = null;
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();

		// �����ͺ��̽��� ������
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "22", "s2", 11));
		lists.add(new MemberDTO("m3", "33", "s3", 11));
		lists.add(new MemberDTO("m4", "44", "s4", 11));
		lists.add(new MemberDTO("m5", "55", "s5", 11));

		// userID�� ��ġ
		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).getUserID().equals(userID)) {
				list = new MemberDTO(lists.get(i).getUserID(), lists.get(i).getUserPW(), lists.get(i).getUserNAME(),
						lists.get(i).getUserAGE());
				return list;
			} else {
				System.out.println("��ġ�ϴ� �ɹ��� �����ϴ�.");
			}
		}
		return list;
	}

	public int MemeberLogin(String userID, String userPW) {// userID�� userPW�� ������ ���� �ٸ��� ����
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();
		int result = 0;

		// �����ͺ��̽��� ������
		lists.add(new MemberDTO("m1", "11", "s1", 11));
		lists.add(new MemberDTO("m2", "22", "s2", 11));
		lists.add(new MemberDTO("m3", "33", "s3", 11));
		lists.add(new MemberDTO("m4", "44", "s4", 11));
		lists.add(new MemberDTO("m5", "55", "s5", 11));

		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).getUserID().equals(userID) && lists.get(i).getUserPW().equals(userPW)) {
				result = 1;// ȸ�� Ż�� ������

				return result;// �޼ҵ�,�Լ��� return�� ������ ���ᰡ ��
			} else {
				result = 0;// ȸ�� Ż�� ���н�
			}
		}
		return result;

	
	
	}

}
