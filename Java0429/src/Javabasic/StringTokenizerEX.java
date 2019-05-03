package Javabasic;

import java.util.StringTokenizer;

public class StringTokenizerEX {
public static void main(String[] args) {
	
	//구분토큰(delimiter)
	//토큰(token)
	
	String query="userID=m1&userPW&username=s1";
	
	StringTokenizer st2 = new StringTokenizer(query,"&=");
	
	System.out.println(st2.hasMoreTokens());	//토큰의 갯수
	
	//토큰이 존재하면 
	
	while(st2.hasMoreTokens()) {
		System.out.println(st2.hasMoreTokens());
	}
	
}
}
