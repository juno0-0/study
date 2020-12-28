package objectsEx;

import java.util.Objects;

public class HashCodeEx {
	public static void main(String[] args) {
		Student s1 = new Student(1,"ȫ�浿");
		Student s2 = new Student(1,"ȫ�浿");
		Student s3 = null;
		System.out.println(s1.hashCode());//Object Ŭ������ �ؽ��ڵ� �Լ�
		System.out.println(s2.hashCode());
		//System.out.println(s3.hashCode());//NullPointerException �߻�
		System.out.println(Objects.hashCode(s1));
		System.out.println(Objects.hashCode(s2));
		System.out.println(Objects.hashCode(s3));//0�� ���
	}
}

class Student{
	int sno;
	String name;
	public Student(int sno, String name) {
		this.sno=sno;
		this.name=name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sno,name);
		//���� hashCode�� �ּҸ� �޾ƿͼ� ����� ���ε�
		//Objects�� hashCode()�� �������ؼ� sno�� name���� hashCode�� ���� ��
	}
}