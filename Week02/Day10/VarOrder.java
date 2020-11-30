package p3;

public class VarOrder {
	public static final double EARTH_RADIUS = 6400;
	int a;
	static int sa;
	{
		//int a = 100;//초기화 블록
		sa = 1000;
		System.out.println("a="+a);
		System.out.println("sa="+sa);
	}
	
	public VarOrder() {
		a = 200;//생성자를 이용한 초기화
		//sa = 2000;
		System.out.println("a="+a);
		System.out.println("sa="+sa);
	}

	public static void main(String[] args) {
		VarOrder vo = new VarOrder();
		//vo.a=300;//명시적 초기화
		//VarOrder.sa = 3000;
		System.out.println("a="+vo.a);
		System.out.println("sa="+VarOrder.sa);
		
		
		//순서
		//1-1. static초기화블록
		//1-2. instance초기화블록
		//2. 생성자를 이용한 초기화
		//3. 명시적 초기화
		
		final String nation="USA";//지금 들어있는 USA가 이 변수의 최종값이라는 뜻, 고정값 캡슐화개념
//		nation = "KOREA";//변수에 들어있는 값 변경
		System.out.println(nation);
		
		final double PI;//일반적으로 선언하면서 초기화한다.
		PI = 3.141592;
//		PI = PI * 100;//변경이라서 오류
		
		System.out.println(4*PI*EARTH_RADIUS*EARTH_RADIUS);//사용은 가능하다.
//		EARTH_RADIUS=7400;//상수의 값을 변경은 할 수 없다.
		
	}
}
