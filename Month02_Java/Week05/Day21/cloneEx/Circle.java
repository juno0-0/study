package cloneEx;



public class Circle implements Cloneable{
	Point p;
	double r;
	
	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = null;
		obj=super.clone();
		return super.clone();
	}
	
	public Circle shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {}
		return (Circle)obj;
	}
	
	public Circle deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {}
		Circle c = (Circle) obj;
		c.p=new Point(this.p.x, this.p.y);
		return c;
	}
	@Override
	public String toString() {
		return "[p="+p+", r="+r+"]";
	}
	
}




