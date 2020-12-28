package main;
//private
//같은 클래스 안에서는 멤버를 자유롭게 쓸 수 있다.
public class Student4 {
	private int age = 20;
	private String studentName = "김명숙";
	public Student4() {
		this(10);
		age = age+10;
		studentName = "정현희";
		System.out.println("기본 생성자");
	}
	
	private Student4(int age){
		this.age = age;
	}
	
	private void student4Method() {
		age = age+10;
		studentName = "이경미";
	}
	
	private void studentPrint() {
		System.out.println(age+" "+studentName);
	}
}
