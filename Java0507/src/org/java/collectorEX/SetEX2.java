package org.java.collectorEX;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class sub2 {
	private String ID;
	private int PW;

	public sub2(String iD, int pW) {
		super();
		ID = iD;
		PW = pW;
	}

	@Override // �ܺο��� ��(������ ��ü)
	public boolean equals(Object obj) {
		if (obj instanceof sub2) {
			sub2 setsub = (sub2) obj;
			return setsub.ID.equals(ID) && setsub.PW == PW;
		} else {
			return false;
		}
	}

	public int hascode() {
		return ID.hashCode() + PW;

	}

}

public class SetEX2 {
	public static void main(String[] args) {
	
		sub2 s1 =new sub2("m1", 11);
		sub2 s2 =new sub2("m1", 11);
				System.out.println(s1.equals(s2));
	
		Set<sub2> set1 =new HashSet<sub2>();
			set1.add(new sub2("m1", 11));
			set1.add(new sub2("m1", 11));
			set1.add(new sub2("m3", 31));
			set1.add(new sub2("m4", 41));
			
			set1.remove("m3");	//m3 �����͸� ������
			set1.clear();             //��� ��� 
			
			System.out.println(set1);
			// set1.get(1) => set������������. �ε����� ����ϴ¸޼��� X
			
			Iterator<sub2> iterator = set1.iterator();
			
			
	
	
	
	
}
}
