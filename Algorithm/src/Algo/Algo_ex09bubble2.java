package Algo;

public class Algo_ex09bubble2 {

	public static void main(String[] args) {
		int[] E = { 12, 15, 60, 1, 74, 2, 6, 8, 10, 77 };

		int I = 0;

		while (true) {
			int J = 0;
			if (J < 9 - I) {
				while (I <= 9) {
					if (E[J] > E[J + 1]) {
						int temp = E[J];
						E[J] = E[J + 1];
						E[J + 1] = temp;
					}

				}
				I++;
			}
			J++;
		}
			for (int A = 0; A < E.length; A++) {
			System.out.println(E[A]);
		}
		

	}

}
