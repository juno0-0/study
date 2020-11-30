package p2;

public abstract class Animal {
	public String kind;
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();//추상메소드, 자식들이 구현할 수 있도록 껍데기만 만들어 놓은 것.
	//실행 순서 : static{ } --> main() --> {  } --> 생성자
	//main()도 static이라 초기화블록보다 먼저 실행된다.
	//생성자
	public Animal() {  }

	//초기화 블록
	{  }
	
	//정적 초기화 블록
	static{  }
}
