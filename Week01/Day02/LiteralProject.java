package P1;
//문자형에서 '\n'
public class LiteralProject {
	public static void main(String[] args) {
		char char_value1 = 'A';
		char char_value2 = '\n';
		char char_value3 = '\t';
		/*
		System.out.print(char_value1);
		System.out.print(char_value2);
		System.out.print(char_value3);
		System.out.print("B");
		C언어에서는 System.out.printf("%c %c %c %c",char_value1,char_value2,char_value3,'B');
		System.out.print(char_value1 + char_value2 + char_value3 + 'B');
		 */		
		//System.out.println();안에 + 기호에 대한 설명
		//아스키코드로 'A' = 65 \n = 10	\t = 9	'B' = 66
		//char인 경우 더하기
		int a=10;
		int b=20;
		String word = "bangjunho";
		String word2 = "Hi!";
		System.out.println(a + b + word + (a + b));//문자열형 + 정수형 => 문자열형
		System.out.println(word2 + " " + word);
		
		boolean boolean1 = true;	//boolean타입에는 true, false만 들어갈 수 있다.(0,1도 안된다.)
		boolean boolean2 = false;
		
		boolean1 = 100 < 110;
		boolean2 = true && true;
		System.out.println(boolean1 + "   " + boolean2);
		
		//자료형 기본형 : 정수형 - int long byte short 실수형 - float double 문자형 - char 논리형 - boolean
		//String은 기본형이 아니고 참조형이지만 기본형의 형선언 방식을 따를 수 있다.)
		//	      참조형 : String 클래스의 참조변수
		
		//리터럴 정수 10진수 : 123456 8진수 : 073 041 앞에 0이붙고 0~7까지  16진수 : 0xfc 0xa3 0~f까지
		//     실수 소숫점 : 3.14f 3.14 지수형 : 0.3E-7(0.3*10^-7)
		//     문자형 : 'a' ' ' '\n' 2byte
		//     논리형 : true,false
		//     문자열 : "korea"
		
		
		
		
	}
}
