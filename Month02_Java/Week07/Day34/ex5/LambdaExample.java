package ex5;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class LambdaExample {
	private static Student[] students = {new Student("홍길동",90,96),
										 new Student("신용권",95,93)
	};
	
	public static double avg(ToIntFunction<Student> t) {
		int sum = 0;
		for(Student s:students) {
			sum += t.applyAsInt(s);
		}
		double avg = (double)sum/students.length;
		return avg;
	}
	
	public static void main(String[] args) {
		//double englishAvg = avg(s->s.getEnglishScore());
		double englishAvg = avg(Student::getEnglishScore);
		System.out.println(englishAvg);
		//double mathAvg = avg(s->s.getMathScore());
		double mathAvg = avg(Student::getMathScore);
		System.out.println(mathAvg);		
	}
}

class Student{
	private String name;
	private int englishScore;
	private int mathScore;
	
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}
}
