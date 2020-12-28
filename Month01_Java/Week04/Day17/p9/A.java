package p9;

public class A {
	//클래스안에 넣을 수 있는 멤버
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
		//static int sbnumber;//내부클래스에서 static은 쓸 수 없다.
		static final int SMAX=100;
		int[] sjumsu = new int[10];
		public B() {}
		void bmethod() {//밖에 있는 모든 멤버들을 다 사용할 수 있다.
			number=50;
			snumber=50;
			System.out.println(MAX);
			jumsu[0]=10;
			method();
			smethod();
		}
		//static void sbmethod() {}//static메서드도 마찬가지
		class C{ }
	}
	
	
	
}
