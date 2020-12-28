package methodReference;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {
	public static void main(String[] args) {
		//함수적 인터페이스 선언
		IntBinaryOperator operator;//int applyAsInt(int left, int right)
		//정적 메소드 참조
		//operator = (x,y)->{return Calculator.staticMethod(x, y);};//applyAsInt 재정의
		//System.out.println(operator.applyAsInt(1, 2));
		operator = Calculator::staticMethod;//정적 메소드 참조
		System.out.println(operator.applyAsInt(1, 2));
		
		//인스턴스 메소드 참조
		Calculator c = new Calculator();
		//operator = (x,y)->{return c.instanceMethod(x, y);};//applyAsInt 재정의
		//System.out.println(operator.applyAsInt(3, 4));
		operator = c::instanceMethod;//인스턴스 메소드 참조
		System.out.println(operator.applyAsInt(3, 4));
		
	}
}
class Calculator{
	//정적 메소드 선언
	public static int staticMethod(int x, int y) {
		return x+y;
	}
	
	//인스턴스 메소드 선언
	public int instanceMethod(int x, int y) {
		return x+y;
	}
}
