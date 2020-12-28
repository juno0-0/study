package compareEx;

import java.util.Comparator;
import java.util.Objects;
//오름차순 : ㄱ~ㅎ	return o1.name.compareTo(o2.name);
//내림차순 : ㅎ~ㄱ	return o2.name.compareTo(o1.name);
public class CompareExample {
	//객체 비교하기
	public static void main(String[] args) {
		//김명수, 홍지연
		Student s1 = new Student(3,"김명수");
		Student s2 = new Student(5,"홍명수");
		Student s3 = new Student(2,"최수진");
		//s1과 s2를 StudentCompartor()타입으로 비교하세요
		int result = Objects.compare(s1, s2, new StudentCompartor());
		if(result == 0)System.out.println("s1과 s2가 같은 번호");
		else if(result<0)System.out.println("s1이 s2의 앞 번호");
		else System.out.println("s1이 s2의 뒷 번호");
	}
	static class Student{//static 멤버 중첩클래스
		int sno;//번호
		String name;
		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
	}
	
	static class StudentCompartor implements Comparator<Student>{//static 멤버 중첩클래스
//		@Override
//		public int compare(Student o1, Student o2) {
//			
//			//return o1.name.compareTo(o2.name);//문자오름차순
//			return o2.name.compareTo(o1.name);//문자내림차순
//			
//		}
		
		
		/*
		@Override
		public int compare(Student o1, Student o2) {
			if(o1.sno<o2.sno)return -1;
			else if(o1.sno == o2.sno)return 0;
			else return 1;
		}//이게 Integer.compare()에 들어있는 것
		 //return (x < y) ? -1 : ((x == y) ? 0 : 1);
		*/
		@Override
		public int compare(Student o1, Student o2) {
			//return Integer.compare(o1.sno, o2.sno);//오름차순
			return Integer.compare(o2.sno, o1.sno);//내림차순
		}
		
	}
}//end CompareExample
