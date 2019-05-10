package org.java.memberDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.java.memberDTO.MemberDTO;

public class MemberDAO {
	// Connection ����
	private String dbURL = "jdbc:mysql://localhost:3306/javastudy?useSSL=false&serverTimezone=UTC";
	private String hostID = "root";
	private String hostPW = "12345";

	public MemberDAO() {
		// 1.����̹� �ε�
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹�OK");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("����̹�NO");
		}
	}

//����
	public int insert(String userID, String userPW, String userName, int userAge) {

		// �⺻�� 0
		int rs = 0;
		// Connect ����
		Connection conn = null;
		// SQLó��
		PreparedStatement pstm = null;
		// ���� ������
		String query = "";

		try {
			// DB����
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			// ���� query�� �Է�
			query = "insert into member(userID,userPW,userName,userAge) " + "values(?,?,?,?);";

			pstm = conn.prepareStatement(query); // PreparedStatement�� ����
			// SQL
			pstm.setString(1, userID);
			pstm.setString(2, userPW);
			pstm.setString(3, userName);
			pstm.setInt(4, userAge);

			// ����
			rs = pstm.executeUpdate(); // ��ȸ ���� Ż�� ���ϰ�1�̸� ����

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (conn != null)
					conn.close(); // ��������
				if (pstm != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
			}
		}
		return rs;
	}

	// ����
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
			rs = pstm.executeUpdate(); // ��ȸ ���� Ż�� ���ϰ�1�̸� ����

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

	// ����
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

			rs = pstm.executeUpdate(); // ��ȸ ���� Ż�� ���ϰ�1�̸� ����

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

	// ��ȸ ������ get
	public ArrayList<MemberDTO> select() {
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(dbURL, hostID, hostPW);
			query = "select userID, userPW, userName, userAge from member;";

			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			while (rs.next()) {
				String userID = rs.getString(1);
				String userPW = rs.getString(2);
				String userName = rs.getString(3);
				int userAge = rs.getInt(4);

				MemberDTO DTO = new MemberDTO(userID, userPW, userName, userAge);
				lists.add(DTO);
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
}
