package thisEx;

public class Outter {
	int o1 = 10;
	
	void o1Method() {
		System.out.println(this.o1);
		System.out.println(o1);
	}
	class Inner{
		int i1=20;
		int o1=30;
		void i1Method() {
			this.o1=100;
			//����Ŭ������ o1 �θ���
			System.out.println(this.o1);//�����ϸ� this
			//�ܺ�Ŭ������ o1 �θ���
			System.out.println(Outter.this.o1);
		}
	}
	
	public static void main(String[] args) {
		//1�ܰ� �ܺθ� ���� ��üȭ�ϱ�
		Outter o = new Outter();
		//2�ܰ� ���θ� ��üȭ�ϱ�
		Outter.Inner i = o.new Inner(); 
		i.i1Method();
		
		o.o1Method();
		
	}
}
