package p1;

public class ClassEx01 {
	public static void main(String[] args) {
		//Sungjuk이라는 클래스를 이용하여 성적처리하는 부분 담당(비즈니스 로직)
		//비즈니스 로직 -> 지시를 하는 입장(출력해, 입력해 등)
		
		//Sungjuk 클래스를 사용하기 위해 힙메모리에 올리기
//		Sungjuk sungjuk1 = new Sungjuk(100,200);//sungjuk이라는 변수에 클래스의 주소가 들어 있다.(참조변수)
		Sungjuk sungjuk = new Sungjuk();
		//입력 받는다
		sungjuk.input();//입력
		//합계-평균-석차
		sungjuk.sum();//합계
		sungjuk.avgMethod();//평균
		sungjuk.rank();//석차
		sungjuk.subjectSum();//전체합계
		sungjuk.subjectAvg();//전체평균
		//출력한다.
		sungjuk.output();
	}
}
