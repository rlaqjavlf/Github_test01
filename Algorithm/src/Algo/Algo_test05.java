package Algo;

public class Algo_test05 {

	public static void main(String[] args) {
		int k=0, c=0;
		
		//do {
		//	k=k+1;
		//	if(k%2==0) {
		//		c=k+c;
		//	}
		 //  }while(k<100);
		//	System.out.println(c);
		
		for(k=1;k<=100;k++) {
			if(k%2==0) {
				c=c+k;
			}
		}
			System.out.println(c);
			
			
		
		
	}

}
