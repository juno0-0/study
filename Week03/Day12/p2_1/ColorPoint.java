package p2;

public class ColorPoint extends Point{
	String color;
	
	public ColorPoint() {
		System.out.println("자식의 기본생성자");
	}
	
	
	public ColorPoint(String color, int x, int y) {
		System.out.println("자식의 명시적생성자");
		this.color=color;
		super.x=x;
		super.y=y;
	}
	
	void colorPointOutput() {
		System.out.println(color+"( "+x+" , "+y+")");
	}
}
