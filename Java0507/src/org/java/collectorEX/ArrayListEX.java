package org.java.collectorEX;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

class sub1{
	//�ʵ����
		private String userID;
		private String userPW;
		//�⺻ ������ 
		public sub1() {
			super();
		}
		//�Ű����� ������
		public sub1(String userID, String userPW) {
			super();
			this.userID = userID;
			this.userPW = userPW;
		}
		//getters
		public String getUserID() {
			return userID;
		}
		public String getUserPW() {
			return userPW;
		}
		
		
		
}


public class ArrayListEX {
	public static void main(String[] args) {
	
			ArrayList<sub1> s1=new ArrayList<sub1>();
			s1.add(new sub1("m1", "11"));
			s1.add(new sub1("m1", "11"));
			s1.add(new sub1("m3", "31"));
			s1.add(new sub1("m4", "41"));
			s1.add(new sub1("m5", "51"));

		//foreach <sub1>: Ÿ�� ���� //s1 :�÷���
			for(sub1 s : s1) {
					String userID = s.getUserID();
					String userPW = s.getUserPW();
					System.out.println("���̵� : "+userID+"     ");
					System.out.println("��й�ȣ : "+userPW+"     ");
			}		
			
			System.out.println();
			System.out.println();
		//Iterator
			java.util.Iterator<sub1> iterator =s1.iterator();
			while(iterator.hasNext()) {
				sub1 s=iterator.next(); // �÷����� ��� (sub1)
				String userID = s.getUserID();
				String userPW = s.getUserPW();
				System.out.println("���̵� : "+userID+"     ");
				System.out.println("��й�ȣ : "+userPW+"     ");
			}
			
}
}
