package Javabasic;

import java.time.LocalTime;

public class TimeEX2 {

	public static void main(String[] args) {
		System.out.println("java.time");
		
		LocalTime Time =LocalTime.now();//����ð��� �����´� 
		
		System.out.println(Time);
		
		System.out.println(Time.getHour());
		System.out.println(Time.getMinute());
		System.out.println(Time.getSecond());
		System.out.println(Time.getNano());
		
		LocalTime time2 = LocalTime.of(10, 20, 15); //�ð� �� ����ڰ� �����Ѵ�
		System.out.println(time2);
		
		
	}
}
