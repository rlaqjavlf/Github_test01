package org.java.MemberController;

import java.util.Scanner;

import org.java.Commend.DeleteDo;
import org.java.Commend.InsertDo;
import org.java.Commend.MemberLoginDO;
import org.java.Commend.QueryCommend;
import org.java.Commend.SelectDo;
import org.java.Commend.UpdateDo;

public class MemberController {

	public static void main(String[] args) {
		
		
		QueryCommend action= null;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("조건 입력 : ");
		String query = sc.next();
		
		if(query.equals("insert")) {
			action = new InsertDo();
			action.excuteCommend();
		}
		else if(query.equals("update")) {
			action = new UpdateDo();
			action.excuteCommend();
		}
		else if(query.equals("delete")) {
			action = new DeleteDo();
			action.excuteCommend();
		}
		else if(query.equals("select")) {
			action = new SelectDo();
			action.excuteCommend();
		}
		else if (query.equals("login")) {
			action = new MemberLoginDO();
			action.excuteCommend();
		}
	}

}
