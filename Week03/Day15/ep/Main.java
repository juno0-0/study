package ep;

public class Main {
	public static void main(String[] args) {
		Empolyee e = new Empolyee();//부모
		Engineer engineer = new Engineer();//자식
		Manager manager = new Manager();//자식
		Arbeit a = new Arbeit();//자식
		
		TaxRate t = new TaxRate();//비즈니스로직
		
		t.taxRateMethod(e);
		t.taxRateMethod(engineer);
		t.taxRateMethod(manager);
		t.taxRateMethod(a);
	}
}
