package Algo;

public class Algo_pibonachi {

	public static void main(String[] args) {

		long A = 1; // 
		long B = 1;
		long S=A+B;
		int N = 2;
		long C = 0;
		while (true) {
			
			C = A + B; //a+b�� ���� ���� c�� ����
			S=S+C;
			A = B; // b�� ���� a���� ���� 
			B = C;// c�� ���� b�� ����
			N = N + 1; //���� ������ ������Ŵ
				System.out.println(N+"��"+C);
			if (N == 51) {
				break;
			}

		}
		System.out.println(S);
	}

}
