package p1;

public class Student {
	static int kor;
	static int eng;
	
	String name;
	String dept;
	
	static void total() {
		System.out.println(kor+eng);
//		name = "홍길동"; <- 인스턴스변수라서 오류 = static 메서드가 메모리에 올라갈 때 인스턴스변수는 메모리에 없기 때문에
	}
	
	public Student(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
}
