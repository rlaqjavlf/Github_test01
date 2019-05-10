package Algo;

public class Algo_test_sosu {

	public static void main(String[] args) {
		int P = 2; // 가장큰 소수기억
		int N =3;//3부터 시작해서 100가지의 자연수
 // 소수 판별단계의 공식 (제곱근)
 // 소수판별법에서 나머지 기억
 //인덱수 변수
		
		
		while(true) {
			
			int M=(int) Math.sqrt(N);
			
				for(int i=2;i<=M;i++) {
				int R=N%i;
				if(R==0)
					break;// 나누어 떨어지면 소수가 끝낸다
				if(i==M)//나누어 떨어지면 끝까지반복
					P=N;//소수 판별후 갱신
			}
				N=N+1;
				if(N>100)
					break;
		}
		System.out.println(P);
		}
			
	}


