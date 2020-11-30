package p1;

public class Parent {
	int x;//인스턴스필드
	int y;
	static int sx;//정적필드
	
	static void parentStaticMethod() {
		System.out.println("부모의 정적 메소드");
	}
	
	void parentMethod() {
		System.out.println("x = "+x+", y = "+y);
	}
	
	public Parent() {
		System.out.println("부모기본생성자");
	}
	
	public Parent(int x, int y) {
		System.out.println("부모명시적생성자");
		parentMethod();
	}
	
	static {
		System.out.println("이곳은 부모클래스의 정적 블록입니다.");
	}
	
	{
		System.out.println("이곳은 부모클래스의 인스턴스 블록입니다.");
	}
	
}
