package Algo;

public class Algo_ex08select {

	public static void main(String[] args) {
		int[] E = { 12, 15, 60, 1, 74, 2, 6, 8, 10, 77 };

		int I = 0;

		while (I < 10) {
			int J = I + 1;
			while (J <= 9) {
				if (E[I] > E[J]) {
					int temp = E[I];
					E[I] = E[J];
					E[J] = temp;
				}
				J++;
			}
			I++;
		}
		for (int A = 0; A < E.length; A++) {
			System.out.println(E[A]);
		}

	}
	

}
