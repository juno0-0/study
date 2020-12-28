package p3;

public class InitVar {
	int x;//인스턴스 변수 선언
	int y=x;
	boolean bx;//멤버(전역)변수는 초기값을 넣지 않으면 자동초기화 된다.
	boolean by = bx;
	String sx;
	String sy;
	
	
	void printMethod() {
		System.out.println(x+"   "+y);
		System.out.println(bx+"   "+by);
		System.out.println(sx+"   "+sy);
	}
	
	void localVarMethod() {
//		int i;//지역변수 : 초기화를 하지 않으면 껍데기만 있다. 0도 없음
//		int j=i;
//		System.out.println(i+" "+j);
	}
	
	public static void main(String[] args) {
		//인스턴스 메서드를 호출하려면 
		//1) 객체화를 해서 힙메모리에 올린다.
		//2) 참조변수.메서드명();
		InitVar iv = new InitVar();
		iv.printMethod();
		
		VarOrder vo = new VarOrder();
		System.out.println(vo.EARTH_RADIUS);
		System.out.println(4*3.14*VarOrder.EARTH_RADIUS*VarOrder.EARTH_RADIUS);
		System.out.println(VarOrder.EARTH_RADIUS);
		System.out.println(vo.EARTH_RADIUS);
		//변경은 불가능함. 선언한 곳에서 가능하다.
	}
	
}
