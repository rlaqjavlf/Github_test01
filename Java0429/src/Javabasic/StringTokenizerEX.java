package Javabasic;

import java.util.StringTokenizer;

public class StringTokenizerEX {
public static void main(String[] args) {
	
	//������ū(delimiter)
	//��ū(token)
	
	String query="userID=m1&userPW&username=s1";
	
	StringTokenizer st2 = new StringTokenizer(query,"&=");
	
	System.out.println(st2.hasMoreTokens());	//��ū�� ����
	
	//��ū�� �����ϸ� 
	
	while(st2.hasMoreTokens()) {
		System.out.println(st2.hasMoreTokens());
	}
	
}
}
