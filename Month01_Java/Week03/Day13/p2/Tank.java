package p2;

public class Tank extends Unit{
	public Tank(int x, int y) {
		super.x=x;
		super.y=y;
	}
	public Tank() {}
	
	@Override
	void position() {
		System.out.println("������ġ : "+super.x+","+super.y);
	}
	
	@Override
	void move() {
		super.x=x-50;
		super.y=y+50;
		System.out.println("("+x+","+y+")�� ��ũ�̵�");
	}
	
	@Override
	void stop() {
		System.out.println("���� ��ġ�� ��ũ����");
	}
	
	void changeMode() {
		System.out.println("���ݸ�带 ��ȯ�Ѵ�.");
	}
}
