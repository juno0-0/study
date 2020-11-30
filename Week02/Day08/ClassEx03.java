package p2;

public class ClassEx03 {
	public static void main(String[] args) {
		Student st = new Student();//Student() : 생성자
		System.out.println(st.hackbun);
		System.out.println(st.name);
		System.out.println(st.dept);
		System.out.println(st.teacherName);
	
		
		
		Student st1 = new Student(2030,"홍길동");//매개변수에 2030을 받을 int 변수와 String 변수를 만든다.
		System.out.println("<<st1 참조변수가 가르키는 필드 출력>>");
		System.out.println(st1.hackbun);
		System.out.println(st1.name);
		
		
		Student st2 = new Student("컴퓨터공학과","12345");
		System.out.println("<<st2 참조변수가 가르키는 필드 출력>>");
		System.out.println(st2.dept);
		System.out.println(st2.tel);
		System.out.println(st2.hackbun);
		System.out.println(st2.name);
		//st1과 st2가 가지고 있는 주소가 달라서 힙메모리에 있는 값이 다르다.
		
		Student st3 = new Student(2040,"김수연","수학과","123123","박명자");
		System.out.println(st3.hackbun);
		System.out.println(st3.name);
		System.out.println(st3.dept);
		System.out.println(st3.tel);
		System.out.println(st3.teacherName);
		Student st4 = new Student(3.4f, 100L);
		Student st5 = new Student(false, "50",5.5);
		Student st6 = new Student(new Student(), true, "aa");
		//매개변수에 new Student()하면 힙메모리에 주소가 생기고 그거를 받을 변수를 만드는 것
		Student st7 = new Student(90,80,10,20);//얘는 st2와 매개변수가 같아서 st2와 같은 생성자를 호출한다.
		Student st8 = new Student(90,80);
		
		
		
		//생성자를 호출할 때 생성자 안에 있는 값은 매개변수의 타입, 갯수와 같아야 한다.
		
		
		
		
	}
}
