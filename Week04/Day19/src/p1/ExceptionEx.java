package p1;

import java.io.FileNotFoundException;



public class ExceptionEx {
	public static void main(String[] args) {
		int a=10;//컴파일에러
		try {//예외가 발생할 수도 있는 문장
			int[] arr = new int[5];
			arr[5] = 30;//예외가 발생하면 아랫부분이 수행되지 않는다.
			int c = a / 0;//ArithmeticException 
						//예외인데 catch에선  ArrayIndexOutOfBoundsException뿐이라 예외를 못잡음
		}catch(ArithmeticException e) {//예외가 발생하면 catch에서 받는다.
			System.out.println(e.getMessage());//에러 메세지를 출력하라는 메소드
			System.out.println("산술적 오류");
		}catch(Exception e){
		
		
		}finally{//예외와 상관없이 무조건 실행할 문장
			System.out.println("DB닫기");
			System.out.println("연결된 자원 해제");
		}
		//예외처리를 반드시 해주어야지 되는 클래스의 메소드가 있다.
		
	}
}
