package Javabasic;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeTest1 {
public static void main(String[] args) {
	
	System.out.println("java.time");
	
	LocalDateTime time = LocalDateTime.now();
	
	System.out.println(time);
	System.out.println( time.plusDays(10)); //날짜를 더하기(초과되면 달이넘어감)
	
	System.out.println(time.plusMonths(10));// 월이초과되면(초과되면 년이 넘어감)

	System.out.println(time.plusYears(10));
	System.out.println();
	System.out.println( time.plusDays(20)
													.plusMonths(5)
													.plusYears(8) );
	
	System.out.println();
	
	System.out.println( time.minusYears(10)); // 년빼기
	System.out.println( time.minusMonths(10)); //원빼기 (미만이면 년이월)
	System.out.println( time.minusDays(35)); //일빼기 (미만이면 월이월)
	
	
	
	
	
	//경과시간 알아보기
	
	LocalTime StartTime = LocalTime.now();
	LocalTime EndTime = LocalTime.of(13,45,00);
	
	Duration duration= Duration.between(StartTime, EndTime);
	System.out.println(duration.getSeconds());
	
	
	
	

	
}
}
