package P3;

import java.util.Scanner;

public class OperatorEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		//1번 문제 
		//2+3-4  = 1 2 + 3 * 4 =14 2 * 3 / 4 = 1.5 4 / 3 몫은 1  4/3의 나머지는

		System.out.println(2+3-4);
		System.out.println(2+3*4);
		System.out.println(2*3/4.0);
		System.out.println(4/3);//몫
		System.out.println(4%3);//나머지
		
		//2번 문제
		//실습 2개를 입력받아 산술연산하세요(+, - , * , /, %)
		
		System.out.print("1번 : ");
		int num1 = sc.nextInt();
		System.out.print("2번 : ");
		int num2 = sc.nextInt();
		System.out.print("+,-,*,/,% : ");
		String choice = sc.next();
		
		switch(choice) {
			case "+":
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case "-":
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case "*":
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case "/":
				System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
				break;
			case "%":
				System.out.println(num1+"%"+num2+"="+(num1%num2));
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
		
		
		//3번 문제
		//동전교환 프로그램
		//입력된 액수만큼 500원, 100원 50원 10원짜리 동전으로 교환해 주는 프로그램을 작성
		//조건 ) 동전의 총개수는 최소화한다, 고액의 동전을 우선적으로 교환해 준다
		int coin500=0, coin100=0, coin50=0, coin10=0, coin=0;
		
		System.out.print("금액 입력 : ");
		int money = sc.nextInt();
		
		coin500 = money/500;
		money -= coin500*500;
		coin100 = money/100;
		money -= coin100*100;
		coin50 = money/50;
		money -= coin50*50;
		coin10 = money/10;
		money -= coin10*10;
		coin = money;
		
		System.out.println("500원짜리 ==>"+coin500);
		System.out.println("100원짜리 ==>"+coin100);
		System.out.println("50원짜리 ==>"+coin50);
		System.out.println("10원짜리 ==>"+coin10);
		System.out.println("바꾸지 못한 잔돈 ==>"+coin);
		
		
		//4번 문제
		//윤년계산프로그램
		//조건) 윤년은 4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면 윤년이다. 
		//40으로 나누어 떨어지는 해도 윤년에 포함된다.
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		
		//5번 문제
		//표준 입력으로 두 실수를 입력 받아 합, 평균을 구하여 출력하는 프로그램 합과 평균 모두 실수로 출력
		System.out.print("실수 1 : ");
		double d_num1 = sc.nextDouble();
		System.out.print("실수 2 : ");
		double d_num2 = sc.nextDouble();
		double sum = d_num1+d_num2;
		double avg = sum/2;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		
		//6번 문제
		//표준 입력으로 두 실수를 모두 정수로 변환하여 합과 평균 모두 실수
		System.out.println("실수 1 : ");
		double d_num3 = sc.nextDouble();
		System.out.println("실수 2 : ");
		double d_num4 = sc.nextDouble();
		int a = (int)d_num3;
		int b = (int)d_num4;
		System.out.println("합계 : "+(double)(a+b));
		System.out.println("평균 : "+(a+b)/2.0);
		
		
		//7번 문제
		//무게의 단위인 킬로그램(kg)을 소수로 입력 받아 파운드로 계산하여 소수점 3자리까지 출력하는 프로그램을 작성하시오. 
		//1파운드는 0.453592킬로그램
		System.out.print("무게를 입력 : ");
		double w = sc.nextDouble();
		double p = w*0.453592;
		System.out.printf("파운드 : %.3lf",p);
		
		
		//8번 문제
		//문자 하나와 온도를 실수형을 입력 받아 문자가 F나 f이면 입력받은 값을 화씨로 간주하여 섭씨로 바꾸고 
		//입력 받은 문자가 C나 c이면 입력받은 값을 섭씨로 간주하여 화씨로 바꿔 결과를 출력하는 프로그램을 작성하시오.
		System.out.print("문자 : ");
		String s = sc.next();
		System.out.print("온도 : ");
		double d_num5 = sc.nextDouble();
		switch(s){
			case "F":
			case "f":
				System.out.println((d_num5-32)/1.8);
				break;
			case "C":
			case "c":
				System.out.println(d_num5*1.8+32);
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
		
		
		//9번 문제
		//천만 이하의 정수 하나를 입력 받아 우리가 사용하는 단위인 만, 천, 백, 십, 일 단위로 출력하는 프로그램을 작성하시오
		//즉 입력이 2347653이면 "234만 7천 6백 5십 3입니다."로 출력하세요
		int a1,a2,a3,a4,a5;
		System.out.println("7자리 이내 정수 : ");
		int n = sc.nextInt();
		a1=n/10000;
		n-=a1*10000;
		a2=n/1000;
		n-=a2*1000;
		a3=n/100;
		n-=a3*100;
		a4=n/10;
		n-=a4*10;
		a5=n;
		System.out.println(a1+"만"+a2+"천"+a3+"백"+a4+"십"+a5+"입니다.");
		
		
		//10번 문제
		//조건연산자를 이용하여 임의의 달을 입력받아 이달이 상반기이면 "상반기입니다"를 
		//하반기이면 "하반기 입니다"를 출력하는 프로그램을 작성하시오.
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.println(month>6?"하반기":"상반기");
		
		
		//11번 문제
		//세수를 입력받아 가장 큰 수를 구하는 프로그램을 조건 연산자를 이용하여 작성하시오.
		System.out.print("1번 : ");
		int num_1 = sc.nextInt();
		System.out.print("2번 : ");
		int num_2 = sc.nextInt();
		System.out.print("3번 : ");
		int num_3 = sc.nextInt();
		
		if(num_1>num_2&&num_1>num_3) {
			System.out.println("가장 큰 수 : "+num_1);
		}else if(num_2>num_1&&num_2>num_3){
			System.out.println("가장 큰 수 : "+num_2);
		}else {
			System.out.println("가장 큰 수 : "+num_3);
		}
		
		
		//12번 문제
		//표준 입력으로 키와 몸무게를 실수로 입력 받아 다음 조건을 이용하여 정상인지, 비만인지 출력하는 프로그램을 작성하시오
		System.out.print("키 : ");
		int cm = sc.nextInt();
		System.out.print("몸무게 : ");
		int kg = sc.nextInt();
		if(kg<=(cm-100)*0.9) {
			System.out.println("정상");
		}else {
			System.out.println("비만");
		}
		
		
		//13번 문제
		//초를 입력받아 시 분 초로 계산하여 출력하는 프로그램
		System.out.print("초 : ");
		int second = sc.nextInt();
		int hour = second/3600;
		second -= hour*3600;
		int minute = second/60;
		second -= minute*60;
		System.out.println(hour+"시"+minute+"분"+second+"초");
		
		
		//14번 문제
		//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때 학생당 몇개를 가질 수 있고 최종적으로 몇개가 남는지 구하는 프로그램
		System.out.print("연필 수 : ");
		int p = sc.nextInt();
		int stu = p/30;
		int rem = p%30;
		System.out.println("총 연필 수 : "+p);
		System.out.println("1인당 : "+stu+"개\n"+"나머지 : "+rem+"개");
		
		
		//15번 문제
		//십의 자리 이하를 버리는 코드 예를 들면 356이며 300이 나올 수 있도록 하는 프로그램
		System.out.print("수 입력 : ");
		int v = sc.nextInt();
		System.out.println((v/100)*100);
		 */
		
		
	}

}
