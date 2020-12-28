package product;

public class ProduceMain {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new TV());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new IPhone());
		b.buy(new NoteBook());
		b.summary();
		
	}
}
