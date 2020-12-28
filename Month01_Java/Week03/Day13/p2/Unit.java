package p2;

public class Unit {
	int x, y;
	
	public Unit() {}
	
	void position() {
		System.out.println("현재위치 : "+x+","+y);
	}
	
	void move() {
		System.out.println("("+x+","+y+")로 이동");
	}
	
	void stop() {
		System.out.println("현재 위치에 정지");
	}
}
