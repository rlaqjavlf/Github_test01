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
	//익명클래스
	sub1=new Sub1() {
		@Override
		public void son(int a) {
			// TODO Auto-generated method stub
			System.out.println("오버라이드 : "+a);
		}
		
	};
	sub1.son(100);
	//람다식   매개변수(int) 타입은 생략가능하다, 
	//매개인자가 하나일경우 가로가 생략가능하다 (int a) -> a
	
	sub1=(int a)->{
		int num=a+10;
		System.out.println("람다식 : "+num);
	};
	sub1.son(100);
	
	//실행문이(처리문, 구현문)이 하나일경우 생략{}
	sub1= a ->System.out.println("람다식2 : "+a);
	sub1.son(100);
	//======================================
	Sub2 sub2;
	//람다식 
	sub2=()->{
		System.out.println("람다식으로 구현 ");
	};
	
	Sub3 sub3;
	
	sub3=(int a, int b)->{
		System.out.println("매개변수 2개인이터페이스 람다식 : "+(a+b));
	};
	sub3.son3(30, 50);
	
	
}
}
