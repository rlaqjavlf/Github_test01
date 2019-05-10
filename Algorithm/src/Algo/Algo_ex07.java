package Algo;

public class Algo_ex07 {

	public static void main(String[] args) {

		int TN = 0;

		for (int N = 4; N <= 100; N++) {
			int sum = 0;
			int K = (int) N / 2;

			for (int J = 1; J <= K; J++) {
				int R = N % J;
				if (R == 0)
					sum = sum + J;
			}
			if (N == sum) {
				N = sum;
				System.out.println("¿ÏÀü¼ö : "+ N);
				TN = TN + 1;
			}
		}
		System.out.println("¿ÏÀü¼ö ÃÑ °¹¼ö : "+TN);

	}

}
