package org.java.exceptionEX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionEX3 {
	public static void main(String[] args) {
		System.out.println("입력오류");
		//콘솔에정수를 입력하여 콘솔에 출력 
		//InputMismatchException
	
		System.out.println("정수입력");
		Scanner sc = new Scanner(System.in);
		
		try {
		int num = sc.nextInt();
		System.out.println(num);
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}finally {
			System.out.println("예외 상관 없이 실행");
		}
		
		
		System.out.println("프로그램 종료");
	}
}
