package p1;

import java.io.FileNotFoundException;



public class ExceptionEx {
	public static void main(String[] args) {
		int a=10;//�����Ͽ���
		try {//���ܰ� �߻��� ���� �ִ� ����
			int[] arr = new int[5];
			arr[5] = 30;//���ܰ� �߻��ϸ� �Ʒ��κ��� ������� �ʴ´�.
			int c = a / 0;//ArithmeticException 
						//�����ε� catch����  ArrayIndexOutOfBoundsException���̶� ���ܸ� ������
		}catch(ArithmeticException e) {//���ܰ� �߻��ϸ� catch���� �޴´�.
			System.out.println(e.getMessage());//���� �޼����� ����϶�� �޼ҵ�
			System.out.println("����� ����");
		}catch(Exception e){
		
		
		}finally{//���ܿ� ������� ������ ������ ����
			System.out.println("DB�ݱ�");
			System.out.println("����� �ڿ� ����");
		}
		//����ó���� �ݵ�� ���־���� �Ǵ� Ŭ������ �޼ҵ尡 �ִ�.
		
	}
}
