package Javabasic;

import java.time.LocalDateTime;

public class TimeEX3 {
public static void main(String[] args) {
	System.out.println("java.time");
	
	LocalDateTime time=LocalDateTime.now(); //현재 날짜 시간 get
	
	System.out.println(time.getYear());
	System.out.println(time.getMonthValue());
	System.out.println(time.getDayOfMonth());
	System.out.println(time.getHour());
	System.out.println(time.getMinute());
	System.out.println(time.getSecond());
	
}
}
