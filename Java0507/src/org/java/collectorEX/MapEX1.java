package org.java.collectorEX;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEX1 {
	public static void main(String[] args) {
		System.out.println("Map");
		Map<String, String> map1 =new HashMap<String, String>();
							//Ű,         ��      "Ű�� �ߺ��� ����� �ȵȴ�"  
		map1.put("Java1", "JSP");  //�߰�
		map1.put("Java2", "Servet");  
		map1.put("Java3", "Spring");  
		//map1.clear(); ����� ����
		
		
		//get
			System.out.println(map1.get("Java1"));
			System.out.println(map1.get("Java2"));
			System.out.println(map1.get("Java3"));
				System.out.println(map1.size());
				
		
				
		//KeySet "MapŰ���� �����ϴ� Set"  >> Iterator���
		//1. Ű���� keySet() => Set
	Set<String>set1 = map1.keySet(); // Map�� Ű���� 
		//2. Iterator�� Set�� ���
	Iterator<String> iterator = set1.iterator();
	
		//3. while������ ��� 
	while(iterator.hasNext()) {
		String key=iterator.next(); // Map�� key�� ���
		System.out.println(key);
	}
				
	}
}
