package p1;

public class StaticInstanceEx01 {
	public static void main(String[] args) {
		//인스턴스 변수 2개
		String nameMain;
		int ageMain;
		
		//클래스 변수 2개
		//static String telMain;//하나의 메서드(main) 안에 인스턴스 변수와 static 변수를 넣으면 
		//static String deptMain;//인스턴스는 힙에 올라가야하고 static은 메서드영역에 올라가야 하기 때문에(위치가 달라서) 못올라감
		
		//Person 클래스의 클래스멤버(static)를 사용하기
		Person.tel = "1234";		//메모리에 올라가있어서 바로 쓸 수 있다
		Person.dept = "컴퓨터공학과";	//클래스명.으로 접근
		
		//Person 클래스의 인스턴스멤버를 사용하기
		Person p = new Person();//객체화(인스턴스화) = 힙메모리에 올리기 -> static이 붙지 않은 것만 올라간다.
		p.name = "홍길동";
		p.age = 20;
		//p.tel = "1111"; 오류는 안나지만 사용하지 않는다.
		
		//클래스 메서드를 사용하기
		Person.outputSt();
		
		//인스턴스 메서드를 사용하기
		p.output();
		
	}
}
