package p8;
//����Ŭ���� �ڼ�Ŭ����
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
				System.out.println("default �޼ҵ带 �������� ���Դϴ�.");
			}
		};
		ci1.method1();
		ci1.method2();
		ci1.method03();
	}
	
}
