package p2;

public class Dropship extends Unit{
	public Dropship(int x, int y) {
		super.x=x;
		super.y=y;
	}
	
	@Override
	void position() {
		System.out.println("������ġ : "+super.x+","+super.y);
	}
	
	@Override
	void move() {
		super.x=x-100;
		super.y=y-500;
		System.out.println("("+x+","+y+")�� ������̵�");
	}
	
	@Override
	void stop() {
		System.out.println("���� ��ġ�� ���������");
	}
	
	void load(int x, int y) {
		System.out.println("���ۼ� ������ġ("+x+","+y+")���� ������ �¿��.");
	}
	
	void unload(int x, int y) {
		System.out.println("���ۼ� ��ũ��ġ("+x+","+y+")���� ��ũ���� ������.");
	}
}
