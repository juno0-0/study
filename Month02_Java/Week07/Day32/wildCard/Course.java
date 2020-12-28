package wildCard;

public class Course<T> {
	private String name;//이름
	private T[] students;//배열
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[])(new Object[capacity]);//어떤 타입의 배열일지 몰라서 Object[]에 
	}											//매개변수로 크기를 만들어주고 그걸 (T[])타입으로 형변환

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
	
	//배열에 비어 있는 부분을 찾아서 수강생을 추가하는 메소드
	public void add(T t) {
		for(int i=0;i<students.length;i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

	
	
}
