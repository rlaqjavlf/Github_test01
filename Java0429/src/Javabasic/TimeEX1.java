package Javabasic;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.util.Date;

public class TimeEX1 {
public static void main(String[] args) {
	System.out.println("java.time");
	
	LocalDate now=LocalDate.now(); //  now ���� ��¥�� �����´� 
	
	System.out.println(new Date());
	
	System.out.println(now);
	System.out.println(now.getYear()); //��
	System.out.println(now.getMonth()); //��(����)
	System.out.println(now.getMonthValue()); //��(����)
	
	System.out.println(now.getDayOfYear()); //�� (�⵵����)
	System.out.println(now.getDayOfMonth()); //�� (�⵵����)
	System.out.println(now.getDayOfWeek()); //���� (�⵵����)
	
	
	
	LocalDate ofDay = LocalDate.of(2019, 04, 29); //��¥ ���� ����ڰ� �����Ѵ�
	
	
	
}
}
