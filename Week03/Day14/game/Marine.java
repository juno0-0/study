package game;

public class Marine extends Unit{
	public Marine(int x, int y) {
		super.x=x;
		super.y=y;
		System.out.println("������ ��ġ : ("+x+","+y+")");
	}
	
	@Override
	void move() {
		super.x=x+10;
		super.y=y-10;
		System.out.println("������ ��ġ : ("+x+","+y+")");
	}
	
	@Override
	void stop() {
		System.out.println("���� ���� ��ġ���� ����");
	}
	
	void stimPack() {
		System.out.println("���� �������� ����Ѵ�");
	}
}
