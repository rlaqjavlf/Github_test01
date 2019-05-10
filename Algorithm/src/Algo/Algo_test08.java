package Algo;

import java.math.BigInteger;

public class Algo_test08 {

	public static void main(String[] args) {
							
	/*	BigInteger N =new BigInteger("1");
		BigInteger F =new BigInteger("1");
		BigInteger S =new BigInteger("1");
		
			while(true)
			{
			 N=N.add();
			 F=F.multiply(N);
			 
			}   */
		
		
		
		
							long N,F,S;
							N=1;
							F=1;
							S=1; 
							
							while(true) {
								N=N+1;
								F=F*N;
								S=S+F;
								System.out.println(N+"번째 팩토리얼"+F);
								
								if(N>=6) {
									break;
									
								}
								
							}	
						
								System.out.println(S);
	}

}
