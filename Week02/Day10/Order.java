package p2;

public class Order {
	//sa와 a의 값이 변하는걸 파악해야 한다.
	int a = 10;
	static int sa = 100;
	
	static {
		//a=a+1000; 인스턴스 변수가 아직 메모리에 올라가지 않은 상태라서 사용하지 못함
		sa=sa+1000;
		System.out.println("클래스 블록3"+sa);
	}
	
	
	public Order() {
		a=a+10;
		sa=sa+10;
		System.out.println("기본 생성자"+a+sa);
	}
	
	{
		a=a+100;
		sa=sa+100;
		System.out.println("인스턴스 블록1"+a+sa);
	}
	
	{
		a=a+100;
		sa=sa+100;
		System.out.println("인스턴스 블록2"+a+sa);
	}

	{
		a=a+100;
		sa=sa+100;
		System.out.println("인스턴스 블록3"+a+sa);
	}
	//실행할 때 인스턴스 블록이 올라가고 기본 생성자가 올라간다.
	//new해서 힙메모리에 올라가고 생성자가 힙메모리에 생긴 공간을 채운 뒤에 기본 생성자를 호출한 것.
	
	static {
		//a=a+1000; 인스턴스 변수가 아직 메모리에 올라가지 않은 상태라서 사용하지 못함
		sa=sa+1000;
		System.out.println("클래스 블록1"+sa);
	}
	static {
		//a=a+1000; 인스턴스 변수가 아직 메모리에 올라가지 않은 상태라서 사용하지 못함
		sa=sa+1000;
		System.out.println("클래스 블록2"+sa);
	}
	//static이 메모리에 가장 먼저 올라가기 때문에 클래스블록, 인스턴스 블록, 기본 생성자 순으로 출력된다.
	//객체가 2개일 때 인스턴스 블록과 기본 생성자는 새로운 힙영역 올라가고 출력이 되지만
	//static은 딱 1번만 올라가기 때문에 1번만 출력된다.
	
}
