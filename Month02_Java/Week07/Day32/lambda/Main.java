package lambda;

public class Main {
	public static void main(String[] args) {
		
		RunImEx r1 = new RunImEx();//�������̽��� ���� Ŭ���� ��ü ����
		
		RunIm r2 = new RunIm() {
			
			@Override
			public void abMethod(int a, String b) {
				System.out.println(a);
				System.out.println(b);
			}
		};
		RunIm r3 = (a,b)->{System.out.println(a);
							System.out.println(b);};//���ٽ� ���
			r2.abMethod(3,"ȫ");
			r3.abMethod(6, "ȫ");
		
		//�͸� ���� ��ü
		MyFunctionInterface my1 = new MyFunctionInterface() {
			@Override
			public void method() {}
		};
		
		//���ٽ� �⺻ ����
		//MyFunctionInterface my2 = ()->{ };
		
		//���๮�� 1���� ��� { }���� ����
		//MyFunctionInterface my2 = ()->System.out.println();
		MyFunctionInterface my2 = ()->{System.out.println("���ٽ�");};
		my2.method();
	
	}
}

class Calcu{
	void sum() {
		
	}
	
	double avg() {
		return 0;
	}
}
