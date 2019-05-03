package org.java.collectonEX;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import org.java.memberDTO.MemberDTO;

public class VectorEX1 {
public static void main(String[] args) {
			
	//백터 객체생성===============================		
	Vector<MemberDTO> members=new Vector<MemberDTO>();
	
	members.add(new MemberDTO("m1", "1111","s1",20));  //마지막요소 뒤에 자동으로 추가   
	members.add(new MemberDTO("m2", "2222","s2",23));    
	members.add(new MemberDTO("m3", "3333","s3",26));     
	members.add(new MemberDTO("m4", "4444","s4",27));     
	//=========================================
	
	
	
	members.add(new MemberDTO()); // 기본 생성자를 >>setters 
	System.out.println(	members.get(4).getMemberID()); //내용물이 없기떄문에 Null값이 나온다 
	//내용을 get, set을 이용해서 출력값을 입력한다
	members.get(4).setMemberID("m5");
	members.get(4).setMemberPW("5555");
	members.get(4).setMemberName("s5");
	members.get(4).setMemberAge(25);
			
	System.out.println(members.get(4).getMemberID());
	
	
	
	//Scanner를 이용해서 MemberDTO의 필드 userID, userPW, userName, userAge 한번
	//콘솔에 입력하고 Vector members의 모든요소를 Iterator를 이용해서 출력
	Scanner sc = new Scanner(System.in);
	members.add(new MemberDTO()); // 새로운 자리를 생성한다
	
	System.out.println("아이디입력 : ");
	members.get(5).setMemberID(sc.next());;
	System.out.println("비번입력 : ");
	members.get(5).setMemberPW(sc.next());			
	System.out.println("이름 입력 : ");
	members.get(5).setMemberName(sc.next());			
	System.out.println("나이 입력  : ");
	members.get(5).setMemberAge(sc.nextInt());
	
	for(int i=0; i<members.size(); i++) {
		System.out.print("아이디 : "+members.get(i).getMemberID()
										+"비번"+members.get(i).getMemberPW()
										+"이름"+members.get(i).getMemberName()
										+"나이"+members.get(i).getMemberAge());
	}
	
	
	//==============================================
	System.out.println();
	//Iterator -> 컬랙션(List) -> Voctor,ArrayList
	
	Iterator<MemberDTO> iterator=members.iterator();
	while(iterator.hasNext()) {
			MemberDTO i =iterator.next();
			System.out.println(i.getMemberID()
												+i.getMemberPW()
												+i.getMemberName()
												+i.getMemberAge());
	}
	
					
	
	
	
	
	
	
	
	
}
}
