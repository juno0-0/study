package ex2;


import java.util.*;

import ex3.Student;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1,"ȫ�浿"));
		set.add(new Student(2,"������"));
		set.add(new Student(3,"�ֹο�"));
		set.add(new Student(3,"��ο�"));
		set.add(new Student(2,"��ο�"));
		set.add(new Student(2,"��ο�"));
		set.add(new Student(1,"��ο�"));
		set.add(new Student(11,"��ο�"));
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.studentNum+" : "+s.name);
		}
	}
}
