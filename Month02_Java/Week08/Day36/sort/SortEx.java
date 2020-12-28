package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortEx {
	public static void main(String[] args) {
		//������ ���
		int[] arrInt = {1,3,5,2,4,1};//�ߺ� ����
		IntStream intstream = Arrays.stream(arrInt);
		intstream.distinct().sorted().forEach(System.out::println);
		System.out.println();
		//��ü�� ���
		List<Student> list = Arrays.asList(new Student("ȫ�浿",10),
					  new Student("������",30),
					  new Student("�ڸ���",25));
//		list.stream().sorted()
//		.forEach(a->System.out.println(a.getScore()+" "+a.getName()));
//		System.out.println();
		//�������� �����ϱ�
		list.stream().sorted(Comparator.reverseOrder())
		.forEach(s->System.out.println(s.getScore()+" "+s.getName()));
		//Student Ŭ������ compare()�� ������ ���� ������
		//�������� Student�� ����ϴ� ��� �����ϴ� �ʿ��� ������������ �����Ѵ�.
		
		
	}
}

