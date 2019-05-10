package Algo;

public class Algo_ex08rirr {

	public static void main(String[] args) {
		int [] [] A=new int [5] [5];
		int V=1; // 배열방에 넣어줄수 
		int D=1; 
		int C1=0; //행
		int C2=4;// 열 고정 
		
			for(int R=0;R<5;R++) {
					for(int C=C1;C!=C2+D;C=C+D) {
						// 0~4 ++ | C1=4 C2=0 D=-1 | 4~0 --
						A[R][C]=V;
							V++;
					}
					int Temp= C1;
							C1 =C2;
							C2=Temp;
					D=-D;
			}
			for (int i = 0;i <= 4;i++) {
				for (int j = 0;j <= 4;j++) {
					System.out.printf("%3d ", A[i][j]);
				}
				System.out.println();
	}
			System.out.println("================");
}
}