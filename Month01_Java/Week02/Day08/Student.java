package p2;
/*
 * �л� ����
 * �ʵ� : �й�, �̸�, ��ȭ��ȣ, �а�
 * �޼��� : �Է�, ��ȸ, ����, ����, ��ü ���
 */
public class Student {
	//�ʵ� ����
	int hackbun;
	String name;
	String dept; 
	String tel;
	String teacherName;
	
	//�޼��� ����
	void input() {
		hackbun = 202010;
		name = "������";
		dept = "��ǻ�Ͱ��а�";
		tel = "555";
		teacherName="�ֹ̼�";
	}
	void search() {
		
	}
	void modify() {
		
	}
	void delete() {
		
	}
	void output() {
		System.out.println("�й� : "+hackbun);
		System.out.println("�̸� : "+name);
		System.out.println("�а� : "+dept);
		System.out.println("��ȭ : "+tel);
		System.out.println("������ : "+teacherName);
	}
	
	//������
//	���������� Ŭ������(){
		
//	}
	
	//�Ű� ������ ���� ����� �����ڸ� �⺻������
	public Student() {
		//���޸𸮿� �ö� �� �ڵ����� ȣ��ȴ�.
		//���� Ŭ������ ����� ���� �ʾҴٸ� �����Ϸ��� ������ ���� �ڵ����� ����� �ش�.
		//�ַ� �ϴ� ����� �ʱ�ȭ
		hackbun=202011;
		name="korea";
	}
	
	//�Ű������� �ִ� ����� ������ : ����� ������
	public Student(int hackbun, String name) {
		//a���� 2020
		//b���� ȫ�浿
		this.hackbun=hackbun;//this�� ����ʵ� (����Ŭ������ �ʵ�)
		this.name=name;		
	}
	
	
	
	
	public Student(int a, int b, int c) {
		
	}
	
	public Student(boolean a, String b) {
		
	}
	
	public Student(float a, long b) {
		
	}
	
	public Student(boolean a, String b, double c) {
		
	}
	
	public Student(Student a, boolean b, String c) {
		
	}
	
	public Student(int a, int b, int c, int d) {
//		System.out.println(a+b+c+d);
	}
	
	public Student(String dept, String tel) {
		this.dept=dept;
		this.tel=tel;
	}
	
	public Student(int hackbun, String name, String dept, String tel, String teacherName) {
		this.hackbun=hackbun;
		this.name=name;
		this.dept=dept;
		this.tel=tel;
		this.teacherName=teacherName;//����ʵ� : Student Ŭ������ �ʵ�
	
		
	}
	
	
	
	//�����ڸ� ������ �� �� �ִ�. ������ �����ε�(Overloading)
}
