package p2;

import p1.EnumEx01;

public class ClassEx01 {
	public static void main(String[] args) {
		new Person2();//인스턴스화(객체화), 힙메모리에 클래스를 올리는 것
		new Marchine();
		new Car();
		new Person();
		new EnumEx01();
	}
}

//1. 클래스 만들기(설계도) 클래스를 만들지 않으면 객체도 만들 수 없다. 객체를 만들기 위해서 클래스를 만드는 것
//2. 클래스에 필드,메서드 정의하기. (필드, 메서드 = 멤버)
//3. 클래스를 통해 객체(상품) 만들기(객체화, 인스턴스화) 이 때 Heap영역에 올라간다.
//	  3번을 하지 않으면 클래스는 2진파일로만 만들어지고 메모리에는 올라가지 않는다.

class Person2{
	String data;
	void method1() {
		
	}
	void method2() {
		
	}
}

class Marchine{
	String data;
	void method1() {
		
	}
	void method2() {
		
	}
}

class Car2{
	String data;
	void method1() {
		
	}
	void method2() {
		
	}
}

class Engine{
	String data;
	void method1() {
		
	}
	void method2() {
		
	}
}

class Handle{
	String data;
	void method1() {
		
	}
	void method2() {
		
	}
}

class Tire{
	String data;
	void method1() {
		
	}
	void method2() {
		
	}
}
