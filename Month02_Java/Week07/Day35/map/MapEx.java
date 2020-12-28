package map;

import java.util.Arrays;
import java.util.List;

public class MapEx {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student("홍길동",10),
												  new Student("신용권",20),
												  new Student("유미선",30));
		
		studentList.stream().mapToInt(Student::getScore).forEach(v->System.out.print(v+" "));
	}
}
class Student{
	private String name;
	private int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public final String getName() {
		return name;
	}
	public final int getScore() {
		return score;
	}
	
}
