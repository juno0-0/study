package stream;

import java.util.*;

public class MapAndReduceEx {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동",10),
										   new Student("신용권",20),
										   new Student("유미선",30));
				
		//2단계 오리지널 스트림
		           //컬렉션        오리지널스트림                              중간처리                           최종처리
		double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("평균 점수 : "+avg);
						//  컬렉션  오리지널스트림               중간처리                         최종처리
		OptionalDouble oo = list.stream().mapToInt(Student::getScore).average();
		System.out.println("평균 점수 : "+oo);
		double temp = oo.getAsDouble();
		System.out.println("평균 점수 : "+temp);
		//mapToInt(Student::getScore) : Student를 score로 매핑
		//average() : 평균 구하기
		//getAsDouble() : OptionalDouble 클래스 타입을 double 타입으로 바꾸기
		
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
