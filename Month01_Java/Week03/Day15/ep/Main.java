package ep;

public class Main {
	public static void main(String[] args) {
		Empolyee e = new Empolyee();//�θ�
		Engineer engineer = new Engineer();//�ڽ�
		Manager manager = new Manager();//�ڽ�
		Arbeit a = new Arbeit();//�ڽ�
		
		TaxRate t = new TaxRate();//����Ͻ�����
		
		t.taxRateMethod(e);
		t.taxRateMethod(engineer);
		t.taxRateMethod(manager);
		t.taxRateMethod(a);
	}
}
