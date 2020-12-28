package multiGeneric;

public class ProductEx {
	public static void main(String[] args) {
		Product<Tv, String, Integer> p = new Product<>();
		p.setKind(new Tv("����ƮTv"));
		p.setModel("sm-1001");
		p.setPrice(2000000);
		System.out.println(p.getKind().name);
		System.out.println(p.getModel());
		System.out.println(p.getPrice());
		
		Product<Tv, String, Integer> p2 = new Product<>();
		p.setKind(new Tv("���ͳ�Tv"));
		p.setModel("in-2001");
		p.setPrice(1000000);
		System.out.println(p2.getKind().name);
		System.out.println(p2.getModel());
		System.out.println(p2.getPrice());
		
		Product<Car, String, Long> c = new Product<>();
		c.setKind(new Car("�����ڵ���"));
		c.setModel("�ҳ�Ÿ");
		c.setPrice(30000000l);
		System.out.println(c.getKind().name);
		System.out.println(c.getModel());
		System.out.println(c.getPrice());
		
		Product<Car, String, Long> c2 = new Product<>();
		
		
		
	}
}

class Product<T,M,P>{//���⼭�� Ÿ���� ���ְ� ���ο��� �ʿ��� Ÿ���� �ش�.
	private T kind;
	private M model;
	private P price;
	
	public P getPrice() {
		return price;
	}
	
	public void setPrice(P price) {
		this.price = price;
	}

	public T getKind() {
		return kind;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public M getModel() {
		return model;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
}

class Tv{
	String name;

	public Tv(String name) {
		this.name = name;
	}
}

class Car{
	String name;

	public Car(String name) {
		this.name = name;
	}
	
}