package Algo;

public class Algo_pibonachi {

	public static void main(String[] args) {

		long A = 1; // 
		long B = 1;
		long S=A+B;
		int N = 2;
		long C = 0;
		while (true) {
			
			C = A + B; //a+b를 더한 값을 c에 대입
			S=S+C;
			A = B; // b의 값을 a값에 대입 
			B = C;// c의 값을 b에 대입
			N = N + 1; //항의 갯수를 증가시킴
				System.out.println(N+"항"+C);
			if (N == 51) {
				break;
			}

		}
		System.out.println(S);
	}

}
