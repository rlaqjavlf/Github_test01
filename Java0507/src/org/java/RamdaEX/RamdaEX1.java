package org.java.RamdaEX;
@FunctionalInterface
interface interfaceEX1{
	void abMethod();
	//void abMethod2();
	
}

public class RamdaEX1 {
public static void main(String[] args) {
	
	//�������̽� -> �͸� Ŭ���� ���� 
		interfaceEX1 in1 = new interfaceEX1() {
		
		@Override
		public void abMethod() {
			// TODO Auto-generated method stub
			System.out.println("�������̵� �żҵ�");
		}

	};
	in1.abMethod(); 
	
	in1=()->{
		
	};

}
	
}
