package p1;

public class Aclass extends Bclass{
//	public Aclass() {
//		super.b=10;
//	}
//	
//	void sub() {
//		System.out.println(total-b);
//	}
	
	public Aclass() {}
	
	public Aclass(int forEndNumber) {
		super.forEndNumber=forEndNumber;
	}
	//차를 구하는 메소드
	//합-forEndNumber
	int subAMethod() {
		int result = sumBMethod();
		return result - super.forEndNumber;
	}
	
	
	
	
	
	
	
}
