package p2;

public class ClassEx03 {
	public static void main(String[] args) {
		Student st = new Student();//Student() : ������
		System.out.println(st.hackbun);
		System.out.println(st.name);
		System.out.println(st.dept);
		System.out.println(st.teacherName);
	
		
		
		Student st1 = new Student(2030,"ȫ�浿");//�Ű������� 2030�� ���� int ������ String ������ �����.
		System.out.println("<<st1 ���������� ����Ű�� �ʵ� ���>>");
		System.out.println(st1.hackbun);
		System.out.println(st1.name);
		
		
		Student st2 = new Student("��ǻ�Ͱ��а�","12345");
		System.out.println("<<st2 ���������� ����Ű�� �ʵ� ���>>");
		System.out.println(st2.dept);
		System.out.println(st2.tel);
		System.out.println(st2.hackbun);
		System.out.println(st2.name);
		//st1�� st2�� ������ �ִ� �ּҰ� �޶� ���޸𸮿� �ִ� ���� �ٸ���.
		
		Student st3 = new Student(2040,"�����","���а�","123123","�ڸ���");
		System.out.println(st3.hackbun);
		System.out.println(st3.name);
		System.out.println(st3.dept);
		System.out.println(st3.tel);
		System.out.println(st3.teacherName);
		Student st4 = new Student(3.4f, 100L);
		Student st5 = new Student(false, "50",5.5);
		Student st6 = new Student(new Student(), true, "aa");
		//�Ű������� new Student()�ϸ� ���޸𸮿� �ּҰ� ����� �װŸ� ���� ������ ����� ��
		Student st7 = new Student(90,80,10,20);//��� st2�� �Ű������� ���Ƽ� st2�� ���� �����ڸ� ȣ���Ѵ�.
		Student st8 = new Student(90,80);
		
		
		
		//�����ڸ� ȣ���� �� ������ �ȿ� �ִ� ���� �Ű������� Ÿ��, ������ ���ƾ� �Ѵ�.
		
		
		
		
	}
}
