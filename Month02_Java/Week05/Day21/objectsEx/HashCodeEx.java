package objectsEx;

import java.util.Objects;

public class HashCodeEx {
	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		Student s3 = null;
		System.out.println(s1.hashCode());//Object 클래스의 해쉬코드 함수
		System.out.println(s2.hashCode());
		//System.out.println(s3.hashCode());//NullPointerException 발생
		System.out.println(Objects.hashCode(s1));
		System.out.println(Objects.hashCode(s2));
		System.out.println(Objects.hashCode(s3));//0이 출력
	}
}

class Student{
	int sno;
	String name;
	public Student(int sno, String name) {
		this.sno=sno;
		this.name=name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(sno,name);
		//원래 hashCode는 주소를 받아와서 만드는 것인데
		//Objects의 hashCode()를 재정의해서 sno와 name으로 hashCode를 만든 것
	}
}