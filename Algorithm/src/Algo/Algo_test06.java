package Algo;

public class Algo_test06 {

	public static void main(String[] args) {
		int A,D,N,S,AN;
		A=2;// ������ ����
		D=6;//������ ���� =6
		N=2;//���� ������ �� ����
		S=A;//200��° �ױ����� ��
		AN=0;
		
		while(true) {
			AN=A+(N-1)*D;// �������� ��
			S=S+AN;
			N=N+1;
			if(N>200)
				break;
			System.out.println(N+"��°��"+S);
				
		}
			System.out.println("�հ� : "+S);
	}

}
