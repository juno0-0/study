package main;
//private
//���� Ŭ���� �ȿ����� ����� �����Ӱ� �� �� �ִ�.
public class Student4 {
	private int age = 20;
	private String studentName = "����";
	public Student4() {
		this(10);
		age = age+10;
		studentName = "������";
		System.out.println("�⺻ ������");
	}
	
	private Student4(int age){
		this.age = age;
	}
	
	private void student4Method() {
		age = age+10;
		studentName = "�̰��";
	}
	
	private void studentPrint() {
		System.out.println(age+" "+studentName);
	}
}
