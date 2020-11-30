package p1;

import java.util.Scanner;

public class ClassEx01 {
	/*
	 * 속성 : num1, num2, 연산자
	 * 동작 : 입력, 덧셈, 뺄셈, 곱셈, 나눗셈, 출력
	 * 
	 * double number1, double number2, String oper
	 * void input(), double add(), double sub(), double mul(), double div(), void output()
	 * 이런식으로 먼저 생각을 해놓고 시작하기. 
	 */

	public static void main(String[] args) {
		//객체화(인스턴스화)
		Calculator cal = new Calculator();
		//입력메서드 호출하기
		cal.input();
		//1단계 객체화
		/*
		InputClass ic = new InputClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 정수계산\n2. 실수계산\n3. 문자연결");
		System.out.print("번호를 선택하세요 : ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: break;
			case 2: break;
			case 3: break;
			default: break;
		}
		*/
		
		//연산자 분기시키기
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
