package p2;

public class ClassEx02 {
	public static void main(String[] args) {
		//Student 클래스의 멤버 변수를 사용하고 싶다.
		//(클래스에서 다른 클래스의 변수 값을 사용하고 싶다.)
		//사용하려면 힙 메모리에 올린다.
		Student st = new Student();
		st.hackbun=202001;
		st.name="홍길동";
		st.tel="12345";
		st.teacherName="정현희";

		//필드에 값을 변경한다.
		st.name="이순신";
		st.hackbun+=10;
		
		//필드에 값을 지운다
		st.name=null;
		
		//다른 클래스에 있는 필드를 출력
		System.out.println(st.hackbun);
		System.out.println(st.name);
		System.out.println(st.dept);
		System.out.println(st.tel);
		System.out.println(st.teacherName);
		
		//메서드 호출하기
		//입력 메서드를 호출해서 값을 넣기
		st.input();//"최미숙"
		st.output();
		
		
	}

}
