package collect;

import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ToListEx {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(new Student("ȫ�浿",10,Student.Sex.MALE,Student.City.SEOUL),
					  new Student("�����",6,Student.Sex.FEMALE,Student.City.SEOUL),
					  new Student("�ſ��",10,Student.Sex.MALE,Student.City.BUSAN),
					  new Student("�ڼ���",6,Student.Sex.FEMALE,Student.City.BUSAN));
		
		//���л��鸸 ��� List ����
		List<Student> maleList = totalList.stream().filter(s->s.getSex()==Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream().sorted().forEach(s->System.out.println("����List : "+s.getName()));
		
		System.out.println();
		
		//���л��鸸 ��� List ����
		List<Student> femaleList = totalList.stream().filter(s->s.getSex()==Student.Sex.FEMALE)
				.collect(Collectors.toList());
		femaleList.stream().sorted().forEach(s->System.out.println("����List : "+s.getName()));
		System.out.println();
		
		//���￡ ��� ����� List ����
		List<Student> seoulList = totalList.stream().filter(s->s.getCity()==Student.City.SEOUL)
				.collect(Collectors.toList());
		seoulList.stream().sorted().forEach(s->System.out.println("���� ��� : "+s.getName()));
		
		System.out.println();
		
		//�λ꿡 ��� ����� List ����
		List<Student> busanList = totalList.stream().filter(s->s.getCity()==Student.City.BUSAN)
				.collect(Collectors.toList());
		busanList.stream().sorted().forEach(s->System.out.println("�λ� ��� : "+s.getName()));
		
		System.out.println();
		
		//������ 8�� �̻� List ����
		List<Student> scoreList = totalList.stream().filter(s->s.getScore()>=8)
				.collect(Collectors.toList());
		scoreList.stream().sorted().forEach(s->System.out.println("8�� �̻� : "+s.getName()));
		
		System.out.println();
		
		//���л��鸸 ���� HashSet ����
		Set<Student> femaleSet = totalList.stream().filter(s->s.getSex()==Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet::new));
		Iterator<Student> iter = femaleList.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			System.out.println("����Set : "+s.getName());
		}
		
		System.out.println();
		
		femaleSet.stream().sorted().forEach(s->System.out.println("����Set : "+s.getName()));
		
		
		
	}
}
