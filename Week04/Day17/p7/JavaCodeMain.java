package p7;

public class JavaCodeMain {
	public static void main(String[] args) {
		
	//모든 구현객체를 다형성으로 인스턴스화
	MyInterface ma = new MyClassA();
	MyInterface mb = new MyClassB();
	MyInterface mc = new MyClassC();
	MyInterface md = new MyInterface() {//인터페이스는 객체화하지 못한다. 익명구현객체로 표현한 것 
		
		@Override
		public void method2010() {
			System.out.println("인스턴스의 메서드");
		}
	};//익명 구현객체
	
	ma.method2010();
	ma.method2020();
	ma.method2030();
	System.out.println("--------------");
	
	mb.method2010();
	mb.method2020();
	mb.method2030();
	System.out.println("--------------");
	mc.method2010();
	mc.method2020();
	mc.method2030();
	System.out.println("--------------");
	md.method2010();
	md.method2020();
	md.method2030();
	System.out.println("--------------");
	
	}
}
