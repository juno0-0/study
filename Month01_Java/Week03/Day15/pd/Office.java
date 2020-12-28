package pd;

public class Office {
	int price;
	int salesVolume;
	
	public Office(int price) {
		this.price=price;
	}
}

class A4 extends Office{
	public A4() {
		super(10000);
	}
	
	@Override
	public String toString() {
		return "A4";
	}
}

class Note extends Office{
	public Note() {
		super(20000);
	}
	
	@Override
	public String toString() {
		return "Note";
	}
}

class Pen extends Office{
	public Pen() {
		super(500);
	}
	
	@Override
	public String toString() {
		return "Pen";
	}
}
