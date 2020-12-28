package p1;

public class Cclass extends Aclass{
//	public Cclass() {
//		super.b=200;
//	}
//	
//	void mul() {
//		int result=a;
//		for (int i = a; i <=b/10; i++) {
//			result *= i;
//			
//		}
//		System.out.println(result);
//	}
	
	//곱을 구하는 메소드
	long number=1;
	
	public Cclass() {}
	
	public Cclass(int forEndNumber) {
		super.forEndNumber=forEndNumber;
	}
	
	long mulCMethod() {
		for(int i=1;i<=forEndNumber/10;i++) {
			number*=i;
		}
		
		return number;
	}
	
	
	
}
