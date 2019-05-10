package Algo;

public class Algo_ex06 {

	public static void main(String[] args) {
		
		int[] A= {21,17,4,51,24,75,40,27,48,72};
		int CNT =0;
		int I=0;
	
		do {
			
			int N3 = A[I]%3; // 3의 배수인지 판단
			int N4 = A[I]%4; // 4의 배수인지 판단
			
			int N=N3+N4; // 두개의 값을 합한값이 0이면 
				if(N==0)
					CNT=CNT+1; //3의배수이면서 4의 배수인 결과값을 카운팅 해준다
				I=I+1;
		}
		while(I<10);
		 System.out.println("3과4의 배수갯수 : "+CNT);
	
			
		
		
		
	}

}
