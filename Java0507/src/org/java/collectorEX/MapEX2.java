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
		//객체를 생성시 자동으로 userID,userPW 
		public void subInfo() {
			System.out.println("아이디 : "+ userID + "      ");
			System.out.println("비밀번호 : "+ userPW + "      ");
			
		}
}

public class MapEX2 {
		public static void main(String[] args) {
			Map<Integer, MapSub> map1 = new HashMap<Integer, MapSub>();
			
			map1.put(1, new MapSub("m1", "11"));
			map1.put(2, new MapSub("m1", "11")); // 키값은 중복허용인 안된다 
			map1.put(2, new MapSub("m2", "21"));
			map1.put(3, new MapSub("m3", "31"));
			map1.put(4, new MapSub("m4", "41"));
			map1.put(5, new MapSub("m5", "51"));
			System.out.println(map1.size());
			// map 키값만  >> set 저장 
			Set<Integer> set1 = map1.keySet();
			//KeySet "map키값을 저장하는 Set" >> Iterator 사용
			Iterator<Integer> iterator = set1.iterator();
			//while 문으로 
			while(iterator.hasNext()) {
				Integer key = iterator.next();
				map1.get(key).subInfo();
				
			}
			
		}
}
