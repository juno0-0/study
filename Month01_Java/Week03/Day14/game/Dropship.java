package game;

public class Dropship extends Unit{
	public Dropship(int x, int y) {
		super.x=x;
		super.y=y;
		System.out.println("수송선의 위치 : ("+x+","+y+")");
	}
	
	@Override
	void move() {
		super.x=x-100;
		super.y=y-500;
		System.out.println("수송선의 위치 : ("+x+","+y+")");
	}
	
	@Override
	void stop() {
		System.out.println("수송선의 현재 위치에서 정지 ");
	}
	
	void load(int x, int y) {
		System.out.println("수송선 보병위치("+x+","+y+")에서 보병을 태운다");
	}
	
	void unload(int x, int y) {
		System.out.println("수송선 탱크위치("+x+","+y+")에서 탱크를 내린다");
	}
	
}
