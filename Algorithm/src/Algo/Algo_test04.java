package Algo;

public class Algo_test04 {

	public static void main(String[] args) {
	
		int i=0, asum=0, bsum=0, sw=0;
		
		
		do {
			i=i+1;
				if(sw==0)
				{
				asum=asum+i;
				sw=1;
				}
				else {
				bsum=bsum+i;
				sw=0;
				}
			}
			while(i<100);
				System.out.println("È¦¼öÀÇ ÇÕ"+asum);
				System.out.println("Â¦¼öÀÇ ÇÕ"+bsum);
		}
}