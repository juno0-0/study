package p1;

public class ClassEx02 {
	 //메서드 오버로딩
	static void input(int a) {
		System.out.println("1번 "+a);
	}
	
	static void input(int a, int b) {
		System.out.println("4번 "+(a+b));
	}

	static int input(double a) {
		System.out.println("3번 "+a);
		return 0;
	}
	
	static String input(String a) {
		System.out.println("2번 "+a);
		return null;		
	}
	
	static void input(Calculator c) {
		System.out.println("5번 "+c);
	}
	
	static void input(boolean a, long b) {
		System.out.println("6번 "+a+","+b);		
	}
	
	public static void main(String[] args) {
//		ClassEx02 c = new ClassEx02();
		input(10);
		input("Hi");
		input(5.5);
		input(50,100);
		input(new Calculator());
		input(true, 300L);
	}
}
