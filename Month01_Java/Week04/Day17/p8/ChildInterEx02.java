package p8;

public class ChildInterEx02 implements ChildInterface3{
	void sss() {
		ChildInterface3 ci3 = new ChildInterface3() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method4() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method2() {
				//추상메소드 
				System.out.println("강요됨");
			}
		};
		ci3.method1();
		ci3.method2();
		ci3.method4();
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}
}
