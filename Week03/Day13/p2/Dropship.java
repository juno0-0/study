package p2;

public class Dropship extends Unit{
	public Dropship(int x, int y) {
		super.x=x;
		super.y=y;
	}
	
	@Override
	void position() {
		System.out.println("현재위치 : "+super.x+","+super.y);
	}
	
	@Override
	void move() {
		super.x=x-100;
		super.y=y-500;
		System.out.println("("+x+","+y+")로 드랍쉽이동");
	}
	
	@Override
	void stop() {
		System.out.println("현재 위치에 드랍쉽정지");
	}
	
	void load(int x, int y) {
		System.out.println("수송선 보병위치("+x+","+y+")에서 보병을 태운다.");
	}
	
	void unload(int x, int y) {
		System.out.println("수송선 탱크위치("+x+","+y+")에서 탱크병을 내린다.");
	}
}
