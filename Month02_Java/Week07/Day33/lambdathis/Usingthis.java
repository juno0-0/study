package lambdathis;

public class Usingthis {
	public int outterField = 10;//클래스의 필드
	int a =100;
	class Inner{//내부클래스
		int innerField = 20;
		int a=200;
		void method() {
			MyFunctionInterface fi = () -> {
				System.out.println("outterField "+outterField);
				System.out.println("outterField "+Usingthis.this.outterField);
				System.out.println("외부 a "+Usingthis.this.a);
				System.out.println("내부 a "+a);
				System.out.println("내부 a "+this.a);
			};
			fi.method();
		}
	}
}
