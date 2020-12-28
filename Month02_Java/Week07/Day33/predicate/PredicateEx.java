package predicate;


import java.util.*;
import java.util.function.Predicate;

public class PredicateEx {
	private static List<Student> list = Arrays.asList(new Student("ȫ�浿","����",90),
													   new Student("�����","����",90),
													   new Student("���ڹ�","����",95),
													   new Student("���ѳ�","����",92));
	
	private static double avg(Predicate<Student> predicate) {//avg() ������
		int count = 0, sum = 0;
		for(Student s: list) {
			if(predicate.test(s)) {//return predicate.sex.equals("����")
				count++;			//return�� �ִ� �޼ҵ�� �޼ҵ� ȣ���� ���ϰ����� ������
				sum += s.score;		//predicate.test(s)�� predicate.sex.equals("����")
			}
		}
		return (double)sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(predicate -> {return predicate.sex.equals("����");});
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