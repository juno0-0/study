package p1;

public class Student {
	static int kor;
	static int eng;
	
	String name;
	String dept;
	
	static void total() {
		System.out.println(kor+eng);
//		name = "ȫ�浿"; <- �ν��Ͻ������� ���� = static �޼��尡 �޸𸮿� �ö� �� �ν��Ͻ������� �޸𸮿� ���� ������
	}
	
	public Student(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
}
