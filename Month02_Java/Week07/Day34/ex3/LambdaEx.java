package ex3;

import java.util.function.IntSupplier;

public class LambdaEx {
	public static int method(int x, int y) {
		IntSupplier supplier = ()->{//메소드 안에 있는 내부 클래스
//			x*=10;
//			int result = x+y;//메소드의 매개변수와 로컬필드는 final이 붙은 복사본으로 들어와서 수정할 수 없음.
			int result = x*10+y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(method(3, 5));
	}
}
