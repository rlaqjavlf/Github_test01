package org.java.exceptionEX;

public class exceptionEX4 {
public static void main(String[] args)  {
	try {
		//1. 드라이버 
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("드라이버OK");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.out.println("드라이버NO");
	}finally {
		System.out.println("예외상관없이");
	}
}
}
