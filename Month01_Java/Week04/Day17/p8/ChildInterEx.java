package p8;
//구현클래스 자손클래스
public class ChildInterEx implements ChildInterface1{
	@Override
	public void method03() {
		
	}
	
	@Override
	public void method1() {
		
		
	}
	

	
	void ss() {
		ChildInterface1 ci1 = new ChildInterface1() {
			
			@Override
			public void method1() {
				System.out.println("ci1-1");
			}
			
			@Override
			public void method03() {
				System.out.println("ci1-2");
			}
			
			@Override
			public void method2() {
				System.out.println("default 메소드를 재정의한 것입니다.");
			}
		};
		ci1.method1();
		ci1.method2();
		ci1.method03();
	}
	
}
