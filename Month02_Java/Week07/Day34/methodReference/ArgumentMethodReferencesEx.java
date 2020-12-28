package methodReference;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesEx {
	
	public static void print(int order) {
		if(order<0) System.out.println("사전순으로 먼저 옵니다.");
		else if(order==0) System.out.println("동일한 문자열입니다.");
		else System.out.println("사전순으로 나중에 옵니다.");
	}
	
	public static void print2(int order) {
		if(order<0) System.out.println("작다");
		else if(order==0) System.out.println("같다");
		else System.out.println("크다");
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
