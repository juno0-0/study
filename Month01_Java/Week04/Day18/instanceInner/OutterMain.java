package instanceInner;

public class OutterMain {
	public static void main(String[] args) {
		Outter o = new Outter();//1. 외부클래스를 먼저 객체화
		//Outter의 인스턴스 멤버에 접근
		o.ia=10;
		o.iaMethond();
		
		//Outter의 정적 멤버에 접근 
		Outter.ja=20;
		Outter.jaMethod();
		
		//내부클래스의 멤버들은 외부클래스의 참조변수로 접근 못한다.
		//o.iia=100;
		//o.iiaMethod();
		
		//2. 내부클래스를 객체화
		Outter.Inner oi = o.new Inner();
		//외부클래스.내부클래스 참조변수 = 외부참조변수.new 내부생성자();
		oi.iia=200;
		oi.iiaMethod();
		
		
		
		
		
		
	}
}
