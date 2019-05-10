package Algo;

public class Algo_test06 {

	public static void main(String[] args) {
		int A,D,N,S,AN;
		A=2;// 수열의 초항
		D=6;//수열의 공차 =6
		N=2;//등차 수열의 항 순서
		S=A;//200번째 항까지의 합
		AN=0;
		
		while(true) {
			AN=A+(N-1)*D;// 등차수열 식
			S=S+AN;
			N=N+1;
			if(N>200)
				break;
			System.out.println(N+"번째항"+S);
				
		}
			System.out.println("합계 : "+S);
	}

}
