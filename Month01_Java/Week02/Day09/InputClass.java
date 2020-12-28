package p1;
//계산기의 입력만 담당하는 클래스

import java.util.Scanner;

public class InputClass {
	//똑같은 메서드명을 쓸 수 있는 이유는 매개변수 타입이 다르기 때문이다. = Method Overloading
	//사용시 가독성이 높아진다.
	//리턴타입은 무관
	//매개변수의 타입, 순서, 갯수가 달라야 한다.
	//ex) String, int
	//	  int, String 가능함
	Scanner sc = new Scanner(System.in);
	//정수 입력
	int input(int number1, int number2) {
		return 0;
	}
	//실수 입력
	double input(double number1, double number2) {
		return 0.0;
	}
	//문자열 입력
	String input(String s1, String s2) {
		return null;
	}
}
