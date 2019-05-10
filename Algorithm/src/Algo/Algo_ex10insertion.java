package Algo;

public class Algo_ex10insertion {

	public static void main(String[] args) {
		int E[] = { 65, 75, 55, 85, 45 };
		int i;
		int j, key;

		for (i = 1; i < 5; i++) {
			key = E[i];
			for (j = i - 1; j >= 0; j--) {
				if (E[j] <= key)
					break;
				E[j + 1] = E[j];
			}
			E[j + 1] = key;

			for (i = 0; i < 5; i++) {
				System.out.print(E[i] + "\t");
			}
		}
	}
}
