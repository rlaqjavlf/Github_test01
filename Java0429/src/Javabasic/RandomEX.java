package Javabasic;

import java.util.Random;

public class RandomEX {
	public static void main(String[] args) {
	      Random rad = new Random();
	      System.out.println(rad.nextInt());       //Á¤¼ö·£´ý
	      System.out.println(rad.nextInt(100));       //Á¤¼ö·£´ý
	      System.out.println(rad.nextInt(45));       //Á¤¼ö·£´ý

	      System.out.println(rad.nextDouble());       //Á¤¼ö·£´ý
	      System.out.println(rad.nextFloat());       //Á¤¼ö·£´ý
	      System.out.println(rad.nextLong());       //Á¤¼ö·£´ý
	      
	      System.out.println();
	      
	      // ·£´ý°ª
	      Random rad2 =new Random();
	      System.out.println(rad2.nextInt());
	      System.out.println((int)(Math.random()*100)); //0~99Á¤¼ö
	      System.out.println(rad2.nextInt(rad2.nextInt(100))); //0~99Á¤¼ö
	      System.out.println(rad2.nextInt(50)); // 0~49Á¤¼ö
	   }
}
