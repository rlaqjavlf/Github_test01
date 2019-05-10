package Algo;

public class Algo_ex08magic_square {

	public static void main(String[] args) {
		int[][] S = new int[5][5];
		int R = 0;// 행
		int C = 2;// 열

		for (int N = 1; N <= 25; N++) {
			System.out.println(" " + N + "번째 출력");

			S[R][C] = N;
			int NR = R - 1;
			int NC = C + 1;

			if (NR == -1) {
				NR = 4;
			}
			if (NC == 5) {
				NC = 0;
			}
			if (S[NR][NC] == 0) {
				R = NR;
				C = NC;
			} else
				R = R + 1;

			for (NR = 0; NR <= 4; NR++) {
				for (NC = 0; NC <= 4; NC++) {
					System.out.printf("%3d ", S[NR][NC]);
				}
				System.out.println();
			}
			System.out.println("================");

		}

	}

}
