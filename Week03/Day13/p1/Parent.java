package p1;

public class Parent {
	int x;//�ν��Ͻ��ʵ�
	int y;
	static int sx;//�����ʵ�
	
	static void parentStaticMethod() {
		System.out.println("�θ��� ���� �޼ҵ�");
	}
	
	void parentMethod() {
		System.out.println("x = "+x+", y = "+y);
	}
	
	public Parent() {
		System.out.println("�θ�⺻������");
	}
	
	public Parent(int x, int y) {
		System.out.println("�θ�����������");
		parentMethod();
	}
	
	static {
		System.out.println("�̰��� �θ�Ŭ������ ���� ����Դϴ�.");
	}
	
	{
		System.out.println("�̰��� �θ�Ŭ������ �ν��Ͻ� ����Դϴ�.");
	}
	
}
