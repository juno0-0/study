package p1;

public class Cylinder {
	double r;
	double height;
	Circle c;
	
	double getVolume(){
		return c.getArea()*height;
	}
	
	public Cylinder() {}
	public Cylinder(Circle c1, double height) {
		this.height = height;
		this.c = c;
	}
	
	
	public static void main(String[] args) {
		Cylinder cy = new Cylinder();
		cy.r=2.8;
		cy.height=5.6;
		cy.c = new Circle(cy.r);
//		System.out.println(cy.getVolume());
		Cylinder cd = new Cylinder(new Circle(2.8), 5.6);
		System.out.println(cy.getVolume());
	}
}
