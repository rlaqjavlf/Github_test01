package org.java.RamdaEX;
//인터페이스 1
interface Parent{
	void son();	
}
//인터페이스 2
interface P1{
	void son2();
	
}
//수현 클래스
class MansoMain implements Parent{

	@Override
	public void son() {
		// TODO Auto-generated method stub
		System.out.println("오버라이딩(객체구현)");
	}	
}

public class RamdaEX {
		public static void main(String[] args) {
			MansoMain ma1 = new MansoMain();
			ma1.son(); //구현객체를 이용해서 son()구현 "다형성"
			
			//다형성 (부모타입의 객체참조변수 자식객체 참조)
			Parent p1 = new MansoMain();
			p1.son();
		//=======================================================	
			//익명클래스 
			Parent p2 = new Parent() {
				
				@Override
				public void son() {
					// TODO Auto-generated method stub
				}
			};
			P1 P3= new P1() {
		
				@Override
					public void son2() {
					System.out.println("익명클래스 이용해서 오버라이딩");
					}
				};
				P3.son2();
		}
}
