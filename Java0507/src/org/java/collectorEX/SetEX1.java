package org.java.collectorEX;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



/*
 * Set : ������ ���� �ߺ��Ұ��� 
 */
public class SetEX1 {
	public static void main(String[] args) {
		System.out.println("Set");
		//ArrayList�ߺ��� ����
		ArrayList<String> list =new ArrayList<String>();
		list.add("m1");
		list.add("m1");
		list.add("m1");
		list.add("m1");
		list.add("m1");
		System.out.println(list.size());
		Iterator<String> iterator=list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
		
		
		//��ü�� �̿��ؼ�
		//�ߺ��� ���ȉ�
		HashSet<String> set1 =new HashSet<String>();
		set1.add("m1");
		set1.add("m1");
		set1.add("m1");
		set1.add("m1");
		set1.add("m1");
		System.out.println(set1.size());
		Iterator<String> iterator2=list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		
		Set<String> set2=new HashSet<String>();
		
}
}
