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
			
			System.out.print("���� : " ); 
			N = scan.nextLine();
			/******** stop �Է¹����� �� *********/
			if ("stop".equals(N))
				break;
			/*************************************/
			System.out.print("����� : "); 
			C = scan.nextInt();
			scan.nextLine(); // ���๮��(����)�� �����ϱ� ���� �߰�
			
			R = C; M = 10000; SW = 1;
			
			System.out.println("���� : " + N + " | ����� : " + C + "��");
			System.out.println("10000��\t5000��\t1000��\t500��\t100��\t50��\t10��\t5��\t1��");
			
			/************************ ȭ�� �з� ************************/
			for (int K = 1; K < 10; K++) {
				P = R / M;
				T += P;
				R -= P * M;
				
				System.out.print(P + "��\t");
				//System.out.println(M + "�� �ż� : " + P + "��");
				
				if (SW == 1) {
					M /= 2; SW = 0;
				} else {
					M /= 5; SW = 1;
				}
			}
			/***********************************************************/
			
			System.out.println("\n------------------------------");
			System.out.println("��ü ȭ�� �ż� : " + T + "��\n");
		}
	}

}
