package p3;

public class InitVar {
	int x;//�ν��Ͻ� ���� ����
	int y=x;
	boolean bx;//���(����)������ �ʱⰪ�� ���� ������ �ڵ��ʱ�ȭ �ȴ�.
	boolean by = bx;
	String sx;
	String sy;
	
	
	void printMethod() {
		System.out.println(x+"   "+y);
		System.out.println(bx+"   "+by);
		System.out.println(sx+"   "+sy);
	}
	
	void localVarMethod() {
//		int i;//�������� : �ʱ�ȭ�� ���� ������ �����⸸ �ִ�. 0�� ����
//		int j=i;
//		System.out.println(i+" "+j);
	}
	
	public static void main(String[] args) {
		//�ν��Ͻ� �޼��带 ȣ���Ϸ��� 
		//1) ��üȭ�� �ؼ� ���޸𸮿� �ø���.
		//2) ��������.�޼����();
		InitVar iv = new InitVar();
		iv.printMethod();
		
		VarOrder vo = new VarOrder();
		System.out.println(vo.EARTH_RADIUS);
		System.out.println(4*3.14*VarOrder.EARTH_RADIUS*VarOrder.EARTH_RADIUS);
		System.out.println(VarOrder.EARTH_RADIUS);
		System.out.println(vo.EARTH_RADIUS);
		//������ �Ұ�����. ������ ������ �����ϴ�.
	}
	
}
