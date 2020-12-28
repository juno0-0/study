package lambda;

public class Main {
	public static void main(String[] args) {
		
		RunImEx r1 = new RunImEx();//인터페이스의 구현 클래스 객체 생성
		
		RunIm r2 = new RunIm() {
			
			@Override
			public void abMethod(int a, String b) {
				System.out.println(a);
				System.out.println(b);
			}
		};
		RunIm r3 = (a,b)->{System.out.println(a);
							System.out.println(b);};//람다식 사용
			r2.abMethod(3,"홍");
			r3.abMethod(6, "홍");
		
		//익명 구현 객체
		MyFunctionInterface my1 = new MyFunctionInterface() {
			@Override
			public void method() {}
		};
		
		//람다식 기본 구조
		//MyFunctionInterface my2 = ()->{ };
		
		//실행문이 1개일 경우 { }생략 가능
		//MyFunctionInterface my2 = ()->System.out.println();
		MyFunctionInterface my2 = ()->{System.out.println("람다식");};
		my2.method();
	
	}
}

class Calcu{
	void sum() {
		
	}
	
	double avg() {
		return 0;
	}
}
