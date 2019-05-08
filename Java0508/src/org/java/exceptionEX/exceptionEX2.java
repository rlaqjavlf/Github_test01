package org.java.exceptionEX;

public class exceptionEX2 {
public static void main(String[] args) {
	int[] arrInt = new int[5];
	//try~catch~finally
	try {
		for(int i=0; i<5; i++) {
			arrInt[i]=i;
		}
		for(int i=0; i<6;i++) {
			System.out.println("arrInt["+i+"]="+arrInt[i]);
		
	}
	}catch(ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}finally{
		System.out.println("예외유무와 상관없이 처리(실행)");
	}
	System.out.println("프로그램 정상종료");
}
}
