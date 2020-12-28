package arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx03 {
	public static void main(String[] args) {
		
		List<Student> ls = new ArrayList<>();
		List<Integer> li = new ArrayList<>();
		//ls안에 Student클래스로 3개 넣기 학번 2020 2019 2019
		ls.add(new Student("2020","홍길동"));
		ls.add(new Student("2019","이순신"));
		ls.add(new Student("2019","최경희"));
		//li안에 100, 200, 300 넣기
		li.add(100);
		li.add(200);
		li.add(300);
		//li에서 1번 인덱스에 100넣기(삽입)
		li.add(1, 100);
		//ls에서 2번 인덱스에 "2018"넣기(삽입)
		ls.add(2, new Student("2018","정현희"));
		//최경희를 출력. 출력은 get(index)
		System.out.println(ls.get(3).getName());
		//2018을 출력
		System.out.println(ls.get(2).getNo());
		//최경희를 최무선으로 바꿔보세요
		ls.get(3).setName("최무선");
		//2018을 2017로 바꿔보세요
		ls.get(2).setNo("2017");
		System.out.println(ls.get(3).getName());
		System.out.println(ls.get(2).getNo());
		//3번 index 찾기
		
		//2017이 몇번 index에 있는지
		
	}
}

class Student{
	private String no;
	private String name;
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student() {
		
	}
	public Student(String no, String name) {
		this.no = no;
		this.name = name;
	}
	
}