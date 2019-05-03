package Javabasic;

public class Lotto {
public static void main(String[] args) {
	int[] lotto = new int[6];
    
    for (int i = 0; i < lotto.length; i++) {
       lotto[i] = (int) (Math.random() * 45 + 1);
       
       if (i > 0) {
          int j = i-1;
          while (j >= 0) {
             
             if (lotto[j] == lotto[i])
                lotto[i] = (int) (Math.random() * 45 + 1);
             else
                j--;
                
          }
          
          
       }
    }
    
    for (int i:lotto)
       System.out.print(i + " ");
}
}
