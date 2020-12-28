package methodReference;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesEx {
	
	public static void print(int order) {
		if(order<0) System.out.println("���������� ���� �ɴϴ�.");
		else if(order==0) System.out.println("������ ���ڿ��Դϴ�.");
		else System.out.println("���������� ���߿� �ɴϴ�.");
	}
	
	public static void print2(int order) {
		if(order<0) System.out.println("�۴�");
		else if(order==0) System.out.println("����");
		else System.out.println("ũ��");
	}
	
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		function = (a,b)->a.compareToIgnoreCase(b);
		print(function.applyAsInt("java7", "JAVA8"));
		
		function = String::compareToIgnoreCase;
		print(function.applyAsInt("java8", "JAVA7"));
		
		ToIntBiFunction<Integer, Integer> function2;
		function2 = Integer::compare;
		print2(function2.applyAsInt(500, 200));
	}
	
}
