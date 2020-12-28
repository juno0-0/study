package ex2;


import java.util.*;

import ex3.Student;

public class HashSetEx {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1,"�垮瘚�"));
		set.add(new Student(2,"薑⑷��"));
		set.add(new Student(3,"譆團辦"));
		set.add(new Student(3,"梯團辦"));
		set.add(new Student(2,"梯團辦"));
		set.add(new Student(2,"梯團辦"));
		set.add(new Student(1,"梯團辦"));
		set.add(new Student(11,"梯團辦"));
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.studentNum+" : "+s.name);
		}
	}
}
