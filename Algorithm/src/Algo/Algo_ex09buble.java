package Algo;

public class Algo_ex09buble {

	public static void main(String[] args) {
		   int E[] = {10,9,8,7,6,5,4,3,2,1};
		      int i = 0;
		      int temp;
		      do {
		         int  j =0;
		         do {
		            if(E[j]>E[j+1]) {
		               temp = E[j];
		               E[j ] = E[j+1];
		               E[j+1] = temp;      
		            }
		            j++;
		         }while(j<9-i);
		         i++;
		         System.out.print(i+"번째 정렬");
		         for(int b =0; b<=9; b++) {
		            System.out.print(E[b]);
		         }
		         System.out.println();
		      }while(i<9);
		      
		      for(int a =0; a<=9; a++) {
		         System.out.print(E[a]);
		      
		      }
		   }

	}


