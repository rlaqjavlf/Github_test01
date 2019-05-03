package Javabasic;

public class MathEX {
public static void main(String[] args) {
	//Math의 모든 매서드는 Static(클래스 맴버)
	//클래스.맴버 "공용" >>> new 저장된거 
	
	System.out.println(Math.max(100, 300)); //최댓값
	System.out.println(Math.min(1.1, 255.3)); //최소값
	//static(클래스맴버) 클래사이름 맴버
	System.out.println(Math.abs(-100)); //절대값 양수
																		// 자바스크립트 ceil,floor
	System.out.println(Math.ceil(11.2));//소수점 자리올림 올림
	System.out.println(Math.floor(11.2));//소수점 자리내림 내림
										//5이상은 올림 이하는 내림 
	System.out.println(Math.round(11.2)); //반올림 11
	System.out.println(Math.round(11.6)); //반올림 12
	
	
	
	System.out.println(Math.PI); // 원주율
	
}
}
