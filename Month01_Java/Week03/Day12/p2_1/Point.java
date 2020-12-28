package p2;

public class Point {
	int x;
	int y;
	
	public Point() {
		System.out.println("부모의 기본생성자");
	}
	
	public Point(int x, int y) {
		System.out.println("부모의 명시적생성자");
		this.x=x;
		this.y=y;
	}
	
	void pointOutput() {
		System.out.println("( "+x+" , "+y+" )");
	}
}
