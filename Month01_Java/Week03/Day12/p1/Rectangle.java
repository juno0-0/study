package p1;

import org.w3c.dom.css.Rect;

public class Rectangle {
	double street;
	double column;
	
	public Rectangle() {}

	public Rectangle(double street, double column) {
		this.street = street;
		this.column = column;
	}
	
	double getArea(){
		return street*column;
	}
	
	double getCircumference(){
		return street*2+column*2;
	}
	
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3.82,8.65);
		System.out.println(r.getArea());
		System.out.println(r.getCircumference());
	}
}
