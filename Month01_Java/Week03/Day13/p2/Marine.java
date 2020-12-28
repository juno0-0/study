package p2;

public class Marine extends Unit{
	
	public Marine(int x, int y) {
		super.x=x;
		super.y=y;
	}
	public Marine() {}
	
	@Override
	void position() {
		System.out.println("현재위치 : "+super.x+","+super.y);
	}
	
	@Override
	void move() {
		super.x=x+10;
		super.y=y-10;
		System.out.println("("+super.x+","+super.y+")로 마린이동");
	}
	
	@Override
	void stop() {
		System.out.println("현재 위치에 마린정지");
	}
	
	void stimPack() {
		System.out.println("스팀팩을 사용한다.");
	}
}
