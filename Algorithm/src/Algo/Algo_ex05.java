package Algo;

public class Algo_ex05 {

	public static void main(String[] args) {
	
		int [] a=new int [20];
		int n=20;
		int t=0;
		
	    do {
	         if(n>=2) { //n�� 2�� ���ؼ� ũ�� ���� ���� �����Ŵ
	            int p =2;
	            for(p=2;p<=n;p++) { //p�� �Է¹��� n���� ���������� �����⸦ �ݺ���
	               if(n%p==0)
	                  break;   //������ ������ �������� ����
	            }
	            a[t] = p; //2�� a�迭�� t��°�� �� 0���濡 2�� ����
	            n=n/p;// �Է¹��� n�� �ٽ� p�� ������ �������� �ٽ� n�濡 ������ 
	            t++; //t�� �������� �迭�� 1���濡 ���Խ�Ŵ
	                  
	         }   
	         else {
	            System.out.println("�ٽ� �Է� ���ּ���");//�Է���n�� 2���� �۰ų� ������ else�� �����Ŵ
	            return;
	         }
	         }while(n!=1);
	         if(t==1)//t�� ��ġ �� �迭���� ��ġ�� 1�� ������ 1�� �ڱ��ڽ��̹Ƿ� �Ҽ���� �Ǻ��ϰ���
	            System.out.println("�Ҽ�");
	         else {
	            for(int j = 0;j<t-1;j++) {
	               System.out.print(a[j]+"*");
	               
	            }
	            System.out.print(a[t-1]);
	         }
	}
}
		
		
	



