package org.java.memberDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.java.memberDTO.MemberDTO;

public class MemberDAO {
	// Connection 연결
	private String dbURL = "jdbc:mysql://localhost:3306/javastudy?useSSL=false&serverTimezone=UTC";
	private String hostID = "root";
	private String hostPW = "12345";

	public MemberDAO() {
		// 1.드라이버 로드
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버OK");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버NO");
		}
	}

//가입
	public int insert(String userID, String userPW, String userName, int userAge) {

		// 기본값 0
		int rs = 0;
		// Connect 생성
		Connection conn = null;
		// SQL처리
		PreparedStatement pstm = null;
		// 실제 쿼리문
		String query = "";

		try {
			// DB연동
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			// 실제 query문 입력
			query = "insert into member(userID,userPW,userName,userAge) " + "values(?,?,?,?);";

			pstm = conn.prepareStatement(query); // PreparedStatement에 저장
			// SQL
			pstm.setString(1, userID);
			pstm.setString(2, userPW);
			pstm.setString(3, userName);
			pstm.setInt(4, userAge);

			// 실행
			rs = pstm.executeUpdate(); // 조회 수정 탈퇴 리턴값1이면 성공

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (conn != null)
					conn.close(); // 연결해제
				if (pstm != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
		return rs;
	}

	// 삭제
	public int delete(String userID, String userPW) {
		int rs = 0;

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		try {
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			query = "delete from member where userID=? and userPW=?;";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userID);
			pstm.setString(2, userPW);
			rs = pstm.executeUpdate(); // 조회 수정 탈퇴 리턴값1이면 성공

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					;
				conn.close();
				if (conn != null)
					;
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
		return rs;
	}

	// 수정
	public int update(String userID, String userPW, String userName, int userAge) {
		int rs = 0;
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		try {
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			query = "update member set userPW=?, userName=?," + " userAge=? where userID=?;";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userPW);
			pstm.setString(2, userName);
			pstm.setInt(3, userAge);
			pstm.setString(4, userID);

			rs = pstm.executeUpdate(); // 조회 수정 탈퇴 리턴값1이면 성공

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (conn != null);conn.close();
				if (conn != null);conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
		return rs;
	}

	// 조회 데이터 get
	public ArrayList<MemberDTO> select() {
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();
		//연결객체생성
		Connection conn = null; //커넥션
		PreparedStatement pstm = null;//SQL처리객체
		String query = ""; // DB 데이터 get
		//중요 DB데이터 get
		ResultSet rs = null;

		try {//커넥션 연결
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			query = "select userID, userPW, userName, userAge from member;";
			//처리객체에 담는다
			pstm = conn.prepareStatement(query);
			
			//중요 DB의 데이터를 get할때 사용한다 (전제조회, 아이디 체크, 로그인)
			rs = pstm.executeQuery();
			
			//DB데이터가 존재하면  모두 get
			if(rs != null) {// ==> 입력값이 null아니면 //
			while (rs.next()) {
				String userID = rs.getString(1);
				String userPW = rs.getString(2);
				String userName = rs.getString(3);
				int userAge = rs.getInt(4);

				MemberDTO DTO = new MemberDTO(userID, userPW, userName, userAge);
				lists.add(DTO);
			}
				//
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					conn.close();
				if (rs != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lists;
	}
	//ID체크
	//select * from member where userId = ?; ==> boolean
	//select count(*) from member where userID = ?; ==> int
	public boolean IDcheck(String userID) {
		boolean bool = false;
		//아이디가 있으면 false ==> 회원가입시
		//아이디가 있으면 true ==> 로그인시 아이디존재
		Connection conn = null; //커넥션
		PreparedStatement pstm = null;//SQL처리객체
		String query = ""; // DB 데이터 get
		//중요 DB데이터 get
		ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			query = "select * from member where userId = ?;";
			//처리객체에 담는다
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1,	 userID);
			
			//중요 DB의 데이터를 get할때 사용한다 (전제조회, 아이디 체크, 로그인)
			rs = pstm.executeQuery();
			
			if(rs.next()) 
				bool = true; //아이디 존재하면 
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					conn.close();
				if (rs != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bool;
	}
	//로그인 아이디와 비번 일치 할떄만 true
	//먼저 아이디체크를 실행 하고 아이디가 존재할 때만 로그인을 실행할수있도록 프로그래밍
	public boolean Login(String userID, String userPW) {
		boolean bool =false;
		Connection conn = null; //커넥션
		PreparedStatement pstm = null;//SQL처리객체
		String query = ""; // DB 데이터 get
		//중요 DB데이터 get
		ResultSet rs = null;
		
		if (IDcheck(userID)!=true) {
				return bool;
		}
		try {
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			query = "select * from member where userID=? and userPW=?;";
			//처리객체에 담는다
			pstm = conn.prepareStatement(query);
			
			pstm.setString(1,	 userID);
			pstm.setString(2,	 userPW);
			
			//중요 DB의 데이터를 get할때 사용한다 (전제조회, 아이디 체크, 로그인)
			rs = pstm.executeQuery();
			
			
			if(rs.next()) 
				bool = true; //아이디와 비밀번호가 일치하면
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					conn.close();
				if (rs != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return bool;
		
	}
}
