package Algo;

public class Algo_ex13_2_10_conversion {

	public static void main(String[] args) {
	
		 int t[] = {1,0,0,0,0,1,1,0};
	      int c [] = new int [8];
	      int d = 0;
	      int sign =1;//��ȣ ����
	      
	      
	      if(t[0]!=0) {//�������
	         
	         sign = -1;
	         int b =1;//2�Ǻ��� ������ ����� ������
	         
	         for(int k = 7;k>=1;k--) {
	            c[k]=t[k]-b;//2�� ���� ����
	            if(t[k]!=0 || b!=1) {//���ڸ��� 1�̸�
	               b=0;             //���̻� -b�� ���� �ʱ� ���� b�� 0���� �ʱ�ȭ
	            }                  // -�߻��� ���밪���� ǥ��
	            else {
	               c[k]=java.lang.Math.abs(c[k]);
	               t[k]=1-c[k];//1�� ���� ����
	            }
	         }
	      }   
	      for(int k =1; k<=7;k++) {
	         int t1=(int)java.lang.Math.pow(2,(7-(double)k));//���� ǥ��
	         int t2 = t[k]*t1;//2���� ���ڸ��� * ����
	         d+=t2;//10������ ����
	      }
	      d*=sign;// ��ȣ ����
	      System.out.println("2������ 10������ ��ȯ�� �� : "+d);
	}

}
