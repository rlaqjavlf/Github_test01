package org.java.collectonEX;

import java.util.ArrayList;

public class ArrayListEX1 {
public static void main(String[] args) {
	System.out.println("ArrayList");
	//int,정수형 5개를 저장 
	ArrayList<Integer> a1 =new ArrayList<Integer>();
	a1.add(new Integer(10)); //박싱 	 
	a1.add(20);// 자동 박싱
	a1.add(30);
	a1.add(40);
	a1.add(50);
	System.out.println(a1.size());
	
	//a1.clear();// 모든요소 삭제
	
	System.out.println(a1.size());
	a1.add(2, 100); //특정요소 추가 
	//확장 for문 
	
	for (Integer i:a1) {
		System.out.println(i.intValue()+"  ");
	}
	System.out.println("================================");
	
	//인덱스 삭제 
	a1.remove(0);

	for (Integer i:a1) {
		System.out.println(i.intValue()+"  ");
	}
	System.out.println("================================");
	
	
}
}
