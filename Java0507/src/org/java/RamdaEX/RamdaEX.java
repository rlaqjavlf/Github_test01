package org.java.RamdaEX;
//�������̽� 1
interface Parent{
	void son();	
}
//�������̽� 2
interface P1{
	void son2();
	
}
//���� Ŭ����
class MansoMain implements Parent{

	@Override
	public void son() {
		// TODO Auto-generated method stub
		System.out.println("�������̵�(��ü����)");
	}	
}

public class RamdaEX {
		public static void main(String[] args) {
			MansoMain ma1 = new MansoMain();
			ma1.son(); //������ü�� �̿��ؼ� son()���� "������"
			
			//������ (�θ�Ÿ���� ��ü�������� �ڽİ�ü ����)
			Parent p1 = new MansoMain();
			p1.son();
		//=======================================================	
			//�͸�Ŭ���� 
			Parent p2 = new Parent() {
				
				@Override
				public void son() {
					// TODO Auto-generated method stub
				}
			};
			P1 P3= new P1() {
		
				@Override
					public void son2() {
					System.out.println("�͸�Ŭ���� �̿��ؼ� �������̵�");
					}
				};
				P3.son2();
		}
}
