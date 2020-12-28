package ex3;

import java.util.HashMap;

public class StudentEx {
	public static void main(String[] args) {
		HashMap<Student, String> hashmap = new HashMap<>();
		hashmap.put(new Student("1"), "95");
		String score = hashmap.get(new Student("1"));
		//hashmap.get(key)이  해당하는 key를 찾다가 찾으면 value를 내놓음
		//못찾으면 false 찾으면 value값
		System.out.println(score);
	}
}
