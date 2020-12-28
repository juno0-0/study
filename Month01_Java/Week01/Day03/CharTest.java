package character;

public class CharTest {
	public static void main(String[] args) {
		//do-while
		//1. 100~1까지 출력하기 1줄에 20씩 출력하기
		//2. 5의 배수는 출력하지 않기 
		//		5의 배수를 구하는 방법 : 구하려는 수 % 5 == 0
		int i = 101;
		do {
			if(i%20==0) {
				System.out.println();
			}
			i--;//100
			if(i%5==0)continue; 
			System.out.printf("%5d",i);
		}while(i>0);
		
		
		
		
		
		/*
		//while
		int i=0,cnt=0;
		boolean flag = true;//당장은 사용하지 않지만 나중에 사용해야할 때 boolean값을 변수에 넣어서 사용한다.
		while(flag) {//true를 넣으면 무한 반복
			i++;
			if(i%2!=0) {
				System.out.printf("%5d",i);				
				cnt++;
			}
			if(cnt == 10) {
				System.out.println();
				cnt=0;
			}
			if(i==100)flag=false;
		}
		
		char char_value = 'B';//지역변수 : 활동 범위는 해당하는 메소드 속에서만 
		//printBMethod() 호출하기
		printBMethod(char_value);//메소드 선언(정의)
		printBMethod(char_value);
		*/
		
	}
	/*
	//메소드 만들기(생성하기)		pchar_value = char_value
	static void printBMethod(char pchar_value){
		System.out.println(pchar_value);
	}
	*/
}
