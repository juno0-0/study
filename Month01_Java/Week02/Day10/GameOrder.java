package p2;

import p3.VarOrder;

public class GameOrder {
	static int point = 800;//여기서 static을 안붙히면 1000, 1000, 1000으로 출력된다.
	int instanceVar = 20;//static이 아닌 곳에서는 사용 가능.
	public GameOrder() {
		this.instanceVar=300;
		System.out.println("현재 포인트는 "+point);
	}

	static{
//		this.point=200;//static에서는 this사용 안됌
		System.out.println("네트워크 셋팅");
		
	}

	{
		this.instanceVar=100;
		point+=200;
		System.out.println("포인트 초기화");
		System.out.println("게임창 띄우기");
	}
	static void stMethod() {
//		this.instanceVar;
//		this.point;
		
	}

}
