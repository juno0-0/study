package p1;

public class StaticInstanceEx03 {
	//변수는 자기가 속한 {}가 끝나면 사라진다.
	//다른 클래스에서 객체로 접근해서 쓸 수 있지만 객체화 하지 않으면 쓸 수 없다.
	static int publicVar = 100;
	
	
	public static void main(String[] args) {//main에도 static이 붙어있다 = void sum(){}은 main이 메모리에 올라갈 때 메모리에 올라가지 않은 상태이기 때문에. 
		final int publicVar; //static 메서드 안에 static 지역변수를 넣어서 오류발생
									//지역변수라서 블록이 끝나면 사라져야 하는데 static이 붙어있어서 다시 메모리로 돌아가야 하니까 충돌을 일으킨다.
									//= 지역변수에는 static을 붙히면 안된다.
		System.out.println(StaticInstanceEx03.publicVar);
//		System.out.println(publicVar);
									
	}
	static void sum() {
		System.out.println(publicVar);//메서드 안의 변수는 "}"을 만나면 사라진다. = main의 {}를 벗어나서 publicVar이 사라짐.
	}
	
	static void rank() {
		publicVar++;//메서드 안의 변수는 "}"을 만나면 사라진다. = main의 {}를 벗어나서 publicVar이 사라짐.
	}
}
