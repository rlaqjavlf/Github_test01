package Algo;

public class Algo_test_sosu {

	public static void main(String[] args) {
		int P = 2; // ����ū �Ҽ����
		int N =3;//3���� �����ؼ� 100������ �ڿ���
 // �Ҽ� �Ǻ��ܰ��� ���� (������)
 // �Ҽ��Ǻ������� ������ ���
 //�ε��� ����
		
		
		while(true) {
			
			int M=(int) Math.sqrt(N);
			
				for(int i=2;i<=M;i++) {
				int R=N%i;
				if(R==0)
					break;// ������ �������� �Ҽ��� ������
				if(i==M)//������ �������� �������ݺ�
					P=N;//�Ҽ� �Ǻ��� ����
			}
				N=N+1;
				if(N>100)
					break;
		}
		System.out.println(P);
		}
			
	}


