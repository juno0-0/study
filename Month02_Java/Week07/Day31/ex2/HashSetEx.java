package ex2;


import java.util.*;

import ex3.Student;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1,"È«±æµ¿"));
		set.add(new Student(2,"Á¤ÇöÈñ"));
		set.add(new Student(3,"ÃÖ¹Î¿ì"));
		set.add(new Student(3,"±è¹Î¿ì"));
		set.add(new Student(2,"±è¹Î¿ì"));
		set.add(new Student(2,"±è¹Î¿ì"));
		set.add(new Student(1,"±è¹Î¿ì"));
		set.add(new Student(11,"±è¹Î¿ì"));
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.studentNum+" : "+s.name);
		}
	}
}
