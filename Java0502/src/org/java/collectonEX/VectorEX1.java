package org.java.collectonEX;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

import org.java.memberDTO.MemberDTO;

public class VectorEX1 {
public static void main(String[] args) {
			
	//���� ��ü����===============================		
	Vector<MemberDTO> members=new Vector<MemberDTO>();
	
	members.add(new MemberDTO("m1", "1111","s1",20));  //��������� �ڿ� �ڵ����� �߰�   
	members.add(new MemberDTO("m2", "2222","s2",23));    
	members.add(new MemberDTO("m3", "3333","s3",26));     
	members.add(new MemberDTO("m4", "4444","s4",27));     
	//=========================================
	
	
	
	members.add(new MemberDTO()); // �⺻ �����ڸ� >>setters 
	System.out.println(	members.get(4).getMemberID()); //���빰�� ���⋚���� Null���� ���´� 
	//������ get, set�� �̿��ؼ� ��°��� �Է��Ѵ�
	members.get(4).setMemberID("m5");
	members.get(4).setMemberPW("5555");
	members.get(4).setMemberName("s5");
	members.get(4).setMemberAge(25);
			
	System.out.println(members.get(4).getMemberID());
	
	
	
	//Scanner�� �̿��ؼ� MemberDTO�� �ʵ� userID, userPW, userName, userAge �ѹ�
	//�ֿܼ� �Է��ϰ� Vector members�� ����Ҹ� Iterator�� �̿��ؼ� ���
	Scanner sc = new Scanner(System.in);
	members.add(new MemberDTO()); // ���ο� �ڸ��� �����Ѵ�
	
	System.out.println("���̵��Է� : ");
	members.get(5).setMemberID(sc.next());;
	System.out.println("����Է� : ");
	members.get(5).setMemberPW(sc.next());			
	System.out.println("�̸� �Է� : ");
	members.get(5).setMemberName(sc.next());			
	System.out.println("���� �Է�  : ");
	members.get(5).setMemberAge(sc.nextInt());
	
	for(int i=0; i<members.size(); i++) {
		System.out.print("���̵� : "+members.get(i).getMemberID()
										+"���"+members.get(i).getMemberPW()
										+"�̸�"+members.get(i).getMemberName()
										+"����"+members.get(i).getMemberAge());
	}
	
	
	//==============================================
	System.out.println();
	//Iterator -> �÷���(List) -> Voctor,ArrayList
	
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
