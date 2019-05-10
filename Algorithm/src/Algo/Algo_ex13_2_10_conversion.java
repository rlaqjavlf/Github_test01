package Algo;

public class Algo_ex13_2_10_conversion {

	public static void main(String[] args) {
	
		 int t[] = {1,0,0,0,0,1,1,0};
	      int c [] = new int [8];
	      int d = 0;
	      int sign =1;//부호 결정
	      
	      
	      if(t[0]!=0) {//음수라면
	         
	         sign = -1;
	         int b =1;//2의보수 해제시 사용할 변수방
	         
	         for(int k = 7;k>=1;k--) {
	            c[k]=t[k]-b;//2의 보수 해제
	            if(t[k]!=0 || b!=1) {//끝자리가 1이면
	               b=0;             //더이상 -b를 하지 않기 위해 b를 0으로 초기화
	            }                  // -발생시 절대값으로 표현
	            else {
	               c[k]=java.lang.Math.abs(c[k]);
	               t[k]=1-c[k];//1의 보수 해제
	            }
	         }
	      }   
	      for(int k =1; k<=7;k++) {
	         int t1=(int)java.lang.Math.pow(2,(7-(double)k));//지수 표현
	         int t2 = t[k]*t1;//2진수 각자리수 * 지수
	         d+=t2;//10진수값 누적
	      }
	      d*=sign;// 부호 결정
	      System.out.println("2진수를 10진수로 변환한 값 : "+d);
	}

}
