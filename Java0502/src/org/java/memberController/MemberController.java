package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.MemberCommend;
import org.java.memberCommend.MemberInsertDo;

public class MemberController {
public static void main(String[] args) {
	
		System.out.println("������ �Է� : ");
		
		Scanner sc = new Scanner(System.in);
		MemberCommend action = null;
		
		if(sc.next().equals("insert")) {
			action = new MemberInsertDo();
			action.excuteQueryCommend();
		}
		
}
}
