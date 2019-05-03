package Javabasic;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateEX {
public static void main(String[] args) {
	System.out.println("Date");
	//deprecated 메소드>> 권장하지 않는다
	
	
	Date now=new Date();
	System.out.println(now.getTime()); //1970.1.1 0:0:0~ 현재까지 (1초에 1000)
	System.out.println(now.getYear()+1900); //년 기준년 1900+119
	System.out.println(now.getMonth()+1);//월 
	System.out.println(now.getDate());//일 

	
	System.out.println(now.getHours());// 시 
	System.out.println(now.getMinutes());//분 
	System.out.println(now.getSeconds());//초

	System.out.println((now.getYear()+1900)+"년"+(now.getMonth()+1)+"월"+now.getDate()+"일");
	
	// 날짜 형식을 정해준다
	DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA); // 지역날짜로 설정 
	String day1=df.format(now);
	System.out.println(day1);

	//싱글톤(객체를 하나만 생성)
	DateFormat df2 =DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
	String day2=df2.format(now);
	System.out.println(day2);

}
}
