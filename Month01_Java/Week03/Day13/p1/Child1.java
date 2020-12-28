package p1;

public class Child1 extends Parent{
	int z=10;//자식클래스의 필드
	
		
	void childMethod() {//부모클래스 필드의 값을 바꾸는 메소드
		super.x=super.x+20;
		super.y=super.y+30;		
		System.out.println("x = "+x+", y = "+y);
		//상속을 받은 멤버 앞에는 super가 생략되어 있는 것이다.
		//super는 부모의 인스턴스 변수
		super.parentMethod();//앞에 super.이 생략되어 있는 것
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
		System.out.println("자식 정적 메소드");
	}
	
	public Child1() {
		System.out.println("자식기본생성자");
	}

	public Child1(int x, int y, int z) {
//		super();//자동으로 생략되어 있다.
		super(100,200);
		super.x=x;//x는 자식클래스의 필드에 없고 부모클래스 필드에 있기 때문에 super
		super.y=y;
		this.z=z;
		System.out.println("자식명시적생성자");
		System.out.println("x = "+x+", y = "+y+", z = "+z);
	}
	
	static {
		System.out.println("이곳은 자식클래스의 정적 블록입니다.");
	}
	
	{
		System.out.println("이곳은 자식클래스의 인스턴스 블록입니다.");
	}
}
