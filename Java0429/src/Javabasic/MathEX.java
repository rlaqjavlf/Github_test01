package Javabasic;

public class MathEX {
public static void main(String[] args) {
	//Math�� ��� �ż���� Static(Ŭ���� �ɹ�)
	//Ŭ����.�ɹ� "����" >>> new ����Ȱ� 
	
	System.out.println(Math.max(100, 300)); //�ִ�
	System.out.println(Math.min(1.1, 255.3)); //�ּҰ�
	//static(Ŭ�����ɹ�) Ŭ�����̸� �ɹ�
	System.out.println(Math.abs(-100)); //���밪 ���
																		// �ڹٽ�ũ��Ʈ ceil,floor
	System.out.println(Math.ceil(11.2));//�Ҽ��� �ڸ��ø� �ø�
	System.out.println(Math.floor(11.2));//�Ҽ��� �ڸ����� ����
										//5�̻��� �ø� ���ϴ� ���� 
	System.out.println(Math.round(11.2)); //�ݿø� 11
	System.out.println(Math.round(11.6)); //�ݿø� 12
	
	
	
	System.out.println(Math.PI); // ������
	
}
}
