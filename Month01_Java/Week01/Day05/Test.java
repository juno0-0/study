package P1;

public class Test {
	public static void main(String[] args) {
		String name1 = "방준호";
		String name2 = "방준호";
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		
		//name3의 가르키는 값과 name4가 가르키는 값이 같은지 비교하기
		if(name3.equals(name4)) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		//==연산자는 기본형인 경우에 같은것 !=는 기본형인 경우에 같지 않은 것을 의마한다.
		//참조형인 경우 ==은 참조형이 가지고 있는 주소를 비교한다.
		if(name3==name4) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
	}
}
class Student{
	
}