package compareEx;

import java.util.Comparator;
import java.util.Objects;
//�������� : ��~��	return o1.name.compareTo(o2.name);
//�������� : ��~��	return o2.name.compareTo(o1.name);
public class CompareExample {
	//��ü ���ϱ�
	public static void main(String[] args) {
		//����, ȫ����
		Student s1 = new Student(3,"����");
		Student s2 = new Student(5,"ȫ���");
		Student s3 = new Student(2,"�ּ���");
		//s1�� s2�� StudentCompartor()Ÿ������ ���ϼ���
		int result = Objects.compare(s1, s2, new StudentCompartor());
		if(result == 0)System.out.println("s1�� s2�� ���� ��ȣ");
		else if(result<0)System.out.println("s1�� s2�� �� ��ȣ");
		else System.out.println("s1�� s2�� �� ��ȣ");
	}
	static class Student{//static ��� ��øŬ����
		int sno;//��ȣ
		String name;
		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
	}
	
	static class StudentCompartor implements Comparator<Student>{//static ��� ��øŬ����
//		@Override
//		public int compare(Student o1, Student o2) {
//			
//			//return o1.name.compareTo(o2.name);//���ڿ�������
//			return o2.name.compareTo(o1.name);//���ڳ�������
//			
//		}
		
		
		/*
		@Override
		public int compare(Student o1, Student o2) {
			if(o1.sno<o2.sno)return -1;
			else if(o1.sno == o2.sno)return 0;
			else return 1;
		}//�̰� Integer.compare()�� ����ִ� ��
		 //return (x < y) ? -1 : ((x == y) ? 0 : 1);
		*/
		@Override
		public int compare(Student o1, Student o2) {
			//return Integer.compare(o1.sno, o2.sno);//��������
			return Integer.compare(o2.sno, o1.sno);//��������
		}
		
	}
}//end CompareExample
