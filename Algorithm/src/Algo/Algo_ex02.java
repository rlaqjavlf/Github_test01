package Algo;

public class Algo_ex02 {

	public static void main(String[] args) {
		int K, M, N, SW;
		K = 0;
		M = 0;
		N = 1;
		SW = 0;
		double L = 0;
		double S = 0;

		do {
			K = K + 1;
			M = M + K;
			N = N * K;
			L = (double) M / (double) N;
			if (SW == 0) {
				S = S + L;
				SW = 1;
			} else {
				S = S - L;
				SW = 0;
				}
		} while (K <= 20);
		/*
		 * while (true) { K = K + 1; M = M + K; N = N * K; L = (double)M /(double) N; if
		 * (SW == 0) { S = S + L; SW = 1; } else { S = S - L; SW = 0; } if (K ==20) {
		 * break; }
		 * 
		 * }
		 */
		System.out.println(S);

	}

}
