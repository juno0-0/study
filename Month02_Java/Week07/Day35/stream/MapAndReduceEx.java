package stream;

import java.util.*;

public class MapAndReduceEx {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("ȫ�浿",10),
										   new Student("�ſ��",20),
										   new Student("���̼�",30));
				
		//2�ܰ� �������� ��Ʈ��
		           //�÷���        �������ν�Ʈ��                              �߰�ó��                           ����ó��
		double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("��� ���� : "+avg);
						//  �÷���  �������ν�Ʈ��               �߰�ó��                         ����ó��
		OptionalDouble oo = list.stream().mapToInt(Student::getScore).average();
		System.out.println("��� ���� : "+oo);
		double temp = oo.getAsDouble();
		System.out.println("��� ���� : "+temp);
		//mapToInt(Student::getScore) : Student�� score�� ����
		//average() : ��� ���ϱ�
		//getAsDouble() : OptionalDouble Ŭ���� Ÿ���� double Ÿ������ �ٲٱ�
		
		List<Integer> list2 = Arrays.asList(1,2,3,4);
		long count = list2.stream().count();
		System.out.println(count);
		

								  
	}
}
class Student{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	
}
