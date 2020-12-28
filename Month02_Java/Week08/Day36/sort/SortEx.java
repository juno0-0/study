package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortEx {
	public static void main(String[] args) {
		//숫자일 경우
		int[] arrInt = {1,3,5,2,4,1};//중복 가능
		IntStream intstream = Arrays.stream(arrInt);
		intstream.distinct().sorted().forEach(System.out::println);
		System.out.println();
		//객체일 경우
		List<Student> list = Arrays.asList(new Student("홍길동",10),
					  new Student("정현희",30),
					  new Student("박명자",25));
//		list.stream().sorted()
//		.forEach(a->System.out.println(a.getScore()+" "+a.getName()));
//		System.out.println();
		//내림차순 정렬하기
		list.stream().sorted(Comparator.reverseOrder())
		.forEach(s->System.out.println(s.getScore()+" "+s.getName()));
		//Student 클래스의 compare()를 수정할 수도 있지만
		//공통으로 Student를 사용하는 경우 구현하는 쪽에서 내림차순으로 수정한다.
		
		
	}
}

