package p1;
//추상클래스 : 일반클래스 또는 추상메소드, 추상메소드를 가지고 있어도 되고 안가지고 있어도 된다.
//일반클래스 : 추상메소드를 가지고 있으면 안된다.
//즉, 추상메소드는 반드시 추상메소드에 있어야 한다.
public abstract class Phone {//abstract를 붙히면 추상클래스가 된다.
	private String owner;
	private String telphone;
	private int price;
	
	public abstract void turnOn();//추상메소드
	public abstract String turnOff();
	
	public void aa() { }
	
	
	public Phone() {
		System.out.println("기본생성자");
	}

	public Phone(String owner, String telphone, int price) {
		this.owner = owner;
		this.telphone = telphone;
		this.price = price;
	}
	
	public void setOwner(String owner) {
		this.owner=owner;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setTelphone(String telphone) {
		this.telphone=telphone;
	}
	
	public String getTelphone() {
		return this.telphone;
	}
	
	
	
	
}
