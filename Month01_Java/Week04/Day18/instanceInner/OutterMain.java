package instanceInner;

public class OutterMain {
	public static void main(String[] args) {
		Outter o = new Outter();//1. �ܺ�Ŭ������ ���� ��üȭ
		//Outter�� �ν��Ͻ� ����� ����
		o.ia=10;
		o.iaMethond();
		
		//Outter�� ���� ����� ���� 
		Outter.ja=20;
		Outter.jaMethod();
		
		//����Ŭ������ ������� �ܺ�Ŭ������ ���������� ���� ���Ѵ�.
		//o.iia=100;
		//o.iiaMethod();
		
		//2. ����Ŭ������ ��üȭ
		Outter.Inner oi = o.new Inner();
		//�ܺ�Ŭ����.����Ŭ���� �������� = �ܺ���������.new ���λ�����();
		oi.iia=200;
		oi.iiaMethod();
		
		
		
		
		
		
	}
}
