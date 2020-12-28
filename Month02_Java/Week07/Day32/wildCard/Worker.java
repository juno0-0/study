package wildCard;

public class Worker extends Person{
	//자손 클래스가 메모리에 올라갈 때 부모의 기본 생성자를 가지고 올라간다.
	public Worker(String courseName) {
		super(courseName);
	}
}
