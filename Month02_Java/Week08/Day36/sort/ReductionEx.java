package sort;

import java.util.Arrays;
import java.util.List;

public class ReductionEx {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("홍길동",92),
												  new Student("신용권",95),
												  new Student("감자바",88));
		
		//sum()을 사용해서 합계 구하기
		int sum1 = studentList.stream().mapToInt(Student::getScore).sum();
		//retuce()를 사용해서 합계 구하기
		int sum2 = studentList.stream().map(Student::getScore).reduce((a,b)->a+b).get();
		//데이터가 비어있으면 Integer를 넣고, 데이터가 있으면 람다식 실행
		int sum3 = studentList.stream().mapToInt(Student::getScore).reduce(5, (a,b)->a+b);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
}
