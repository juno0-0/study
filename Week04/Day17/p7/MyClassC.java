package p7;
//2030년 코드 method3()
public class MyClassC implements MyInterface{
	@Override
	public void method2010() {
		System.out.println("2010년 코드");
		MyInterface.stMethod4();//정적메서드 사용
		
	}
	@Override
	public void method2030() {
		System.out.println("2030년 이후 메서드");
	}
	
	
	
	
	
	
}
