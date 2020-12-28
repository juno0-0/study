package P1;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//12번 문제
		int cnt=0;
		int result;
		int com = (int)(Math.random()*100)+1;
		System.out.println("0~100 숫자 입력 : ");
		while(true) {
			result = sc.nextInt();
			if(result>com) {
				System.out.println("down");
				cnt++;
			}else if(result<com) {
				System.out.println("up");
				cnt++;
			}else {
				cnt++;
				System.out.println("정답");
				System.out.println(cnt);
				break;
			}
		}
		
		
		
		
		
		
		/*
		//2번 풀이
		System.out.print("n:");
		int n = sc.nextInt();
		int i,j;//i는 행의 첨자 변수, j는 열의 첨자 변수
		for(i=0; i<n; i++) {
			for(j=n; j>=-n; j--) {//7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
				if(Math.abs(j)>i) System.out.print(' ');
				else System.out.printf("%d",Math.abs(j));
			}
			System.out.println();
		}
		*/
		
		
		
		/*
		//5번문제
		//다음 조건을 만족하는 프로그램을 작성하시오.
		//원금이 1,000,000인 경우, 예치 기간을 1년에서 10년까지 매년 말에 받을 총 금액을 출력
		//년 단위 단리이자 = 원금 * 이율(4.5%) * 년(예치기간)
		//만기 시 총 수령액(년리 적용) = 원금(1+ 이율(4.5%) * 년(예치기간)
		int money = 1000000;
		double full = 0;
		for(int i=1;i<=10;i++) {
			if(i==10) {
				full = (money*0.045)*i+money;
				break;
			}
			double dNum = (money*0.045)*i;
			System.out.println(i+"년 단리이자 : "+(int)dNum );
			System.out.println(i+"년 총 금액 : "+(int)(dNum+money));
		}
		System.out.println("만기시 총 수령액 :"+(int)full);
		
		
		
		
		
		
		
		
		//11번 문제
		//난수 = 예상하지 못한 수
		//					   클래스명.메서드명()
		//기본은 0.0 <= Math.random() < 1.0
		//1~3까지 랜덤하게 나오는 수를 만들어 보기
		//1단계 원하는 수의 가장 큰수를 곱함 
		//0.0*3 <= Math.random()*3 < 1.0*3
		//0.0 <= Math.random()*3 < 3.0
		//2단계 정수형으로 형변환한다.
		//(int)0.0 <= (int)Math.random()*3 < (int)3.0
		//0 <= (int)Math.random()*3 < 3
		//3단계 각변에 1을 더한다. (안하면 1~3이 아니라 0~2가 나온다.)
		//0+1 <= (int)Math.random()*3+1 < 3+1
		//1 <= (int)Math.random()*3+1 < 4
		double double_random = Math.random();
		int win=0;
		int lose=0;
		int draw=0;
		for(int i=0;i<10;i++) {
			System.out.print("가위(1), 바위(2) 보(3)중 하나를 입력하세요 : ");
			int n = sc.nextInt();
			int com = (int)(Math.random()*3)+1;
			switch(n) {
			case 1:
				if(com>n) {
					System.out.println(n);
					System.out.println(com);
					System.out.println("짐");
					lose++;
				}else if(com<n){
					System.out.println(n);
					System.out.println(com);
					System.out.println("이김");
					win++;
				}else {
					System.out.println(n);
					System.out.println(com);
					System.out.println("비김");
					draw++;
				}break;
			case 2:
				if(com>n) {
					System.out.println(n);
					System.out.println(com);
					System.out.println("짐");
					lose++;
				}else if(com<n){
					System.out.println(n);
					System.out.println(com);
					System.out.println("이김");
					win++;
				}else {
					System.out.println(n);
					System.out.println(com);
					System.out.println("비김");
					draw++;
				}break;
			case 3:
				if(com>n) {
					System.out.println(n);
					System.out.println(com);
					System.out.println("짐");
					lose++;
				}else if(com<n){
					System.out.println(n);
					System.out.println(com);
					System.out.println("이김");
					win++;
				}else {
					System.out.println(n);
					System.out.println(com);
					System.out.println("비김");
					draw++;
				}break;
			}
			
		}
		System.out.println("승 : "+win);
		System.out.println("패 : "+lose);
		System.out.println("무 : "+draw);
		
		//1점부터 100점까지 랜덤
		//0.0*100<=Math.random()*100<1.0*100
		//0<=(int)(Math.random()*100)<100
		//1<=(int)(Math.random()*100)+1<101
		
		
		
		
		
		//1번 문제
		// 1에서 100까지의 정수 중에서 2, 3, 5, 7의 배수를 제외한 수를 한행에 10개씩 출력하세요.
		int cnt = 0;
		for(int i=1;i<101;i++) {
			if(i%2==0||i%3==0||i%5==0||i%7==0)continue;
			System.out.printf("%2d ",i);
			cnt++;
			if(cnt%10==0) {
				System.out.println();
			}
		}
		
		//2번 문제
		//다음을 출력하는 프로그램을 중첩된 for문을 이용하여 작성하시오
		//힌트 ) Math.abs( ) : 절대값을 구하는 매소드 예) -7이면
		System.out.print("n:");
		int n = sc.nextInt();
		for(int i=1;i<n+1;i++) {	//행
			for(int j=n-1;j+1>i;j--) {	//공백
				System.out.print(" ");
			}
			for(int j=-i+1;j<i;j++) {	//숫자
				System.out.print(Math.abs(j));
			}
			System.out.println();
		}
	
		//3번 문제
		//표준 입력으로 입력한 정수에서 각각의 자리에 해당하는 수를 반대로 출력하는 프로그램을 do~while문을 이용하여 작성하시오
		//1234 넣으면 4321나오게 배열 안쓰고
		boolean flag = true;
		System.out.print("1 : ");
		int b1 = sc.nextInt();
		System.out.print("2 : ");
		int b2 = sc.nextInt();
		System.out.print("3 : ");
		int b3 = sc.nextInt();
		
		do {
			System.out.println(b3);
			System.out.println(b2);
			System.out.println(b1);
			flag = false;
		}while(flag);
		
		//4번 문제
		//다음 수식과 내용을 참고로 해당하는 x와 y값을 출력하는 프로그램을 작성하시오.
		//y = 4*x^3 + 5*x^2 + x + 2, x는 5에서 10사이 0.5씩 증가하도록
		//방정식을 구하는 프로그램
		//빅데이터 알고리즘에서 방정식을 도출하여 학습하는 과정과 비슷함
		//데이터를 만들어서 인공지능 프로그램에 학습을 시킴
		double y;
		for(double x=5; x<=10;x+=0.5) {
			y = 4*x*x*x + 5*x*x +x+2;
			System.out.println("x="+x +"  "+ "y="+y);
		}
		
		//7번 문제
		//1부터 n까지 합 중에서 5000을 넘지 않는 가장 큰 합과 그때에 n을 구하는 프로그램 작성하시오
		int total=0;
		int end=0;
		System.out.print("n을 입력 : ");
		int n = sc.nextInt();
		for(int i=1;i<n;i++) {
			total += i;
			end = i;
			if(total>=4950) {
				break;
			}
			
		}
		System.out.println("n : "+end);
		System.out.println("가장 큰 합 : "+total);
		
		//8번 문제
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("%3d x %3d = %3d",j,i,i*j);
			}
			System.out.println();
		}
		
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(i+"x"+j+"="+(i*j)+" ");
			}
			System.out.println();
		}
		
		
		//9번 문제
				//[1, 1] [1, 2] [1, 3] [1, 4] [1, 5]
				//[2, 1] [2, 2] ...................... [2, 5]
				for(int i=1;i<6;i++) {
					for(int j=1;j<6;j++) {
						System.out.print("["+i+","+j+"]");
					}
					System.out.println();
				}
		
		//10번 문제
			[1,1]
			[2,2]
			[3,3]
			[4,4]
			[5,5]
		for(int i=1;i<6;i++) {
			System.out.println("["+i+","+i+"]");
		}
		
		//14번 문제
		System.out.print("숫자를 입력하세요.(예:12345) : ");
		String str = sc.next();
		//"12345" ---> 12345
		int num = Integer.parseInt(str);
		int sum=0;
		while(num>0) {
			sum += num%10;
			System.out.println("sum= "+sum+"  num= "+num);
			num/=10;
		}
		
		
		
//		for(초깃값;조건식;증감식){
//			조건이 참일 때 처리할 내용
//		}
		/*
		int i=1,j=100;
		for(;;) {
			if(!(i<101&&j>10))break;//조건식이 참인데 !를 만나면 거짓, 거짓인데 !를 만나면 참
			System.out.printf("i= %3d,\n j=%3d",i,j);
			
			i++;
			j+=10;
		}
		*/

	}

}
