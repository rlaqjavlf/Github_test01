package Javabasic;

import java.util.Random;

public class RandomEX {
	public static void main(String[] args) {
	      Random rad = new Random();
	      System.out.println(rad.nextInt());       //��������
	      System.out.println(rad.nextInt(100));       //��������
	      System.out.println(rad.nextInt(45));       //��������

	      System.out.println(rad.nextDouble());       //��������
	      System.out.println(rad.nextFloat());       //��������
	      System.out.println(rad.nextLong());       //��������
	      
	      System.out.println();
	      
	      // ������
	      Random rad2 =new Random();
	      System.out.println(rad2.nextInt());
	      System.out.println((int)(Math.random()*100)); //0~99����
	      System.out.println(rad2.nextInt(rad2.nextInt(100))); //0~99����
	      System.out.println(rad2.nextInt(50)); // 0~49����
	   }
}
