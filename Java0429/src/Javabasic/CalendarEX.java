package Javabasic;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalendarEX {
public static void main(String[] args) {
	//Calendar ��ü����  
	Calendar cal=Calendar.getInstance();
	System.out.println(cal.getTime());
	//get()�ż��� �̿�
	System.out.println(cal.get(Calendar.YEAR));// �� static�ɹ�
	System.out.println(cal.get(Calendar.MONTH)+1);// �� +1 static�ɹ�
	System.out.println(cal.get(Calendar.DATE));// ��
	System.out.println();
	//�ð� 
	System.out.println(cal.get(Calendar.HOUR_OF_DAY));// �� (����1�ø� > 13�����)
	System.out.println(cal.get(Calendar.HOUR));// ��	 (���� 1�ø� > 1�����)
	System.out.println(cal.get(Calendar.MINUTE));// ��
	System.out.println(cal.get(Calendar.SECOND));//��
	System.out.println(cal.get(Calendar.MILLISECOND));//�и���
	
	
	System.out.println(cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH+1))+"��"
										+cal.get(Calendar.DATE)+"��"+cal.get(Calendar.HOUR_OF_DAY)+"��"
										+cal.get(Calendar.MINUTE)+"��"+cal.get(Calendar.MILLISECOND)+"��");
	
	
	Date now=new Date(120, 5, 8); //���� ������ 1900�� ,���� 0���� ���� +1
	System.out.println(now.getTime());
	
	DateFormat df=DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
	String day1=df.format(now);
	
	System.out.println(day1);
}
}

