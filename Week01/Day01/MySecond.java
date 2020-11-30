package p01;

public class MySecond {
	//정수형 변수 선언과 리터럴
	static byte byte_value = -128;//변수의 초기화	필드	-128 ~ 127까지의 정수 표현
	static short short_value = 100;//2바이트 표현범위 -32768 ~ 32767
	static int int_value = 2147483647;//4바이트이므로 표현범위 -21474863648 ~ 21474863647
	static long long_value = 0xadL;//a=10, b=11, c=12, d=13, e=14, f=15		L : long type이라는 뜻
	static char char_value = 97;//아스키코드 값을 넣으면 코드 문자를 출력한다.
	
	//실수형 변수 선언과 리터럴
	static float float_value = 3.12345678901f, float_value2 = -5.2f;	//실수형 4바이트 소숫점 7자리까지만 출력
	static double double_value = 3.12345678901234567, double_value2 = 5E7;	//실수형 8바이트 기본형. 부동소숫점 표현방식
	
	//문자형
	static char char_value1 = 'A';
	static char char_value2 = '\n';//제어문자
	static char char_value3 = '\t';
	static char char_value4 = '\'';// \다음에 특수문자를 출력하려고 할 때 사용함
	
	
/*																			
 * F2 = Rename
 * 이 파일에는 3개의 class가 있는 것
 */
	public static void main(String[] args) {
		
		System.out.println(char_value1 + char_value2 + "ㅁㅁ" + char_value3 + char_value4);
		
		System.out.printf("%d\n",byte_value);//10진수로 출력
		System.out.printf("%o\n",int_value);//8진수로 출력
		System.out.printf("%x\n",long_value);//16진수로 출력
		System.out.println(char_value);
		System.out.println(short_value);
		System.out.println(float_value + " "+float_value2);
		System.out.println(double_value + " "+double_value2);
		
		
	}
}

class Student{
	
	
}

class Teacher{
	
	
}