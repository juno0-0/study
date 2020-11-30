package p1;

public class Person {
	//인스턴스 변수 2개 선언
	String name;
	int age;
	
	//클래스 변수 2개 선언 static
	static String tel;
	static String dept;
	
	//메서드
	//인스턴스 메서드
	//인스턴스 메서드는 클래스멤버와 인스턴스멤버를 다 넣을 수 있다.
	void output() {
		name = "최수진";
		age = 10;
		tel = "777";
		dept = "수학과";
		System.out.println("인스턴스 메서드 부분입니다.");
		outputSt();
	}
	
	//클래스 메서드 static
	//클래스메서드 안에 넣을 수 있는 것은 static으로 된 변수만 넣을 수 있다.
	static void outputSt() {
		tel = "888";
		dept = "피아노";
		//name = "박경미";  <- static이 붙은건 로더단계에서 먼저 메모리에 올라가는데  
		//age = 40;			  name과 age는 실행단계에서 new해서 객체를 생성할 때 메모리에 올라가기 때문에 에러가 난다.
		//output();
		
		System.out.println("클래스 멤버의 메서드입니다.");
	}
	
	
	
	
}
