package p2;

public class Point {
	int x;
	int y;
	
	public Point() {
		System.out.println("�θ��� �⺻������");
	}
	
	public Point(int x, int y) {
		System.out.println("�θ��� �����������");
		this.x=x;
		this.y=y;
	}
	
	void pointOutput() {
		System.out.println("( "+x+" , "+y+" )");
	}
}
