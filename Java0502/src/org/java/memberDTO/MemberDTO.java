package org.java.memberDTO;

public class MemberDTO {
	// �ʵ�=========================================
	private String memberID;
	private String memberPW;
	private String memberName;
	private int memberAge;

	// ������============================================
	public String getMemberID() {
		return memberID;
	}
	
	public MemberDTO(String memberID, String memberPW, String memberName, int memberAge) {
		super();
		this.memberID = memberID;
		this.memberPW = memberPW;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}
	// getter setter �żҵ�=====================================


	public MemberDTO() {
		super();
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

}
