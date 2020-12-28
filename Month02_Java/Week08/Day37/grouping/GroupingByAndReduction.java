package grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class GroupingByAndReduction {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("ȫ�浿",10,Student.Sex.MALE,Student.City.BUSAN),
				new Student("�����",6,Student.Sex.FEMALE,Student.City.BUSAN),
				new Student("�ſ��",10,Student.Sex.MALE,Student.City.SEOUL),
				new Student("�ڼ���",6,Student.Sex.FEMALE,Student.City.SEOUL));
		
		//������ ��� ���� ���ϴ� Map ���
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex,//�׷��� ����
						Collectors.averagingDouble(Student::getScore)));
		System.out.println(mapBySex.get(Student.Sex.MALE));
		System.out.println(mapBySex.get(Student.Sex.FEMALE));
		
		//������ �ο��� ���ϴ� Map ���
		Map<Student.Sex,Long> mapBySex2 = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex, 
						Collectors.counting()));
		System.out.println(mapBySex2.get(Student.Sex.MALE));
		System.out.println(mapBySex2.get(Student.Sex.FEMALE));
		
		//������ ��ǥ�� �����ϴ� �̸��� �����ϴ� Map ���
		Map<Student.Sex,String> mapBySex3 = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex,//�׷��� ����
						Collectors.mapping(Student::getName, Collectors.joining(","))));
		System.out.println(mapBySex3.get(Student.Sex.MALE));
		System.out.println(mapBySex3.get(Student.Sex.FEMALE));
		
		
		
	}
}
