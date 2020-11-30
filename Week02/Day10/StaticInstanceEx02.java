package p1;

public class StaticInstanceEx02 {
	public static void main(String[] args) {
		
		Student.kor = 100;//클래스명.변수 : static변수
		Student.eng = 80;
		
		Student.total();//클래스명.메서드 : static메서드
		
		Student s = new Student("이경희","음악과");//명시적 생성자
		System.out.println(s.name);//객체명.변수 : 인스턴스변수
		System.out.println(s.dept); 
	}
}
