package p1;

import java.util.Calendar;

public class EnumEx01 {
	public static void main(String[] args) {
		//today(참조변수)가 열거형 Week를 기억해준다.
		Week today = null;
		Week reservationDay = null;
		
		Calendar cal = Calendar.getInstance();//Calendar클래스를 사용하게 메모리에 올림
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);//일요일부터 시작(1~7)
//		int week1 = cal.get(Calendar.DATE);
//		System.out.println(week1);//오늘 날짜
//		int week2 = cal.get(Calendar.DAY_OF_MONTH);
//		System.out.println(week2);//한달에서 오늘 날짜
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘 요일 : "+today);
		String name = today.name();//name() : 열거 객체의 문자열을 리턴
		System.out.println(name);
		today = Week.FRIDAY;
		int ord = today.ordinal();//ordinal() : 열거 객체의 순번을 리턴
		System.out.println(ord);//Week에 선언한 순번
		int com = today.compareTo(Week.MONDAY);//compareTo(Week.SUNDAY) : FRIDAY와 SUNDAY를 비교 -2
		if(com==0)System.out.println("같은 날");
		else if(com<0)System.out.println("뒷 날");
		else System.out.println("앞에 날");
		System.out.println(com);		//FRIDAY와 FRIDAY를 비교 0, FRIDAY와 SATURDAY를 비교 -1, FRIDAY와 MONDAY 비교 4
		
		Week newToday = today.valueOf("TUESDAY");//valueOf() : String을 넣으면 Week 타입이 나온다.(받을 때도 Week타입으로 받는다)
		String n = newToday.name();
		System.out.println(n);
		
		Week[] w = today.values();//values() : 열거 객체들을 배열로 만들어내는 메소드
		
		for(Week a : w) {
			System.out.println(a);
		}
		
		
	}//main
}//class
