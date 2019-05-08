package org.java.exceptionEX;

import java.util.Scanner;

public class exceptionEX1 {
public static void main(String[] args) {
	System.out.println("예외처리");
	//첫번째 숫자(정수) 입력
	Scanner sc =new Scanner(System.in);
	System.out.println("정수입력 : ");
	int num = sc.nextInt();
	
	//예외를처리하고 프로그램이 정상 실행후
	try {
	System.out.println("나눔수입력 : ");
	int div =sc.nextInt();// 0입력 예외 발생
	System.out.println(num/div);
	}catch(ArithmeticException e) {//0으로 나누었을 떄 예외처리 
		e.printStackTrace(); // 콘솔에 예외 구문 표시
		System.out.println("예외 메시지"+e.getMessage());
		System.out.println("예외발생시 실행");
	}finally {
		System.out.println("예외 유무 상관없이 실행(처리)");
	}
	System.out.println("프로그램 정상 종료");
}
}
