package p2;

public class Cat extends Animal{

	@Override
	public void sound() {
		System.out.print("�߿˾߿�!!");
	}
	
	public Cat() {
		this.kind="������";//������ super���� this�� ���� ��ǻ�Ͱ� Cat���� ���� ã�� ������ �θ��� Ŭ�������� ã�´�.
	}
	
	@Override
	public String toString() {
		return "�����";
	}
	
}
