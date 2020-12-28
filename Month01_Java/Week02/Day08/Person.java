package p2;

public class Person {
	//필드, 메서드, 생성자를 Person의 멤버라고 부른다.
	//필드 선언
	String name;		//
	int age;			//여기 있는게 this가 가르키는 애들
	boolean gender;		//
	
	//생성자
	public Person() {
		this("고진경",20);
		name = null;
		age = 0;
		gender = false;
		
	}
	public Person(String name, int age){
		//생성자가 다른 생성자를 호출할 때도 this를 사용
		System.out.println(name);
		System.out.println(age);
	}
	public Person(String name, int age, boolean gender){
		this();
//		System.out.println(name); 여기서 name은 인스턴스 필드의 name이 아니라 이 생성자의 name을 쓴다. (가까운 것부터 쓴다.)
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
		this.name = "이소영";
		this.age = 30;
		this.gender = false;
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);

	}
	
	public Person(int number1, int number2) {
		System.out.println("이곳은 정수형");
		System.out.println(number1 + number2);
	}
	public Person(double number1, double number2) {
		System.out.println("이곳은 실수형");
		System.out.println(number1 + number2);
	}
	
}
