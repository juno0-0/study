package p1;

import java.util.Scanner;

public class Calculator {
	//멤버 필드
	double number1;
	double number2;
	String oper;
	
	//생성자
	public Calculator() {
		System.out.println("계산기 프로그램입니다.\nver 1.0\nProgrammer : BangJunHo");
	}
	
	//입력
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("계산할 숫자를 입력하세요 : ");
		number1 = sc.nextDouble();
		System.out.print("연산자(+,-,*,/) 중에서 입력하세요 : ");
		oper = sc.next();
		System.out.print("계산할 숫자를 입력하세요 : ");
		number2 = sc.nextDouble();
	}
	
	//덧셈
	double add(){
		return number1+number2;
	}
	
	//뺄셈
	double sub() {
		double result=0.0;
		//큰 것에서 작은 것 빼기
		if(number1 < number2) {
			result = number2 - number1;
		}else {
			result = number1 - number2;
		}
		return result;
	}
	
	//곱셈
	double mul() {
		return number1*number2;
	}
	
	//나눗셈
	double div() {
		double result=0.0;
		/*
		//큰 것에서 작은 것 나누기
		if(number1<number2&&number1 != 0) {
			result = number2 / number1;
		}else if(number2 != 0){
			result = number1 / number2;
		}else System.out.println("나누기 할 수 없습니다.");
		*/
		if(number1==0&&number2==0) {
			System.out.println("나누기 할 수 없습니다.");
		}else {
			result = number1/number2;
		}
		
		return result;
	}
	
	//출력
	void output() {
		
	}
	
	
}
