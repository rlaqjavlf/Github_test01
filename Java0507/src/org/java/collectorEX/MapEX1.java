package org.java.collectorEX;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEX1 {
	public static void main(String[] args) {
		System.out.println("Map");
		Map<String, String> map1 =new HashMap<String, String>();
							//키,         값      "키는 중복이 허용이 안된다"  
		map1.put("Java1", "JSP");  //추가
		map1.put("Java2", "Servet");  
		map1.put("Java3", "Spring");  
		//map1.clear(); 모든요소 삭제
		
		
		//get
			System.out.println(map1.get("Java1"));
			System.out.println(map1.get("Java2"));
			System.out.println(map1.get("Java3"));
				System.out.println(map1.size());
				
		
				
		//KeySet "Map키값을 저장하는 Set"  >> Iterator사용
		//1. 키값을 keySet() => Set
	Set<String>set1 = map1.keySet(); // Map의 키값만 
		//2. Iterator에 Set을 사용
	Iterator<String> iterator = set1.iterator();
	
		//3. while문으로 출력 
	while(iterator.hasNext()) {
		String key=iterator.next(); // Map의 key가 출력
		System.out.println(key);
	}
				
	}
}
