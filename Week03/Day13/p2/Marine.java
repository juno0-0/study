package p2;

public class Marine extends Unit{
	
	public Marine(int x, int y) {
		super.x=x;
		super.y=y;
	}
	public Marine() {}
	
	@Override
	void position() {
		System.out.println("������ġ : "+super.x+","+super.y);
	}
	
	@Override
	void move() {
		super.x=x+10;
		super.y=y-10;
		System.out.println("("+super.x+","+super.y+")�� �����̵�");
	}
	
	@Override
	void stop() {
		System.out.println("���� ��ġ�� ��������");
	}
	
	void stimPack() {
		System.out.println("�������� ����Ѵ�.");
	}
}
