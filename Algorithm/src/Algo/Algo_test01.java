package Algo;

public class Algo_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int N = 1;
		int sw = 1;
		
		//while(N<=10)
		//{
		//	sum+sum=N;
		//	N=N+1;
			
		//}
		//	System.out.println("гу╟Х : "+ sum);
		
		//while(true) {
		//	sum=sum+N;
		//	N=N+1;
		//	if(N>10)
		//		break;
		//}
		//	System.out.println(sum);
		
		//do{
		//	sum+=N;
		//	N++;
		//}
		//while(N<=10);
		//{
			
		//}
		//System.out.println(sum);
		
		do {
			sum=sum+sw*N;
			if(N<100)
			{
				N=N+1;
				sw=-sw;
			}else
				break;		
		}
		while(true);
			System.out.println(sum);
			
			
	}

}
