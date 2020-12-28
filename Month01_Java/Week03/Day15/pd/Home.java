package pd;

public class Home {
	int price;
	int salesVolume;
	
	public Home(int price) {
		this.price=price;
	}
}

class Razor extends Home{
	public Razor() {
		super(1000);
	}
	
	@Override
	public String toString() {
		return "Razor";
	}
}

class Fan extends Home{
	public Fan() {
		super(50000);
	}
	
	@Override
	public String toString() {
		return "Fan";
	}
}

class electricBlanket extends Home{
	public electricBlanket() {
		super(300000);
	}
	
	@Override
	public String toString() {
		return "Electric Blanket";
	}
}