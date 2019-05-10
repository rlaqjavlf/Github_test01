package Algo;

import java.util.Scanner;

public class Algo_ex11pay {


	public static void main(String[] args) {

		

		
		int C = 0;

		int M = 10000;
		int SW = 1;

		Scanner sc = new Scanner(System.in);

		do {
			
	
			System.out.println("이름 입력하세요.");
			
			String N = sc.nextLine();
			
			if ("stop".equals(N))
					break;
			System.out.println("지급액입력하세요.");
			C = sc.nextInt();
			sc.nextLine();
				

		} while (true);
		int P = 0, T = 0;
		System.out.println("종료");
		for (int K = 1; K <= 9; K++) {
			
		}

		for (int K = 1; K <=9; K++) {
			int R = C;
			P = R / M;
			T= T + P;
			R = R - (P * M);

			if (SW == 1) {
				M=M/2;
				SW=0;
			}
			else
			{
				M=M/5;
				SW=1;
			}
		}
		System.out.println("만원\t오천원\t천원\t오백원\t백원\t오십원\t십원\t오원\t일원");
		System.out.println("=====================================================================");      
	       for(int i=0;i<9;i++)
	    	   System.out.print(P+"\t");
	       System.out.println();
	}

}
