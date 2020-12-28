package methodReference;

import java.util.function.IntBinaryOperator;

public class MethodReferenceEx {
	public static void main(String[] args) {
		//�Լ��� �������̽� ����
		IntBinaryOperator operator;//int applyAsInt(int left, int right)
		//���� �޼ҵ� ����
		//operator = (x,y)->{return Calculator.staticMethod(x, y);};//applyAsInt ������
		//System.out.println(operator.applyAsInt(1, 2));
		operator = Calculator::staticMethod;//���� �޼ҵ� ����
		System.out.println(operator.applyAsInt(1, 2));
		
		//�ν��Ͻ� �޼ҵ� ����
		Calculator c = new Calculator();
		//operator = (x,y)->{return c.instanceMethod(x, y);};//applyAsInt ������
		//System.out.println(operator.applyAsInt(3, 4));
		operator = c::instanceMethod;//�ν��Ͻ� �޼ҵ� ����
		System.out.println(operator.applyAsInt(3, 4));
		
	}
}
class Calculator{
	//���� �޼ҵ� ����
	public static int staticMethod(int x, int y) {
		return x+y;
	}
	
	//�ν��Ͻ� �޼ҵ� ����
	public int instanceMethod(int x, int y) {
		return x+y;
	}
}
