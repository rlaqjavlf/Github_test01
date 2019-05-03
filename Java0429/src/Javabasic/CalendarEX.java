package Javabasic;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarEX {
public static void main(String[] args) {
	//Calendar 객체생성  
	Calendar cal=Calendar.getInstance();
	System.out.println(cal.getTime());
	//get()매서드 이용
	System.out.println(cal.get(Calendar.YEAR));// 년 static맴버
	System.out.println(cal.get(Calendar.MONTH)+1);// 월 +1 static맴버
	System.out.println(cal.get(Calendar.DATE));// 일
	System.out.println();
	//시간 
	System.out.println(cal.get(Calendar.HOUR_OF_DAY));// 시 (오후1시면 > 13시출력)
	System.out.println(cal.get(Calendar.HOUR));// 시	 (오후 1시면 > 1시출력)
	System.out.println(cal.get(Calendar.MINUTE));// 분
	System.out.println(cal.get(Calendar.SECOND));//초
	System.out.println(cal.get(Calendar.MILLISECOND));//밀리초
	
	
	System.out.println(cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH+1))+"월"
										+cal.get(Calendar.DATE)+"일"+cal.get(Calendar.HOUR_OF_DAY)+"시"
										+cal.get(Calendar.MINUTE)+"분"+cal.get(Calendar.MILLISECOND)+"초");
	
	
	Date now=new Date(120, 5, 8); //년의 기준은 1900년 ,월은 0분터 시작 +1
	System.out.println(now.getTime());
	
	DateFormat df=DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
	String day1=df.format(now);
	
	System.out.println(day1);
}
}

