package thisEx;

public class Outter {
	int o1 = 10;
	
	void o1Method() {
		System.out.println(this.o1);
		System.out.println(o1);
	}
	class Inner{
		int i1=20;
		int o1=30;
		void i1Method() {
			this.o1=100;
			//내부클래스의 o1 부르기
			System.out.println(this.o1);//생략하면 this
			//외부클래스의 o1 부르기
			System.out.println(Outter.this.o1);
		}
	}
	
	public static void main(String[] args) {
		//1단계 외부를 먼저 객체화하기
		Outter o = new Outter();
		//2단계 내부를 객체화하기
		Outter.Inner i = o.new Inner(); 
		i.i1Method();
		
		o.o1Method();
		
	}
}
