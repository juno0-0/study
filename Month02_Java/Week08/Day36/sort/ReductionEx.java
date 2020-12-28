package sort;

import java.util.Arrays;
import java.util.List;

public class ReductionEx {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("ȫ�浿",92),
												  new Student("�ſ��",95),
												  new Student("���ڹ�",88));
		
		//sum()�� ����ؼ� �հ� ���ϱ�
		int sum1 = studentList.stream().mapToInt(Student::getScore).sum();
		//retuce()�� ����ؼ� �հ� ���ϱ�
		int sum2 = studentList.stream().map(Student::getScore).reduce((a,b)->a+b).get();
		//�����Ͱ� ��������� Integer�� �ְ�, �����Ͱ� ������ ���ٽ� ����
		int sum3 = studentList.stream().mapToInt(Student::getScore).reduce(5, (a,b)->a+b);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
}
