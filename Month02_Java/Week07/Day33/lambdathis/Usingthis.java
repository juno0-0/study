package lambdathis;

public class Usingthis {
	public int outterField = 10;//Ŭ������ �ʵ�
	int a =100;
	class Inner{//����Ŭ����
		int innerField = 20;
		int a=200;
		void method() {
			MyFunctionInterface fi = () -> {
				System.out.println("outterField "+outterField);
				System.out.println("outterField "+Usingthis.this.outterField);
				System.out.println("�ܺ� a "+Usingthis.this.a);
				System.out.println("���� a "+a);
				System.out.println("���� a "+this.a);
			};
			fi.method();
		}
	}
}
