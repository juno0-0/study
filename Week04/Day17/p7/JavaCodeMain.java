package p7;

public class JavaCodeMain {
	public static void main(String[] args) {
		
	//��� ������ü�� ���������� �ν��Ͻ�ȭ
	MyInterface ma = new MyClassA();
	MyInterface mb = new MyClassB();
	MyInterface mc = new MyClassC();
	MyInterface md = new MyInterface() {//�������̽��� ��üȭ���� ���Ѵ�. �͸�����ü�� ǥ���� �� 
		
		@Override
		public void method2010() {
			System.out.println("�ν��Ͻ��� �޼���");
		}
	};//�͸� ������ü
	
	ma.method2010();
	ma.method2020();
	ma.method2030();
	System.out.println("--------------");
	
	mb.method2010();
	mb.method2020();
	mb.method2030();
	System.out.println("--------------");
	mc.method2010();
	mc.method2020();
	mc.method2030();
	System.out.println("--------------");
	md.method2010();
	md.method2020();
	md.method2030();
	System.out.println("--------------");
	
	}
}
