package p1;

import java.util.Scanner;

public class ClassEx01 {
	/*
	 * �Ӽ� : num1, num2, ������
	 * ���� : �Է�, ����, ����, ����, ������, ���
	 * 
	 * double number1, double number2, String oper
	 * void input(), double add(), double sub(), double mul(), double div(), void output()
	 * �̷������� ���� ������ �س��� �����ϱ�. 
	 */

	public static void main(String[] args) {
		//��üȭ(�ν��Ͻ�ȭ)
		Calculator cal = new Calculator();
		//�Է¸޼��� ȣ���ϱ�
		cal.input();
		//1�ܰ� ��üȭ
		/*
		InputClass ic = new InputClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. �������\n2. �Ǽ����\n3. ���ڿ���");
		System.out.print("��ȣ�� �����ϼ��� : ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: break;
			case 2: break;
			case 3: break;
			default: break;
		}
		*/
		
		//������ �б��Ű��
		double result=0.0;
		switch(cal.oper) {
			case "+": result = cal.add(); break;
			case "-": result = cal.sub(); break;
			case "*": result = cal.mul(); break;
			case "/": result = cal.div(); break;
			default: break;
		}
		
		
	}
}
