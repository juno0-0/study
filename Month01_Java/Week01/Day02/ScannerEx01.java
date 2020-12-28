
package P2;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		//scanf("%d",&number);
		//키보드로부터 입력받기
		//Scanner 클래스 
		//C언어에서 malloc = 동적메모리 할당 --> new
		Scanner sc = new Scanner(System.in);	//System은 운영체제에 도움을 받는 것, 
												//키보드 입력할 수 있는 클래스를 메모리에 올림 
		System.out.println("정수를 입력하세요");		//Scanner 클래스가 메모리에 올라감 = 주소 생김
		int number = sc.nextInt();				//-> Scanner sc라는 변수가 주소를 받음
		
		System.out.println("실수를 입력하세요");
		double number1 = sc.nextDouble();
		
		System.out.println("논리형을 입력하세요");
		boolean boolean1 = sc.nextBoolean();
		
		System.out.println("이름를 입력하세요");		//nextLine(): 한줄을 몽땅 받는다.
		String name = sc.next();
		
		System.out.println(number);
		System.out.println(number1);
		System.out.println(boolean1);
		System.out.println(name);
	}

}
