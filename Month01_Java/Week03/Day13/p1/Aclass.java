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
	//���� ���ϴ� �޼ҵ�
	//��-forEndNumber
	int subAMethod() {
		int result = sumBMethod();
		return result - super.forEndNumber;
	}
	
	
	
	
	
	
	
}
