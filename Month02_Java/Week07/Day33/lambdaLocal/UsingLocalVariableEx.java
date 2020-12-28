package lambdaLocal;

public class UsingLocalVariableEx {
	public static void method(int arg) {
		int localVar = 40;//로컬변수
		//localVar = 300;
		//arg -= 100;
		
		//람다식 구조
		MyFunctionInterface fi = ()->{
			System.out.println("arg "+arg);
			System.out.println("localVar "+localVar);
		};
		
		fi.method();//람다식으로 선언한 함수(메소드)를 호출
		
	}//end method
	public static void main(String[] args) {
		method(500);
		
	}
	
}
