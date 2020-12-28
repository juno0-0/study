package p2;
/*
 * 학생 관리
 * 필드 : 학번, 이름, 전화번호, 학과
 * 메서드 : 입력, 조회, 수정, 삭제, 전체 출력
 */
public class Student {
	//필드 선언
	int hackbun;
	String name;
	String dept; 
	String tel;
	String teacherName;
	
	//메서드 선언
	void input() {
		hackbun = 202010;
		name = "최진영";
		dept = "컴퓨터공학과";
		tel = "555";
		teacherName="최미숙";
	}
	void search() {
		
	}
	void modify() {
		
	}
	void delete() {
		
	}
	void output() {
		System.out.println("학번 : "+hackbun);
		System.out.println("이름 : "+name);
		System.out.println("학과 : "+dept);
		System.out.println("전화 : "+tel);
		System.out.println("선생님 : "+teacherName);
	}
	
	//생성자
//	접근제한자 클래스명(){
		
//	}
	
	//매개 변수가 없는 모습의 생성자를 기본생성자
	public Student() {
		//힙메모리에 올라갈 때 자동으로 호출된다.
		//만약 클래스에 만들어 놓지 않았다면 컴파일러가 내용은 없이 자동으로 만들어 준다.
		//주로 하는 기능은 초기화
		hackbun=202011;
		name="korea";
	}
	
	//매개변수가 있는 모습의 생성자 : 명시적 생성자
	public Student(int hackbun, String name) {
		//a변수 2020
		//b변수 홍길동
		this.hackbun=hackbun;//this는 멤버필드 (현재클래스의 필드)
		this.name=name;		
	}
	
	
	
	
	public Student(int a, int b, int c) {
		
	}
	
	public Student(boolean a, String b) {
		
	}
	
	public Student(float a, long b) {
		
	}
	
	public Student(boolean a, String b, double c) {
		
	}
	
	public Student(Student a, boolean b, String c) {
		
	}
	
	public Student(int a, int b, int c, int d) {
//		System.out.println(a+b+c+d);
	}
	
	public Student(String dept, String tel) {
		this.dept=dept;
		this.tel=tel;
	}
	
	public Student(int hackbun, String name, String dept, String tel, String teacherName) {
		this.hackbun=hackbun;
		this.name=name;
		this.dept=dept;
		this.tel=tel;
		this.teacherName=teacherName;//멤버필드 : Student 클래스의 필드
	
		
	}
	
	
	
	//생성자를 여러개 둘 수 있다. 생성자 오버로딩(Overloading)
}
