package grouping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class GroupingByAndReduction {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동",10,Student.Sex.MALE,Student.City.BUSAN),
				new Student("김수애",6,Student.Sex.FEMALE,Student.City.BUSAN),
				new Student("신용권",10,Student.Sex.MALE,Student.City.SEOUL),
				new Student("박수미",6,Student.Sex.FEMALE,Student.City.SEOUL));
		
		//성별로 평균 점수 구하는 Map 얻기
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex,//그룹핑 기준
						Collectors.averagingDouble(Student::getScore)));
		System.out.println(mapBySex.get(Student.Sex.MALE));
		System.out.println(mapBySex.get(Student.Sex.FEMALE));
		
		//성별로 인원수 구하는 Map 얻기
		Map<Student.Sex,Long> mapBySex2 = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex, 
						Collectors.counting()));
		System.out.println(mapBySex2.get(Student.Sex.MALE));
		System.out.println(mapBySex2.get(Student.Sex.FEMALE));
		
		//성별을 쉼표로 구분하는 이름을 저장하는 Map 얻기
		Map<Student.Sex,String> mapBySex3 = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex,//그룹핑 기준
						Collectors.mapping(Student::getName, Collectors.joining(","))));
		System.out.println(mapBySex3.get(Student.Sex.MALE));
		System.out.println(mapBySex3.get(Student.Sex.FEMALE));
		
		
		
	}
}
