package Algo;

import java.math.BigInteger;

public class Algo_test07 {

	public static void main(String[] args) {
				//long R,A,S,N;
				//R=3; //공비 일정 한수를 곱한다(곱할수)
				//A=2;//초기값 (초항값)
				//S=A;
				//N=2;//항의 순서
				
				//while(true) {
					// 등비수열의 식
					//A=A*R;
					//S=S+A;
					//N=N+1;
						//if(N>30) {
							//조건식 2부터 30까지 누적곱 하겠다는 조건식
							//break;
						//}
				//}
				//System.out.println("2부터"+(N-1)+"누적 곱은 = " + S);
		//	==================================
	
				BigInteger R=new BigInteger("3"); //int R=3
				BigInteger A=new BigInteger("2");//int A=2
				BigInteger S=new BigInteger("2");//int S=2
				int N=2;
				
				while(N<100) 
					{
						A = A.multiply(R); //A=A*R; or A*=R
						S = S.add(A);			// S=S+A; or S+=A
						N++;						//N=N+1
						System.out.println(N +"번째항"+"\t"+A+"\t"+S);
					}
	}

}
