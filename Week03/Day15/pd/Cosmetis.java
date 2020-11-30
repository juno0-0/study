package pd;

public class Cosmetis {
	int price;
	int salesVolume;
	
	public Cosmetis(int price) {
		this.price=price;
	}
}

class Lipstick extends Cosmetis{
	public Lipstick() {
		super(2000);
	}
	
	@Override
	public String toString() {
		return "Listick";
	}
}

class Soap extends Cosmetis{
	public Soap() {
		super(500);
	}
	
	@Override
	public String toString() {
		return "Soap";
	}
}

class Shampoo extends Cosmetis{
	public Shampoo() {
		super(1000);
	}
	
	@Override
	public String toString() {
		return "Shampoo";
	}
}