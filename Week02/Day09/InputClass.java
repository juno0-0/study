package p1;
//������ �Է¸� ����ϴ� Ŭ����

import java.util.Scanner;

public class InputClass {
	//�Ȱ��� �޼������ �� �� �ִ� ������ �Ű����� Ÿ���� �ٸ��� �����̴�. = Method Overloading
	//���� �������� ��������.
	//����Ÿ���� ����
	//�Ű������� Ÿ��, ����, ������ �޶�� �Ѵ�.
	//ex) String, int
	//	  int, String ������
	Scanner sc = new Scanner(System.in);
	//���� �Է�
	int input(int number1, int number2) {
		return 0;
	}
	//�Ǽ� �Է�
	double input(double number1, double number2) {
		return 0.0;
	}
	//���ڿ� �Է�
	String input(String s1, String s2) {
		return null;
	}
}
