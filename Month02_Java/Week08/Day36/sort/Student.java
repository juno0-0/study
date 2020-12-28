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
	  //return name.compareTo(o.name);//���ڿ� �̸� ������� �����ϱ�
		return Integer.compare(score, o.score);//���� ������� �����ϱ�
	}
}
