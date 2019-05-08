package org.java.RamdaEX;
@FunctionalInterface
interface interfaceEX1{
	void abMethod();
	//void abMethod2();
	
}

public class RamdaEX1 {
public static void main(String[] args) {
	
	//인터페이스 -> 익명 클래스 구현 
		interfaceEX1 in1 = new interfaceEX1() {
		
		@Override
		public void abMethod() {
			// TODO Auto-generated method stub
			System.out.println("오버라이딩 매소드");
		}

	};
	in1.abMethod(); 
	
	in1=()->{
		
	};

}
	
}
