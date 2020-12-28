package collect;

import java.util.*;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ToListEx {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(new Student("홍길동",10,Student.Sex.MALE,Student.City.SEOUL),
					  new Student("김수애",6,Student.Sex.FEMALE,Student.City.SEOUL),
					  new Student("신용권",10,Student.Sex.MALE,Student.City.BUSAN),
					  new Student("박수미",6,Student.Sex.FEMALE,Student.City.BUSAN));
		
		//남학생들만 묶어서 List 생성
		List<Student> maleList = totalList.stream().filter(s->s.getSex()==Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream().sorted().forEach(s->System.out.println("남자List : "+s.getName()));
		
		System.out.println();
		
		//여학생들만 묶어서 List 생성
		List<Student> femaleList = totalList.stream().filter(s->s.getSex()==Student.Sex.FEMALE)
				.collect(Collectors.toList());
		femaleList.stream().sorted().forEach(s->System.out.println("여자List : "+s.getName()));
		System.out.println();
		
		//서울에 사는 사람만 List 생성
		List<Student> seoulList = totalList.stream().filter(s->s.getCity()==Student.City.SEOUL)
				.collect(Collectors.toList());
		seoulList.stream().sorted().forEach(s->System.out.println("서울 사람 : "+s.getName()));
		
		System.out.println();
		
		//부산에 사는 사람만 List 생성
		List<Student> busanList = totalList.stream().filter(s->s.getCity()==Student.City.BUSAN)
				.collect(Collectors.toList());
		busanList.stream().sorted().forEach(s->System.out.println("부산 사람 : "+s.getName()));
		
		System.out.println();
		
		//점수가 8점 이상만 List 생성
		List<Student> scoreList = totalList.stream().filter(s->s.getScore()>=8)
				.collect(Collectors.toList());
		scoreList.stream().sorted().forEach(s->System.out.println("8점 이상 : "+s.getName()));
		
		System.out.println();
		
		//여학생들만 묶어 HashSet 생성
		Set<Student> femaleSet = totalList.stream().filter(s->s.getSex()==Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet::new));
		Iterator<Student> iter = femaleList.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			System.out.println("여자Set : "+s.getName());
		}
		
		System.out.println();
		
		femaleSet.stream().sorted().forEach(s->System.out.println("여자Set : "+s.getName()));
		
		
		
	}
}
