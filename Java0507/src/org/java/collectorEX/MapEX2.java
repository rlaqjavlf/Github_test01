package org.java.collectorEX;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class MapSub{
		private String userID;
		private String userPW;
		
		public MapSub(String userID, String userPW) {
			super();
			this.userID = userID;
			this.userPW = userPW;
		}
		//��ü�� ������ �ڵ����� userID,userPW 
		public void subInfo() {
			System.out.println("���̵� : "+ userID + "      ");
			System.out.println("��й�ȣ : "+ userPW + "      ");
			
		}
}

public class MapEX2 {
		public static void main(String[] args) {
			Map<Integer, MapSub> map1 = new HashMap<Integer, MapSub>();
			
			map1.put(1, new MapSub("m1", "11"));
			map1.put(2, new MapSub("m1", "11")); // Ű���� �ߺ������ �ȵȴ� 
			map1.put(2, new MapSub("m2", "21"));
			map1.put(3, new MapSub("m3", "31"));
			map1.put(4, new MapSub("m4", "41"));
			map1.put(5, new MapSub("m5", "51"));
			System.out.println(map1.size());
			// map Ű����  >> set ���� 
			Set<Integer> set1 = map1.keySet();
			//KeySet "mapŰ���� �����ϴ� Set" >> Iterator ���
			Iterator<Integer> iterator = set1.iterator();
			//while ������ 
			while(iterator.hasNext()) {
				Integer key = iterator.next();
				map1.get(key).subInfo();
				
			}
			
		}
}
