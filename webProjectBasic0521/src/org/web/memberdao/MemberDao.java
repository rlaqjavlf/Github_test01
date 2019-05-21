package org.web.memberdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.web.MemberDTO.MemberDTO;
import org.web.dbconnect.DBConnect;


public class MemberDao {

	//싱글톤 "한번 객체를 생성"
	private static final MemberDao dao=new MemberDao();//한번만 초기화
	
	private MemberDao() {}// 생성자를 private
	
	public static MemberDao getInstance() {
		//외부에서 MemberDao에 접근할 때 static매서드로 접근.
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
			
			rs=pstm.executeUpdate();//회원 가입 성공 1
			
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
	}//회원조회
	public ArrayList<MemberDTO> Members() {
		ArrayList<MemberDTO> lists = new ArrayList<MemberDTO>();
		// Connect 생성
				Connection conn = null;
				// SQL처리
				PreparedStatement pstm = null;
				ResultSet rs = null;
				// 실제 쿼리문
				String query = "select userID, userPW, userName, userAge from member";
				
				try {
					conn=DBConnect.getConnection();
					pstm=conn.prepareStatement(query);
					//조회, DB데이터 get
					rs = pstm.executeQuery();
					
					//DB데이터가 있으면 다가져온다
					while(rs.next()) {
						MemberDTO DTO = new MemberDTO();
						//방법1
						//DTO.setuserID(rs.getString("userID"));
						//DTO.setuserPW(rs.getString("userPW"));
						//DTO.setuserName(rs.getString("userName"));
						//DTO.setuserAge(rs.getInt("userAge"));
						//lists.add(DTO);
						
						//방법2
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
					
					//구문객체와 Resultset객체 닫아주기
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
