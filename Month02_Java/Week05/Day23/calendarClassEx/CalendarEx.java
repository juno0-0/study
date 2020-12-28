package calendarClassEx;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {
	public static void main(String[] args) {
		String[] avaiableDs = TimeZone.getAvailableIDs();
		for(String id : avaiableDs) {
			System.out.println(id);
		}
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		year = cal.get(9);
		//get(1)은 public static final int YEAR = 1;
		//get(2)는 public static final int MONTH = 2;
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month+1);//월은 0부터 출력되기 때문에 +1
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);//일요일 = 1, 월요일 = 2, ... , 토요일 = 7
		System.out.println(Calendar.MONDAY);//2
		System.out.println(Calendar.WEDNESDAY);//4
		if(week==Calendar.WEDNESDAY) {
			System.out.println("수요일");
		}else {
			System.out.println("수요일이 아닙니다.");
		}
		int ampm = cal.get(Calendar.AM_PM);
		System.out.println(ampm);
		System.out.println(Calendar.AM_PM);
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		//오전인가 오후인가를 나타내는 프로그램 작성
		if(Calendar.AM == cal.get(Calendar.AM_PM))
			System.out.println("오전입니다.");
		else
			System.out.println("오후입니다.");
		
		int h = cal.get(Calendar.HOUR);
		System.out.println(h);
		int m = cal.get(Calendar.MINUTE);
		System.out.println(m);
		int s = cal.get(Calendar.SECOND);
		System.out.println(s);
		System.out.println(h+"시 "+m+"분 "+s+"초");
	}
}
