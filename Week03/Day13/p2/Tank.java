package p2;

public class Tank extends Unit{
	public Tank(int x, int y) {
		super.x=x;
		super.y=y;
	}
	public Tank() {}
	
	@Override
	void position() {
		System.out.println("현재위치 : "+super.x+","+super.y);
	}
	
	@Override
	void move() {
		super.x=x-50;
		super.y=y+50;
		System.out.println("("+x+","+y+")로 탱크이동");
	}
	
	@Override
	void stop() {
		System.out.println("현재 위치에 탱크정지");
	}
	
	void changeMode() {
		System.out.println("공격모드를 변환한다.");
	}
}
