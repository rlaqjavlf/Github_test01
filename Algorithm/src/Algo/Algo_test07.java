package Algo;

import java.math.BigInteger;

public class Algo_test07 {

	public static void main(String[] args) {
				//long R,A,S,N;
				//R=3; //���� ���� �Ѽ��� ���Ѵ�(���Ҽ�)
				//A=2;//�ʱⰪ (���װ�)
				//S=A;
				//N=2;//���� ����
				
				//while(true) {
					// �������� ��
					//A=A*R;
					//S=S+A;
					//N=N+1;
						//if(N>30) {
							//���ǽ� 2���� 30���� ������ �ϰڴٴ� ���ǽ�
							//break;
						//}
				//}
				//System.out.println("2����"+(N-1)+"���� ���� = " + S);
		//	==================================
	
				BigInteger R=new BigInteger("3"); //int R=3
				BigInteger A=new BigInteger("2");//int A=2
				BigInteger S=new BigInteger("2");//int S=2
				int N=2;
				
				while(N<100) 
					{
						A = A.multiply(R); //A=A*R; or A*=R
						S = S.add(A);			// S=S+A; or S+=A
						N++;						//N=N+1
						System.out.println(N +"��°��"+"\t"+A+"\t"+S);
					}
	}

}
