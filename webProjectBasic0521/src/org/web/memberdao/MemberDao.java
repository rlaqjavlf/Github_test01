package org.web.memberdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.web.MemberDTO.MemberDTO;
import org.web.dbconnect.DBConnect;


public class MemberDao {

	//�̱��� "�ѹ� ��ü�� ����"
	private static final MemberDao dao=new MemberDao();//�ѹ��� �ʱ�ȭ
	
	private MemberDao() {}// �����ڸ� private
	
	public static MemberDao getInstance() {
		//�ܺο��� MemberDao�� ������ �� static�ż���� ����.
		return MemberDao.dao;
	}
	
	public int insert(String userId,String userPw,String userName,int userAge) {
		
		int rs=0;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		String query="";
		
		conn=DBConnect.getConnection();
		query="insert into member(userId,userPw,userName,userAge)  "
				+ " values(?,?,?,?);";
		try {
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userName);
			pstm.setInt(4, userAge);
			
			rs=pstm.executeUpdate();//ȸ�� ���� ���� 1
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {				
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {}
		}
		
		return rs;
	}//ȸ����ȸ
	public ArrayList<MemberDTO> Members() {
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();
		// Connect ����
				Connection conn = null;
				// SQLó��
				PreparedStatement pstm = null;
				ResultSet rs = null;
				// ���� ������
				String query = "select userID, userPW, userName, userAge from member";
				
				try {
					conn=DBConnect.getConnection();
					pstm=conn.prepareStatement(query);
					//��ȸ, DB������ get
					rs = pstm.executeQuery();
					
					//DB�����Ͱ� ������ �ٰ����´�
					while(rs.next()) {
						MemberDTO DTO = new MemberDTO();
						//���1
						//DTO.setuserID(rs.getString("userID"));
						//DTO.setuserPW(rs.getString("userPW"));
						//DTO.setuserName(rs.getString("userName"));
						//DTO.setuserAge(rs.getInt("userAge"));
						//lists.add(DTO);
						
						//���2
						//String userID = rs.getString(1);
						 //String userPW = rs.getString(2);
						 //String userName = rs.getString(3);
						 //int userAge = rs.getInt(4);
						//MemberDTO DTO = MemverDTO(userI, userPW, userName, userAge) ;
						
						 lists.add(new MemberDTO(rs.getNString(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
						 
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
					//������ü�� Resultset��ü �ݾ��ֱ�
				}finally {
					try {
						if (conn != null) conn.close();
						if (pstm != null)conn.close();
						if (rs != null)conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}		
				return lists;		
			}
	
}
