package p2;

import p1.EnumEx01;

public class ClassEx01 {
	public static void main(String[] args) {
		new Person2();//�ν��Ͻ�ȭ(��üȭ), ���޸𸮿� Ŭ������ �ø��� ��
		new Marchine();
		new Car();
		new Person();
		new EnumEx01();
	}
}

//1. Ŭ���� �����(���赵) Ŭ������ ������ ������ ��ü�� ���� �� ����. ��ü�� ����� ���ؼ� Ŭ������ ����� ��
//2. Ŭ������ �ʵ�,�޼��� �����ϱ�. (�ʵ�, �޼��� = ���)
//3. Ŭ������ ���� ��ü(��ǰ) �����(��üȭ, �ν��Ͻ�ȭ) �� �� Heap������ �ö󰣴�.
//	  3���� ���� ������ Ŭ������ 2�����Ϸθ� ��������� �޸𸮿��� �ö��� �ʴ´�.

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
