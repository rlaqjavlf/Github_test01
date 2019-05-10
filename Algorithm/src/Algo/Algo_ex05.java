package Algo;

public class Algo_ex05 {

	public static void main(String[] args) {
	
		int [] a=new int [20];
		int n=20;
		int t=0;
		
	    do {
	         if(n>=2) { //n을 2와 비교해서 크면 밑의 줄을 실행시킴
	            int p =2;
	            for(p=2;p<=n;p++) { //p가 입력받은 n보다 작을때까지 나누기를 반복함
	               if(n%p==0)
	                  break;   //나눠서 나누어 떨어지면 멈춤
	            }
	            a[t] = p; //2를 a배열의 t번째방 즉 0번방에 2를 대입
	            n=n/p;// 입력받은 n을 다시 p와 나누고 나눈값을 다시 n방에 대입함 
	            t++; //t를 증가시켜 배열의 1번방에 대입시킴
	                  
	         }   
	         else {
	            System.out.println("다시 입력 해주세요");//입력한n이 2보다 작거나 같으면 else를 실행시킴
	            return;
	         }
	         }while(n!=1);
	         if(t==1)//t의 위치 즉 배열방의 위치가 1과 같으면 1과 자기자신이므로 소수라고 판별하게함
	            System.out.println("소수");
	         else {
	            for(int j = 0;j<t-1;j++) {
	               System.out.print(a[j]+"*");
	               
	            }
	            System.out.print(a[t-1]);
	         }
	}
}
		
		
	



