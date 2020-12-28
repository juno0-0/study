package streamPipelines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipelinesEx {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("ȫ�浿",Member.MALE,30),
					  new Member("�質��",Member.FEMALE,20),
					  new Member("�ſ��",Member.MALE,45),
					  new Member("�ڼ���",Member.FEMALE,27));
		
		 double mAgeAvg = list.stream().filter(a->a.getSex()==Member.MALE)
				//					 �������ν�Ʈ��                   �߰� ó�� ��Ʈ��
				.mapToInt(Member::getAge).average().getAsDouble();
		 		//				�߰� ó�� ��Ʈ��			  ���� ó�� ��Ʈ��
		 System.out.println("���� ������ ����� : "+mAgeAvg);
		 double fAgeAvg = list.stream().filter(a->a.getSex()==Member.FEMALE)
				 //					 �������ν�Ʈ��                   �߰� ó�� ��Ʈ��
				 .mapToInt(Member::getAge).average().getAsDouble();
		 //				�߰� ó�� ��Ʈ��			  ���� ó�� ��Ʈ��
		 System.out.println("���� ������ ����� : "+fAgeAvg);
		
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
