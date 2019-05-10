package Algo;

public class Algo_test09 {

	public static void main(String[] args) {
		int K, SW;
		K = 0;
		SW = 0;
		double S=0;
		double L;
	
		

		do {
			K = K + 1;
			L =(double) K / ((K + 1) * (K + 2));
			if (SW == 0) {
				S = S + L;
				SW = 1;
			} else {
				S = S - L;
				SW = 0;
			}

		} while (K != 49);
		System.out.println(S);

	}

}
