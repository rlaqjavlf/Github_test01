package org.java.collectorEX;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.java.memberDTO.MemberDTO;

public class MapEX3 {
	public static void main(String[] args) {
					//키 key      값value
		Map<Integer, MemberDTO> map1 =new HashMap<Integer, MemberDTO>();
		
		
		// put 값을 입력  
		map1.put(1, new MemberDTO("m1","11","s1", 11));
		map1.put(2, new MemberDTO("m2","21","s2", 21));
		map1.put(3, new MemberDTO("m3","31","s3", 31));
		map1.put(4, new MemberDTO("m4","41","s4", 41));
		map1.put(4, new MemberDTO("m5","51","s5", 51));
		
		//map 키값만  >> set저장 
		Set<Integer> set1 =map1.keySet();
		//KeySet "map키값을 저장하는 Set" >> Iterator 사용
		Iterator<Integer> iterator = set1.iterator();
		//while 문으로
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			/*
			 * System.out.println( map1.get(key).getUserID() +"  ||  "+
			 * map1.get(key).getUserPW() +"  ||  "+ map1.get(key).getUserName() +"  ||  "+
			 * map1.get(key).getUserAge() );
			 */
			MemberDTO DTO = map1.get(key);
			System.out.println(DTO.getUserID()+" || "+
												DTO.getUserPW()+" || "+
												DTO.getUserName()+" || "+
												DTO.getUserAge()+" || ");
		}
	}
}
