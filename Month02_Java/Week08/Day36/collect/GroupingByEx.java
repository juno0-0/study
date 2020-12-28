package collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByEx {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿",10,Student.Sex.MALE,Student.City.BUSAN),
				new Student("�����",6,Student.Sex.FEMALE,Student.City.BUSAN),
				new Student("�ſ��",10,Student.Sex.MALE,Student.City.SEOUL),
				new Student("�ڼ���",6,Student.Sex.FEMALE,Student.City.SEOUL));
		
		Stream<Student> totalStream = totalList.stream();
		
		//Student ��ü�� Student.City�� ����
		Function<Student, Student.City> classIsFier = Student::getCity;
		//			T          K
		//Student ��ü�� Student�� name���� ����
		Function<Student, String> mapper = Student::getName;
		
		//�̸��� List�� �����ϴ� Collector�� ��´�.
		Collector<String, ?, List<String>> collector1 = Collectors.toList();	
		
		//Collectors�� mapping()���� Student �̸��� List�� �����ϴ� Collector�� ��´�.
		Collector<Student, ?, List<String>> collector2 = Collectors.mapping(mapper, collector1);
		//			���    ������    �÷���
		//			 T     A     D
		
		//Student.City�� Key, �׷��ε� �̸� List�� Value�� Map�� �����ϴ� Collector�� ��´�.
		//Student�� ?�� Map<Student.City, List<String>�� �����Ѵ�.
		//                    Key           Value
		Collector<Student, ?, Map<Student.City, List<String>>> collector3 =
				Collectors.groupingBy(classIsFier,collector2);
		
		//Stream�� collect()�� Student�� Student.City���� �׷����ؼ� Map�� ��´�.
		Map<Student.City, List<String>> mapByCity = totalStream.collect(collector3);
		
		System.out.println(mapByCity.get(Student.City.SEOUL));
				
	}
}
