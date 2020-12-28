package game;

public class Tank extends Unit{
	public Tank(int x, int y) {
		super.x=x;
		super.y=y;
		System.out.println("탱크의 위치 : ("+x+","+y+")");
	}
	
	@Override
	void move() {
		super.x=x-50;
		super.y=y+50;
		System.out.println("탱크의 위치 : ("+x+","+y+")");
	}
	
	void stop() {
		System.out.println("탱크의 현재 위치에서 정지");
	}
	
	void changeMode() {
		System.out.println("탱크 공격모드를 변환한다");
	}
}
