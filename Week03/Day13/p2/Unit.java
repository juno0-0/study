package p2;

public class Unit {
	int x, y;
	
	public Unit() {}
	
	void position() {
		System.out.println("������ġ : "+x+","+y);
	}
	
	void move() {
		System.out.println("("+x+","+y+")�� �̵�");
	}
	
	void stop() {
		System.out.println("���� ��ġ�� ����");
	}
}
