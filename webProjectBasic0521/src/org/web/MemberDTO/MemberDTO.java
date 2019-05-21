package org.web.MemberDTO;

public class MemberDTO {
	
	private String userID;
	private String userPW;
	private String userName;
	private int userAge;
	
	public MemberDTO() {
		super();
	}

	public MemberDTO(String userID, String userPW, String userName, int userAge) {
		super();
		this.userID = userID;
		this.userPW = userPW;
		this.userName = userName;
		this.userAge = userAge;
	}

	public String getuserID() {
		return userID;
	}

	public void setuserID(String userID) {
		this.userID = userID;
	}

	public String getuserPW() {
		return userPW;
	}

	public void setuserPW(String userPW) {
		this.userPW = userPW;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public int getuserAge() {
		return userAge;
	}

	public void setuserAge(int userAge) {
		this.userAge = userAge;
	}
	
}
