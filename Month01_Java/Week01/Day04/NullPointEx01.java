package P1;

public class NullPointEx01 {
	public static void main(String[] args) {
		//참조변수(배열, 클래스, 열거형, 인터페이스) 선언
		Student st;//stack에 주소가 들어갈 st가 생김
		//st = Student의 주소값을 담을 저장공간
		InterStudent is;//stack에 주소가 들어갈 is가 생김
		//is = InterStudent의 주소값을 담을 저장공간
		
		int[] arr;//배열
		
		//참조변수의 초기값을 넣기
		Student st1 = null;
		//null = heap에서 오는 주소가 없다.
		InterStudent ist1 = null;
		int[] arr1 = null;
		
		//NullPointerException 발생하는 예
		int[] intArray = null;
		intArray = new int[3];
		intArray[0] = 10;
		//heap에 공간이 없어서 10을 넣을 자리가 없는 것.
		System.out.println(intArray[0]);
		
		String str = null;
		str = "코리아 IT";
		System.out.println("총문자수 : "+str.length());
		//length() : 길이를 구하는 메소드
	}

}

class Student{
	
}
interface InterStudent{
	
}
