package Algo;

public class Algo_ex04 {

	public static void main(String[] args) {

		int M = 0;// 영어만점자중에서 수학성적이 가장높은 경우의 수학점수를 보관
		int i = 0;

		int[] ENG = { 100, 90, 100, 100, 45, 65, 75, 100, 40, 10 };
		int[] MATH = { 60, 70, 90, 95, 50, 70, 60, 80, 90, 10 };

	/*	do {
			if (ENG[i] == 100) { 
				if (MATH[i] > M) {
					M = MATH[i];
					i = i + 1;
				}
				}
		} while (i >= MATH.length);
		System.out.println(M); */

		while (true) {
			if (ENG[i] == 100) {
				if (MATH[i] > M)
					M = MATH[i];

			}
			i = i + 1;
			if (i >= MATH.length)
				break;

		}
		System.out.println(M);

	}
}
