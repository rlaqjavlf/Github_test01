package org.java.RamdaEX;

import java.util.Scanner;

interface Sub1{
	public void son(int a);
}
@FunctionalInterface
interface Sub2{
	void son2();
	
}
interface Sub3{
	void son3(int a, int b);
}
class Submain implements Sub1{

	@Override
	public void son(int a) {
			// TODO Auto-generated method stub
		System.out.println(a);
	}
	
}
public class RamdaEX2 {
public static void main(String[] args) {
	Sub1 sub1;
	//�͸�Ŭ����
	sub1=new Sub1() {
		@Override
		public void son(int a) {
			// TODO Auto-generated method stub
			System.out.println("�������̵� : "+a);
		}
		
	};
	sub1.son(100);
	//���ٽ�   �Ű�����(int) Ÿ���� ���������ϴ�, 
	//�Ű����ڰ� �ϳ��ϰ�� ���ΰ� ���������ϴ� (int a) -> a
	
	sub1=(int a)->{
		int num=a+10;
		System.out.println("���ٽ� : "+num);
	};
	sub1.son(100);
	
	//���๮��(ó����, ������)�� �ϳ��ϰ�� ����{}
	sub1= a ->System.out.println("���ٽ�2 : "+a);
	sub1.son(100);
	//======================================
	Sub2 sub2;
	//���ٽ� 
	sub2=()->{
		System.out.println("���ٽ����� ���� ");
	};
	
	Sub3 sub3;
	
	sub3=(int a, int b)->{
		System.out.println("�Ű����� 2�����������̽� ���ٽ� : "+(a+b));
	};
	sub3.son3(30, 50);
	
	
}
}
