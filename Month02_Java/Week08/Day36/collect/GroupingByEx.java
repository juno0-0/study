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
				new Student("홍길동",10,Student.Sex.MALE,Student.City.BUSAN),
				new Student("김수애",6,Student.Sex.FEMALE,Student.City.BUSAN),
				new Student("신용권",10,Student.Sex.MALE,Student.City.SEOUL),
				new Student("박수미",6,Student.Sex.FEMALE,Student.City.SEOUL));
		
		Stream<Student> totalStream = totalList.stream();
		
		//Student 객체를 Student.City로 매핑
		Function<Student, Student.City> classIsFier = Student::getCity;
		//			T          K
		//Student 객체를 Student의 name으로 매핑
		Function<Student, String> mapper = Student::getName;
		
		//이름을 List에 수집하는 Collector를 얻는다.
		Collector<String, ?, List<String>> collector1 = Collectors.toList();	
		
		//Collectors의 mapping()으로 Student 이름을 List에 수집하는 Collector를 얻는다.
		Collector<Student, ?, List<String>> collector2 = Collectors.mapping(mapper, collector1);
		//			요소    누적기    컬렉션
		//			 T     A     D
		
		//Student.City가 Key, 그룹핑된 이름 List가 Value인 Map을 생성하는 Collector를 얻는다.
		//Student를 ?가 Map<Student.City, List<String>에 누적한다.
		//                    Key           Value
		Collector<Student, ?, Map<Student.City, List<String>>> collector3 =
				Collectors.groupingBy(classIsFier,collector2);
		
		//Stream의 collect()로 Student를 Student.City별로 그룹핑해서 Map을 얻는다.
		Map<Student.City, List<String>> mapByCity = totalStream.collect(collector3);
		
		System.out.println(mapByCity.get(Student.City.SEOUL));
				
	}
}
