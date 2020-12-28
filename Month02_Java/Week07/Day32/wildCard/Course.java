package wildCard;

public class Course<T> {
	private String name;//�̸�
	private T[] students;//�迭
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]);//� Ÿ���� �迭���� ���� Object[]�� 
	}											//�Ű������� ũ�⸦ ������ְ� �װ� (T[])Ÿ������ ����ȯ

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getStudents() {
		return students;
	}

	public void setStudents(T[] students) {
		this.students = students;
	}
	
	//�迭�� ��� �ִ� �κ��� ã�Ƽ� �������� �߰��ϴ� �޼ҵ�
	public void add(T t) {
		for(int i=0;i<students.length;i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

	
	
}
