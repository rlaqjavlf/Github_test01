package Algo;

public class Algo_ex06 {

	public static void main(String[] args) {
		
		int[] A= {21,17,4,51,24,75,40,27,48,72};
		int CNT =0;
		int I=0;
	
		do {
			
			int N3 = A[I]%3; // 3�� ������� �Ǵ�
			int N4 = A[I]%4; // 4�� ������� �Ǵ�
			
			int N=N3+N4; // �ΰ��� ���� ���Ѱ��� 0�̸� 
				if(N==0)
					CNT=CNT+1; //3�ǹ���̸鼭 4�� ����� ������� ī���� ���ش�
				I=I+1;
		}
		while(I<10);
		 System.out.println("3��4�� ������� : "+CNT);
	
			
		
		
		
	}

}
