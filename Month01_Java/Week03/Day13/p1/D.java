package p1;
/*
 * B : 합
 * A : 합 차
 * C : 합 차 곱
 */
public class D {
	public static void main(String[] args) {
		//전체 자료 출력하기
		System.out.println("1~10까지의 합, 차 구하기");
		Aclass a = new Aclass(10);
		System.out.println("합계 = "+a.sumBMethod());
		System.out.println("55-10 = "+a.subAMethod());
		
		System.out.println("1~100까지의 합 구하기");
		Bclass b = new Bclass(100);
		System.out.println("합계 = "+b.sumBMethod());
		
		System.out.println("1~200까지의 합 구하기");
		Cclass c = new Cclass(200);
		System.out.println("합계 = "+c.sumBMethod());
		System.out.println("(1~200까지의 합)-10 = "+c.subAMethod());
		System.out.println("(1~20까지의 곱) = "+c.mulCMethod());
		
		
	}
	
}
