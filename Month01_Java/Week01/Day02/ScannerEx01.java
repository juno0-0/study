
package P2;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		//scanf("%d",&number);
		//Ű����κ��� �Է¹ޱ�
		//Scanner Ŭ���� 
		//C���� malloc = �����޸� �Ҵ� --> new
		Scanner sc = new Scanner(System.in);	//System�� �ü���� ������ �޴� ��, 
												//Ű���� �Է��� �� �ִ� Ŭ������ �޸𸮿� �ø� 
		System.out.println("������ �Է��ϼ���");		//Scanner Ŭ������ �޸𸮿� �ö� = �ּ� ����
		int number = sc.nextInt();				//-> Scanner sc��� ������ �ּҸ� ����
		
		System.out.println("�Ǽ��� �Է��ϼ���");
		double number1 = sc.nextDouble();
		
		System.out.println("������ �Է��ϼ���");
		boolean boolean1 = sc.nextBoolean();
		
		System.out.println("�̸��� �Է��ϼ���");		//nextLine(): ������ ���� �޴´�.
		String name = sc.next();
		
		System.out.println(number);
		System.out.println(number1);
		System.out.println(boolean1);
		System.out.println(name);
	}

}
