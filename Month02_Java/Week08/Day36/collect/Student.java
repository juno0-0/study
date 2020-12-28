package collect;

public class Student implements Comparable<Student>{
	public enum Sex {MALE,FEMALE}
	public enum City {SEOUL,BUSAN}
	
	private String name;
	private int score;
	private Sex sex;
	private City city;
	
	public Student(String name, int score, Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}
	
	public Student(String name, int score, Sex sex, City city) {
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
	}

	public final String getName() {
		return name;
	}

	public final int getScore() {
		return score;
	}

	public final Sex getSex() {
		return sex;
	}

	public final City getCity() {
		return city;
	}
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
	
	
	
}
