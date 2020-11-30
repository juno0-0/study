package p1;

public class Bclass extends Object{
//	int a=1;
//	int b=100;
//	int total;
	
	public Bclass() {}
	
//	void sum() {
//		for (int i = a; i <= b; i++) {
//			total += i;
//		}
//		System.out.println(total);
//	}
	
	int forEndNumber;
	
	public Bclass(int forEndNumber) {
		this.forEndNumber=forEndNumber;
	}
	
	//합 구하는 메소드
	int sumBMethod() {
		int sum=0;
		for (int i = 1; i < forEndNumber+1; i++) {
			sum+=i;
		}
		return sum;
	}
	
}
