package org.java.memberController;

import java.util.Scanner;

import org.java.memberCommend.MemberDeleteDo;
import org.java.memberCommend.MemberInsertDo;
import org.java.memberCommend.MemberSelectDo;
import org.java.memberCommend.MemberUpdateDo;
import org.java.memberCommend.QueryCommend;

public class MemberController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			
		
		QueryCommend action = null;
		
		while(true) {
			System.out.println("쿼리문 입력");
		String query = sc.next();
		if(query.equals("insert")) {
			action = new MemberInsertDo();
			action.excuteQueryCommend();
			
		}else if(query.equals("delete")) {
			action = new MemberDeleteDo();
			action.excuteQueryCommend();
			
		}else if(query.equals("select")) {
			action = new MemberSelectDo();
			action.excuteQueryCommend();
			
		}else if(query.equals("update")) {
			action = new MemberUpdateDo();
			action.excuteQueryCommend();
			
		}else if(query.equals("exit")) {
			System.out.println("쿼리문 입력오류");
			break;
		}else {
			System.out.println("쿼리문 입력 오류");
		}
		}
		sc.close();
	}
}
