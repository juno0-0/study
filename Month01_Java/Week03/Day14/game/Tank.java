package game;

public class Tank extends Unit{
	public Tank(int x, int y) {
		super.x=x;
		super.y=y;
		System.out.println("��ũ�� ��ġ : ("+x+","+y+")");
	}
	
	@Override
	void move() {
		super.x=x-50;
		super.y=y+50;
		System.out.println("��ũ�� ��ġ : ("+x+","+y+")");
	}
	
	void stop() {
		System.out.println("��ũ�� ���� ��ġ���� ����");
	}
	
	void changeMode() {
		System.out.println("��ũ ���ݸ�带 ��ȯ�Ѵ�");
	}
}
