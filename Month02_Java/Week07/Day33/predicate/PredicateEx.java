package predicate;


import java.util.*;
import java.util.function.Predicate;

public class PredicateEx {
	private static List<Student> list = Arrays.asList(new Student("홍길동","남자",90),
													   new Student("김순희","여자",90),
													   new Student("김자바","남자",95),
													   new Student("박한나","여자",92));
	
	private static double avg(Predicate<Student> predicate) {//avg() 정의함
		int count = 0, sum = 0;
		for(Student s: list) {
			if(predicate.test(s)) {//return predicate.sex.equals("남자")
				count++;			//return이 있는 메소드는 메소드 호출을 리턴값으로 봐야함
				sum += s.score;		//predicate.test(s)는 predicate.sex.equals("남자")
			}
		}
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(predicate -> {return predicate.sex.equals("남자");});
		System.out.println(maleAvg);
	}
	
}


class Student{
	String name;
	String sex;
	int score;
	
	public Student(String name, String sex, int score) {
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}