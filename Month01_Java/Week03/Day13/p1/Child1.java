package p1;

public class Child1 extends Parent{
	int z=10;//�ڽ�Ŭ������ �ʵ�
	
		
	void childMethod() {//�θ�Ŭ���� �ʵ��� ���� �ٲٴ� �޼ҵ�
		super.x=super.x+20;
		super.y=super.y+30;		
		System.out.println("x = "+x+", y = "+y);
		//����� ���� ��� �տ��� super�� �����Ǿ� �ִ� ���̴�.
		//super�� �θ��� �ν��Ͻ� ����
		super.parentMethod();//�տ� super.�� �����Ǿ� �ִ� ��
		super.parentStaticMethod();
		super.sx = super.x+super.y;
	}
	
	static void staticChileMethod() {
//		super.x=super.x+20;
//		super.y=super.y+30;		
//		super.sx=super.x+super.y;
//		super.sx=100;
//		Parent.sx=100;
//		super.parentMethod();
//		super.parentStaticMethod();
		System.out.println("�ڽ� ���� �޼ҵ�");
	}
	
	public Child1() {
		System.out.println("�ڽı⺻������");
	}

	public Child1(int x, int y, int z) {
//		super();//�ڵ����� �����Ǿ� �ִ�.
		super(100,200);
		super.x=x;//x�� �ڽ�Ŭ������ �ʵ忡 ���� �θ�Ŭ���� �ʵ忡 �ֱ� ������ super
		super.y=y;
		this.z=z;
		System.out.println("�ڽĸ����������");
		System.out.println("x = "+x+", y = "+y+", z = "+z);
	}
	
	static {
		System.out.println("�̰��� �ڽ�Ŭ������ ���� ����Դϴ�.");
	}
	
	{
		System.out.println("�̰��� �ڽ�Ŭ������ �ν��Ͻ� ����Դϴ�.");
	}
}
