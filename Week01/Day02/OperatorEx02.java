package P3;

import java.util.Scanner;

public class OperatorEx02 {

	static void printBMethod() {
		char char_7 = 'B';
		System.out.println(char_7);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		//1�� ����
		//������ ���ڸ� �ϳ� �Է� �ް� 10����, 16����, 8���� ����ϴ� ���α׷�
		System.out.print("���� �Է� : ");
		int i = sc.nextInt();
		System.out.printf("10���� = %d\n",i);
		System.out.printf("8���� = %o\n",i);
		System.out.printf("16���� = %x\n",i);
		
		//�⺻�� �ڷ����� Ŭ������ ����� ���� Ŭ�������̴�. 
		//�̰��� ����Ŭ����(Wrapper class)��� �θ���.
		//2�� ����
		//�� ���������� ũ�⸦ Ȯ���ϴ� ���α׷� �ۼ�
		System.out.printf("Byte���� ũ�� ===> %d",Byte.SIZE);
		//System.out.println("Byte���� ũ�� ===> "+Byte.SIZE+"bit");
		System.out.printf("\nshort���� ũ�� ===> %d",Short.SIZE);
		System.out.printf("\nint���� ũ�� ===> %d",Integer.SIZE);
		System.out.printf("\nlong���� ũ�� ===> %d",Long.SIZE);
		System.out.printf("\nfloat���� ũ�� ===> %d",Float.SIZE);
		System.out.printf("\ndouble���� ũ�� ===> %d",Double.SIZE);
		System.out.printf("\nchar���� ũ�� ===> %d",Character.SIZE);
		//System.out.printf("\nboolean���� ũ�� ===> %d",Boolean.SIZE);(��� ����)
		
		//3�� ����
		//HelloJava.java ����
		//�ʵ�� ������ name �ڷ��� String :�ʱⰪ : "Hello, Java Programming!"
		String name = "Hello, Java Programming!";
		System.out.println(name);
		
		//4�� ����
		//TypeIntŬ����
		//����4������ �ڷ����� ��� ������ �� �ʱⰪ�� ����
		//���� ������ ��� �޼ҵ� printf( )�� ȣ���Ͽ� ���
		byte b_1=1;
		short s_1=2;
		int i_1=3;
		long l_1=4L;
		System.out.printf("%d %d %d %d",b_1,s_1,i_1,l_1);
		
		//5�� ����
		//HelloAndroid Ŭ����
		//��Ű�� mobile
		//���������� ���ڿ��� ������ str ������ �ʱⰪ���� "Hello, Android Application!" ����
		//���� str�� ���
		String str = "Hello, Android Application!";
		System.out.println(str);
		
		//6�� ����
		//ToYardŬ����
		//��Ű�� conversion�� ����
		//���������� meter�� double�� �����Ͽ� 100.785�� ����
		//100.785���͸� �ߵ�� ��ȯ�Ͽ� ���
		//1���ʹ� 1.0936 �ߵ�
		double meter = 100.785;
		double yad = 100.785*1.0936;
		System.out.printf("%.2f",yad);
		
		//7�� ����
		//CharTestŬ����
		//��Ű�� character�� ����
		//���������� �ϳ� �����Ͽ� ���� 'B'�� ����
		//���� ������ ���� printBMethod( )�� 2�� ���
		printBMethod();
		printBMethod();
		
		//8�� ����
		//PersonInfoŬ����
		//������(����)�� Ű(���)�� ǥ���Է��� ó���Ͽ� ������ ������ ����
		//�Է¹��� �����Կ� Ű�� ���
		System.out.print("������ : ");
		int kg = sc.nextInt();
		System.err.print("Ű : ");
		final int cm = sc.nextInt();
		System.out.println(kg+"kg "+cm+"cm");
		*/
		//9�� ����
		//ToPoundŬ����
		//���� kg�� ���Ը� ǥ���ϴ� �Ǽ�1���� ǥ�� �Է��� �Է� �޾� ������ ������ ����
		//�Է� ���� ���� ���
		//�Է� ���� ���� �Ŀ� ������ ���
		//1kg�� 2.2�Ŀ���̴�.
		System.out.print("���� : ");
		double w = sc.nextDouble();
		System.out.println(w+"kg");
		double p = w*2.2;
		System.out.println(p+"pound");
		
		
		
		
	}

}
