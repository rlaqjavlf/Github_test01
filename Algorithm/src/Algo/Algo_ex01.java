package Algo;

import java.util.Scanner;

public class Algo_ex01 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int s1, s2, A, B;
		s1 =0;
		s2 =0;
		A=0;
		B=0;
		int N1 =sc.nextInt();
		int N2 = sc.nextInt();
		
		if(N1<N2) {
			A=N1;
			B=N2;
			
		}
		else {
			A=N2;
			B=N1;
		}
		for(int i=A;i<=B;i++) {
			s1=s1+i;
			if(i%2==1) {
				s2=s2+(i*i);
			}
			
		}
		System.out.println(s1);
		System.out.println(s2);

	}

}
