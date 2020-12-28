package ex4;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Student> tree = new TreeSet<>();
		tree.add(new Student("white",92));
		tree.add(new Student("blue",96));
		tree.add(new Student("hong",86));
		
		Student student = tree.last();
		System.out.println("최고점수 : "+student.score);
		System.out.println("최고점수를 받은 아이디 : "+student.id);
		
	}
}
