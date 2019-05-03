package Javabasic;

import java.time.LocalTime;

public class TimeEX2 {

	public static void main(String[] args) {
		System.out.println("java.time");
		
		LocalTime Time =LocalTime.now();//현재시간만 가져온다 
		
		System.out.println(Time);
		
		System.out.println(Time.getHour());
		System.out.println(Time.getMinute());
		System.out.println(Time.getSecond());
		System.out.println(Time.getNano());
		
		LocalTime time2 = LocalTime.of(10, 20, 15); //시간 셋 사용자가 설정한다
		System.out.println(time2);
		
		
	}
}
