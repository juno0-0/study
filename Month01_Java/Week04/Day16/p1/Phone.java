package p1;
//�߻�Ŭ���� : �Ϲ�Ŭ���� �Ǵ� �߻�޼ҵ�, �߻�޼ҵ带 ������ �־ �ǰ� �Ȱ����� �־ �ȴ�.
//�Ϲ�Ŭ���� : �߻�޼ҵ带 ������ ������ �ȵȴ�.
//��, �߻�޼ҵ�� �ݵ�� �߻�޼ҵ忡 �־�� �Ѵ�.
public abstract class Phone {//abstract�� ������ �߻�Ŭ������ �ȴ�.
	private String owner;
	private String telphone;
	private int price;
	
	public abstract void turnOn();//�߻�޼ҵ�
	public abstract String turnOff();
	
	public void aa() { }
	
	
	public Phone() {
		System.out.println("�⺻������");
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
