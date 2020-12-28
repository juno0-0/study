package sort;

public class Student implements Comparable<Student>{
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

	@Override
	public int compareTo(Student o) {
	  //return name.compareTo(o.name);//문자열 이름 순서대로 정렬하기
		return Integer.compare(score, o.score);//점수 순서대로 정렬하기
	}
}
