package Algo;

public class Algo_ex03 {

	public static void main(String[] args) {
		
		int jumsu[] = {90,80,50,84,70,90,60,80,70,30};
		int cnt =0;
		int I=0;
		
		while(true) {
			if(jumsu[I]>=80) 
			{
					cnt=cnt+1;//조건이 맞을떄
			}
			else 
				{
					I=I+1; 			// 맞지 않을때
				}
				if(I>=10)
					break;
			
		}	
		 System.out.println(cnt);
	}

}
