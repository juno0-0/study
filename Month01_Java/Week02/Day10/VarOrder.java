package p3;

public class VarOrder {
	public static final double EARTH_RADIUS = 6400;
	int a;
	static int sa;
	{
		//int a = 100;//�ʱ�ȭ ���
		sa = 1000;
		System.out.println("a="+a);
		System.out.println("sa="+sa);
	}
	
	public VarOrder() {
		a = 200;//�����ڸ� �̿��� �ʱ�ȭ
		//sa = 2000;
		System.out.println("a="+a);
		System.out.println("sa="+sa);
	}

	public static void main(String[] args) {
		VarOrder vo = new VarOrder();
		//vo.a=300;//����� �ʱ�ȭ
		//VarOrder.sa = 3000;
		System.out.println("a="+vo.a);
		System.out.println("sa="+VarOrder.sa);
		
		
		//����
		//1-1. static�ʱ�ȭ���
		//1-2. instance�ʱ�ȭ���
		//2. �����ڸ� �̿��� �ʱ�ȭ
		//3. ����� �ʱ�ȭ
		
		final String nation="USA";//���� ����ִ� USA�� �� ������ �������̶�� ��, ������ ĸ��ȭ����
//		nation = "KOREA";//������ ����ִ� �� ����
		System.out.println(nation);
		
		final double PI;//�Ϲ������� �����ϸ鼭 �ʱ�ȭ�Ѵ�.
		PI = 3.141592;
//		PI = PI * 100;//�����̶� ����
		
		System.out.println(4*PI*EARTH_RADIUS*EARTH_RADIUS);//����� �����ϴ�.
//		EARTH_RADIUS=7400;//����� ���� ������ �� �� ����.
		
	}
}
