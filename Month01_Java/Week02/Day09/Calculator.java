package p1;

import java.util.Scanner;

public class Calculator {
	//��� �ʵ�
	double number1;
	double number2;
	String oper;
	
	//������
	public Calculator() {
		System.out.println("���� ���α׷��Դϴ�.\nver 1.0\nProgrammer : BangJunHo");
	}
	
	//�Է�
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���ڸ� �Է��ϼ��� : ");
		number1 = sc.nextDouble();
		System.out.print("������(+,-,*,/) �߿��� �Է��ϼ��� : ");
		oper = sc.next();
		System.out.print("����� ���ڸ� �Է��ϼ��� : ");
		number2 = sc.nextDouble();
	}
	
	//����
	double add(){
		return number1+number2;
	}
	
	//����
	double sub() {
		double result=0.0;
		//ū �Ϳ��� ���� �� ����
		if(number1 < number2) {
			result = number2 - number1;
		}else {
			result = number1 - number2;
		}
		return result;
	}
	
	//����
	double mul() {
		return number1*number2;
	}
	
	//������
	double div() {
		double result=0.0;
		/*
		//ū �Ϳ��� ���� �� ������
		if(number1<number2&&number1 != 0) {
			result = number2 / number1;
		}else if(number2 != 0){
			result = number1 / number2;
		}else System.out.println("������ �� �� �����ϴ�.");
		*/
		if(number1==0&&number2==0) {
			System.out.println("������ �� �� �����ϴ�.");
		}else {
			result = number1/number2;
		}
		
		return result;
	}
	
	//���
	void output() {
		
	}
	
	
}
