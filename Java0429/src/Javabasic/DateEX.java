package Javabasic;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateEX {
public static void main(String[] args) {
	System.out.println("Date");
	//deprecated �޼ҵ�>> �������� �ʴ´�
	
	
	Date now=new Date();
	System.out.println(now.getTime()); //1970.1.1 0:0:0~ ������� (1�ʿ� 1000)
	System.out.println(now.getYear()+1900); //�� ���س� 1900+119
	System.out.println(now.getMonth()+1);//�� 
	System.out.println(now.getDate());//�� 

	
	System.out.println(now.getHours());// �� 
	System.out.println(now.getMinutes());//�� 
	System.out.println(now.getSeconds());//��

	System.out.println((now.getYear()+1900)+"��"+(now.getMonth()+1)+"��"+now.getDate()+"��");
	
	// ��¥ ������ �����ش�
	DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA); // ������¥�� ���� 
	String day1=df.format(now);
	System.out.println(day1);

	//�̱���(��ü�� �ϳ��� ����)
	DateFormat df2 =DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.KOREA);
	String day2=df2.format(now);
	System.out.println(day2);

}
}
