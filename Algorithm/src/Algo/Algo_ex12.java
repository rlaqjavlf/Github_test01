package Algo;

public class Algo_ex12 {

	public static void main(String[] args) {
		int[] T = { 90, 60, 70, 80, 95, 100 };
		int S = 0;
		int I = 0;
		int CNT = 0;
		do {
			S = S + T[I];
			I = I + 1;
			if (I >=T.length)
				break;
		} while (true);
		double M = S / 6;
		System.out.println("Æò±Õ : "+M);

		CNT = 0;
		I = 0;

		do {
			if (T[I] > (int) M)
				CNT++;
			I++;
		} while (I < T.length);
		System.out.println("Æò±ÕÀÌ»óÇÐ»ý : "+CNT);

	}
}
