package game;

public class Marine extends Unit{
	public Marine(int x, int y) {
		super.x=x;
		super.y=y;
		System.out.println("보병의 위치 : ("+x+","+y+")");
	}
	
	@Override
	void move() {
		super.x=x+10;
		super.y=y-10;
		System.out.println("보병의 위치 : ("+x+","+y+")");
	}
	
	@Override
	void stop() {
		System.out.println("보병 현재 위치에서 정지");
	}
	
	void stimPack() {
		System.out.println("보병 스팀팩을 사용한다");
	}
}
