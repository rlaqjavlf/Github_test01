package org.java.exceptionEX;

public class exceptionEX4 {
public static void main(String[] args)  {
	try {
		//1. ����̹� 
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("����̹�OK");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.out.println("����̹�NO");
	}finally {
		System.out.println("���ܻ������");
	}
}
}
