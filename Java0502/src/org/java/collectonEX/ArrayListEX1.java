package org.java.collectonEX;

import java.util.ArrayList;

public class ArrayListEX1 {
public static void main(String[] args) {
	System.out.println("ArrayList");
	//int,������ 5���� ���� 
	ArrayList<Integer> a1 =new ArrayList<Integer>();
	a1.add(new Integer(10)); //�ڽ� 	 
	a1.add(20);// �ڵ� �ڽ�
	a1.add(30);
	a1.add(40);
	a1.add(50);
	System.out.println(a1.size());
	
	//a1.clear();// ����� ����
	
	System.out.println(a1.size());
	a1.add(2, 100); //Ư����� �߰� 
	//Ȯ�� for�� 
	
	for (Integer i:a1) {
		System.out.println(i.intValue()+"  ");
	}
	System.out.println("================================");
	
	//�ε��� ���� 
	a1.remove(0);

	for (Integer i:a1) {
		System.out.println(i.intValue()+"  ");
	}
	System.out.println("================================");
	
	
}
}
