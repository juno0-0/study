package ex;

public class Cylinder {
	public Circle c;
	double r;
	double height;
	
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	double getVolume() {
		return c.getArea()*height;
	}
	
	public Cylinder() {}
	
	public Cylinder(Circle c, double height){
		double result = c.getArea()*height;
		System.out.println(result);
	}
	


	public static void main(String[] args) {
		//반지름 2.8 높이 5.6
		Cylinder cy = new Cylinder();
		cy.r = 2.8;
		cy.height = 5.6;
		cy.c = new Circle(cy.r);
		System.out.println(cy.getVolume());
		Cylinder cy1 = new Cylinder(new Circle(2.8),5.6);
		
	}
}
