package p2;

public class ColorPoint extends Point{
	String color;
	
	public ColorPoint() {
		System.out.println("�ڽ��� �⺻������");
	}
	
	
	public ColorPoint(String color, int x, int y) {
		System.out.println("�ڽ��� �����������");
		this.color=color;
		super.x=x;
		super.y=y;
	}
	
	void colorPointOutput() {
		System.out.println(color+"( "+x+" , "+y+")");
	}
}
