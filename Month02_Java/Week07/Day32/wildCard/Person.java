package wildCard;

public class Person {
	private String courseName;
	//����� �����ڸ� �ۼ��ϸ� �⺻ �����ڴ� �����Ϸ��� �ڵ����� ����� ���� �ʴ´�.
	public Person() {}
	
	public Person(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	@Override
	public String toString() {
		return courseName;
	}
}
