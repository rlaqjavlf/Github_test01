package org.web.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static Connection getConnection() {
		
		Connection conn=null;
		
		String url="jdbc:mysql://localhost:3306/javaStudy?useSSL=false&serverTimezone=UTC";
		String user="root";
		String password="12345";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//����̹� �ε�
			System.out.println("����̹�OK");

			conn=DriverManager.getConnection(url, user, password);//DB����
			System.out.println("DB���� OK");			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return conn;
	}
}
