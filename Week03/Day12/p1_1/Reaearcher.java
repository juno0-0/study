package p1;

public class Reaearcher extends Person{
	
	void 연구하기() {
		먹기();//부모에게 상속받은 메소드
		잠자기();//부모에게 상속받은 메소드
		eat = "피자";//부모에게 상속받은 필드
		Student s = new Student();
		//부모클래스인 Person에는 공부하기()가 없고 자식클래스에도 없기 때문에 Student 클래스를 객체화를 해야만 쓸 수 있다.
		//혹은 공부하기()라는 메소드를 생성하면 쓸 수 있음.
		s.공부하기();
	}
	
}
