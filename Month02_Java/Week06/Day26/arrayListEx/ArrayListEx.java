package arrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		//ArrayList al = new ArrayList();//객체생성 
		List al = new ArrayList();//객체생성 다형성
		//값 넣기 - 정수 10, 20, 30
		al.add(new Integer(10));
		al.add(20);//그냥 값을 넣어도 된다.
		al.add(new Integer(30));
		al.add(new Integer(10));
		
		//값 넣기 - 실수 1.1, 3.3
		al.add(new Double(1.1));
		al.add(new Double(3.3));
		
		//값 넣기 - 논리 true, false;
		al.add(new Boolean(true));
		al.add(new Boolean(false));
		
		//값 넣기 - Car클래스, Student 클래스 참조변수 넣기
		al.add(new Car());
		al.add(new Student());
		al.add(new Car());
		al.add(new Car());
		
		//인덱스 내용 바꾸기(수정하기)
		al.set(3, new Double(20.15));
		al.set(5, new Car());
		
		//ArarryList 안에 들어 있는 내용을 출력하기
		System.out.println(al.get(5));
		System.out.println(al.get(7));
		System.out.println(al.get(11));

		System.out.println();
		al.add(3, new Integer(100));
		al.add(5, new Student());
		
		//전체 출력하기 get(0)~get(11) 반복한다.
		//ArrayList의 전체 크기 = size() 
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

class Car{ }

