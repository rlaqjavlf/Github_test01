package Algo;

public class Algo_test10 {

	public static void main(String[] args) {
		int i, s,N3,N5;
		i=1;
		s=0;
		
		do{
			N3=i%3;
			N5=i%5;
			if(N3==0) {
				s=s+i;
				}
			else if(N5==0) {
				s=s+i;
			}
			i=i+1;
		}
		while(i<=100);
			System.out.println(s);
	}

}
