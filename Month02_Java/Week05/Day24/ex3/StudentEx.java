package ex3;

import java.util.HashMap;

public class StudentEx {
	public static void main(String[] args) {
		HashMap<Student, String> hashmap = new HashMap<>();
		hashmap.put(new Student("1"), "95");
		String score = hashmap.get(new Student("1"));
		//hashmap.get(key)��  �ش��ϴ� key�� ã�ٰ� ã���� value�� ������
		//��ã���� false ã���� value��
		System.out.println(score);
	}
}
