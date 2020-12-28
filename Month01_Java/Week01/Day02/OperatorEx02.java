package P3;

import java.util.Scanner;

public class OperatorEx02 {

	static void printBMethod() {
		char char_7 = 'B';
		System.out.println(char_7);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		//1번 문제
		//정수형 숫자를 하나 입력 받고 10진수, 16진수, 8진수 출력하는 프로그램
		System.out.print("정수 입력 : ");
		int i = sc.nextInt();
		System.out.printf("10진수 = %d\n",i);
		System.out.printf("8진수 = %o\n",i);
		System.out.printf("16진수 = %x\n",i);
		
		//기본형 자료형을 클래스로 만들어 놓을 클래스들이다. 
		//이것을 래퍼클래스(Wrapper class)라고 부른다.
		//2번 문제
		//각 데이터형의 크기를 확인하는 프로그램 작성
		System.out.printf("Byte형의 크기 ===> %d",Byte.SIZE);
		//System.out.println("Byte형의 크기 ===> "+Byte.SIZE+"bit");
		System.out.printf("\nshort형의 크기 ===> %d",Short.SIZE);
		System.out.printf("\nint형의 크기 ===> %d",Integer.SIZE);
		System.out.printf("\nlong형의 크기 ===> %d",Long.SIZE);
		System.out.printf("\nfloat형의 크기 ===> %d",Float.SIZE);
		System.out.printf("\ndouble형의 크기 ===> %d",Double.SIZE);
		System.out.printf("\nchar형의 크기 ===> %d",Character.SIZE);
		//System.out.printf("\nboolean형의 크기 ===> %d",Boolean.SIZE);(얘는 없음)
		
		//3번 문제
		//HelloJava.java 파일
		//필드로 정적인 name 자료형 String :초기값 : "Hello, Java Programming!"
		String name = "Hello, Java Programming!";
		System.out.println(name);
		
		//4번 문제
		//TypeInt클래스
		//정수4종류의 자료형을 모두 선언한 후 초기값을 저장
		//위의 변수를 모두 메소드 printf( )로 호출하여 출력
		byte b_1=1;
		short s_1=2;
		int i_1=3;
		long l_1=4L;
		System.out.printf("%d %d %d %d",b_1,s_1,i_1,l_1);
		
		//5번 문제
		//HelloAndroid 클래스
		//패키지 mobile
		//지역변수로 문자열로 저장할 str 선언후 초기값으로 "Hello, Android Application!" 저장
		//변수 str을 출력
		String str = "Hello, Android Application!";
		System.out.println(str);
		
		//6번 문제
		//ToYard클래스
		//패키지 conversion에 구현
		//지역변수로 meter를 double로 선언하여 100.785로 저장
		//100.785미터를 야드로 변환하여 출력
		//1미터는 1.0936 야드
		double meter = 100.785;
		double yad = 100.785*1.0936;
		System.out.printf("%.2f",yad);
		
		//7번 문제
		//CharTest클래스
		//패키지 character에 구현
		//지역변수를 하나 선언하여 문자 'B'를 저장
		//위의 변수를 각각 printBMethod( )로 2번 출력
		printBMethod();
		printBMethod();
		
		//8번 문제
		//PersonInfo클래스
		//몸무게(정수)와 키(상수)를 표준입력을 처리하여 적당한 변수에 저장
		//입력받은 몸무게와 키를 출력
		System.out.print("몸무게 : ");
		int kg = sc.nextInt();
		System.err.print("키 : ");
		final int cm = sc.nextInt();
		System.out.println(kg+"kg "+cm+"cm");
		*/
		//9번 문제
		//ToPound클래스
		//단위 kg의 무게를 표현하는 실수1개를 표준 입력을 입력 받아 적당한 변수에 저장
		//입력 받은 값을 출력
		//입력 받은 값을 파운 단위로 출력
		//1kg은 2.2파운드이다.
		System.out.print("무게 : ");
		double w = sc.nextDouble();
		System.out.println(w+"kg");
		double p = w*2.2;
		System.out.println(p+"pound");
		
		
		
		
	}

}
