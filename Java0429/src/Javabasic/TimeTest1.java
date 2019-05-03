package Javabasic;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeTest1 {
public static void main(String[] args) {
	
	System.out.println("java.time");
	
	LocalDateTime time = LocalDateTime.now();
	
	System.out.println(time);
	System.out.println( time.plusDays(10)); //��¥�� ���ϱ�(�ʰ��Ǹ� ���̳Ѿ)
	
	System.out.println(time.plusMonths(10));// �����ʰ��Ǹ�(�ʰ��Ǹ� ���� �Ѿ)

	System.out.println(time.plusYears(10));
	System.out.println();
	System.out.println( time.plusDays(20)
													.plusMonths(5)
													.plusYears(8) );
	
	System.out.println();
	
	System.out.println( time.minusYears(10)); // �⻩��
	System.out.println( time.minusMonths(10)); //������ (�̸��̸� ���̿�)
	System.out.println( time.minusDays(35)); //�ϻ��� (�̸��̸� ���̿�)
	
	
	
	
	
	//����ð� �˾ƺ���
	
	LocalTime StartTime = LocalTime.now();
	LocalTime EndTime = LocalTime.of(13,45,00);
	
	Duration duration= Duration.between(StartTime, EndTime);
	System.out.println(duration.getSeconds());
	
	
	
	

	
}
}
