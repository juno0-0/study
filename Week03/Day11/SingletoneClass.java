package data;

public class SingletoneClass {
//	접근권한    static     클래스명		   변수명 			       인스턴스
	private static SingletoneClass singleTone = new SingletoneClass(); 
	
	private SingletoneClass() {
		System.out.println("싱글톤 클래스의 생성자 부분");
	}
	
	public static SingletoneClass getInstance() {//public이 없으면 같은 패키지 안에서만 사용 가능
		return singleTone;//참조변수 리턴 
	}
}
