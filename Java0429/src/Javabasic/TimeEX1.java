package Javabasic;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.util.Date;

public class TimeEX1 {
public static void main(String[] args) {
	System.out.println("java.time");
	
	LocalDate now=LocalDate.now(); //  now 현재 날짜만 가져온다 
	
	System.out.println(new Date());
	
	System.out.println(now);
	System.out.println(now.getYear()); //년
	System.out.println(now.getMonth()); //월(영문)
	System.out.println(now.getMonthValue()); //월(숫자)
	
	System.out.println(now.getDayOfYear()); //일 (년도에서)
	System.out.println(now.getDayOfMonth()); //월 (년도에서)
	System.out.println(now.getDayOfWeek()); //요일 (년도에서)
	
	
	
	LocalDate ofDay = LocalDate.of(2019, 04, 29); //날짜 설정 사용자가 설정한다
	
	
	
}
}
