package org.java.exceptionEX;

import java.util.Scanner;

public class exceptionEX1 {
public static void main(String[] args) {
	System.out.println("����ó��");
	//ù��° ����(����) �Է�
	Scanner sc =new Scanner(System.in);
	System.out.println("�����Է� : ");
	int num = sc.nextInt();
	
	//���ܸ�ó���ϰ� ���α׷��� ���� ������
	try {
	System.out.println("�������Է� : ");
	int div =sc.nextInt();// 0�Է� ���� �߻�
	System.out.println(num/div);
	}catch(ArithmeticException e) {//0���� �������� �� ����ó�� 
		e.printStackTrace(); // �ֿܼ� ���� ���� ǥ��
		System.out.println("���� �޽���"+e.getMessage());
		System.out.println("���ܹ߻��� ����");
	}finally {
		System.out.println("���� ���� ������� ����(ó��)");
	}
	System.out.println("���α׷� ���� ����");
}
}
