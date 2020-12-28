package streamPipelines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipelinesEx {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("홍길동",Member.MALE,30),
					  new Member("김나리",Member.FEMALE,20),
					  new Member("신용권",Member.MALE,45),
					  new Member("박수미",Member.FEMALE,27));
		
		 double mAgeAvg = list.stream().filter(a->a.getSex()==Member.MALE)
				//					 오리지널스트림                   중간 처리 스트림
				.mapToInt(Member::getAge).average().getAsDouble();
		 		//				중간 처리 스트림			  최종 처리 스트림
		 System.out.println("남자 나이의 평균은 : "+mAgeAvg);
		 double fAgeAvg = list.stream().filter(a->a.getSex()==Member.FEMALE)
				 //					 오리지널스트림                   중간 처리 스트림
				 .mapToInt(Member::getAge).average().getAsDouble();
		 //				중간 처리 스트림			  최종 처리 스트림
		 System.out.println("여자 나이의 평균은 : "+fAgeAvg);
		
	}
}

class Member{
	public static int MALE = 0;
	public static int FEMALE = 1;
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}



	public String getName() {
		return name;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}
	
	
	
}
