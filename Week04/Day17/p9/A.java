package p9;

public class A {
	//Ŭ�����ȿ� ���� �� �ִ� ���
	int number;
	static int snumber;
	static final int MAX=100;
	int[] jumsu = new int[10];
	public A() {}
	void method() {
//		System.out.println(SMAX);
//		sjumsu[0]=90;
		B b = new B();
		b.bmethod();
		b.bnumber=60;
		
	}
	static void smethod() {}
	class B{
		int bnumber;
		//static int sbnumber;//����Ŭ�������� static�� �� �� ����.
		static final int SMAX=100;
		int[] sjumsu = new int[10];
		public B() {}
		void bmethod() {//�ۿ� �ִ� ��� ������� �� ����� �� �ִ�.
			number=50;
			snumber=50;
			System.out.println(MAX);
			jumsu[0]=10;
			method();
			smethod();
		}
		//static void sbmethod() {}//static�޼��嵵 ��������
		class C{ }
	}
	
	
	
}
