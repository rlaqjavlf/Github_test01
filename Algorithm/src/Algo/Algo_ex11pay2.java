package Algo;

import java.util.Scanner;

public class Algo_ex11pay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int C, R, M, SW;
		
		String N;
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int P = 0, T = 0;
			
			System.out.print("성명 : " ); 
			N = scan.nextLine();
			/******** stop 입력받으면 끝 *********/
			if ("stop".equals(N))
				break;
			/*************************************/
			System.out.print("출장비 : "); 
			C = scan.nextInt();
			scan.nextLine(); // 개행문자(엔터)를 제거하기 위해 추가
			
			R = C; M = 10000; SW = 1;
			
			System.out.println("성명 : " + N + " | 출장비 : " + C + "원");
			System.out.println("10000원\t5000원\t1000원\t500원\t100원\t50원\t10원\t5원\t1원");
			
			/************************ 화폐 분류 ************************/
			for (int K = 1; K < 10; K++) {
				P = R / M;
				T += P;
				R -= P * M;
				
				System.out.print(P + "장\t");
				//System.out.println(M + "원 매수 : " + P + "장");
				
				if (SW == 1) {
					M /= 2; SW = 0;
				} else {
					M /= 5; SW = 1;
				}
			}
			/***********************************************************/
			
			System.out.println("\n------------------------------");
			System.out.println("전체 화폐 매수 : " + T + "장\n");
		}
	}

}
