package p2;

public class Person {
	//�ʵ�, �޼���, �����ڸ� Person�� ������ �θ���.
	//�ʵ� ����
	String name;		//
	int age;			//���� �ִ°� this�� ����Ű�� �ֵ�
	boolean gender;		//
	
	//������
	public Person() {
		this("������",20);
		name = null;
		age = 0;
		gender = false;
		
	}
	public Person(String name, int age){
		//�����ڰ� �ٸ� �����ڸ� ȣ���� ���� this�� ���
		System.out.println(name);
		System.out.println(age);
	}
	public Person(String name, int age, boolean gender){
		this();
//		System.out.println(name); ���⼭ name�� �ν��Ͻ� �ʵ��� name�� �ƴ϶� �� �������� name�� ����. (����� �ͺ��� ����.)
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.gender);
		this.name = "�̼ҿ�";
		this.age = 30;
		this.gender = false;
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);

	}
	
	public Person(int number1, int number2) {
		System.out.println("�̰��� ������");
		System.out.println(number1 + number2);
	}
	public Person(double number1, double number2) {
		System.out.println("�̰��� �Ǽ���");
		System.out.println(number1 + number2);
	}
	
}
