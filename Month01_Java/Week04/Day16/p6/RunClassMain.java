package p6;

public class RunClassMain {
	public static void main(String[] args) {
		//구현 클래스를 객체화 하세요.
		RunClassEx rce = new RunClassEx();
		//interMethod()호출
		System.out.print("interMethod()호출 : ");
		rce.interMethod();
		//inter0101Method()호출
		System.out.print("inter0101Method()호출 : ");
		rce.inter0101Method();
		//inter0102Method()호출
		System.out.print("inter0102Method()호출 : ");
		rce.inter0102Method();
		
		//다형성 구현클래스를 객체화하고 부모참조변수를 Inter0102로 하기
		Inter0102 i = new RunClassEx();
		
		//interMethod()호출
		i.interMethod();
		//inter0102Method()호출
		i.inter0102Method();
		
		//Inter0102타입이라서 Inter0101에는 접근할 수 없다.
		//i.inter0101Method();
		
		//다형성 구현클래스를 객체화하고 부모참조변수를 Inter0101로 하기
		Inter0101 j = new RunClassEx();
		j.interMethod();
		j.inter0101Method();
		//Inter0101타입이라서 Inter0102에는 접근할 수 없다.
		Inter0102 h = (Inter0102)j;
		System.out.println("Test");
		h.inter0102Method();
		System.out.println("!");
		
		//다형성 구현클래스를 객체화하고 부모참조변수를 Inter01로 하기
		Inter01 k = new RunClassEx();
		k.interMethod();
		
		Inter0101 k1 = (Inter0101)k;
		k1.inter0101Method();
		
		Inter0102 k2 = (Inter0102)k;
		k2.inter0102Method();
		
		
		
	}
}
