package org.java.exceptionEX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionEX3 {
	public static void main(String[] args) {
		System.out.println("�Է¿���");
		//�ֿܼ������� �Է��Ͽ� �ֿܼ� ��� 
		//InputMismatchException
	
		System.out.println("�����Է�");
		Scanner sc = new Scanner(System.in);
		
		try {
		int num = sc.nextInt();
		System.out.println(num);
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}finally {
			System.out.println("���� ��� ���� ����");
		}
		
		
		System.out.println("���α׷� ����");
	}
}
