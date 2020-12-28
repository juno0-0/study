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
		//get(1)�� public static final int YEAR = 1;
		//get(2)�� public static final int MONTH = 2;
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month+1);//���� 0���� ��µǱ� ������ +1
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);//�Ͽ��� = 1, ������ = 2, ... , ����� = 7
		System.out.println(Calendar.MONDAY);//2
		System.out.println(Calendar.WEDNESDAY);//4
		if(week==Calendar.WEDNESDAY) {
			System.out.println("������");
		}else {
			System.out.println("�������� �ƴմϴ�.");
		}
		int ampm = cal.get(Calendar.AM_PM);
		System.out.println(ampm);
		System.out.println(Calendar.AM_PM);
		System.out.println(Calendar.AM);
		System.out.println(Calendar.PM);
		//�����ΰ� �����ΰ��� ��Ÿ���� ���α׷� �ۼ�
		if(Calendar.AM == cal.get(Calendar.AM_PM))
			System.out.println("�����Դϴ�.");
		else
			System.out.println("�����Դϴ�.");
		
		int h = cal.get(Calendar.HOUR);
		System.out.println(h);
		int m = cal.get(Calendar.MINUTE);
		System.out.println(m);
		int s = cal.get(Calendar.SECOND);
		System.out.println(s);
		System.out.println(h+"�� "+m+"�� "+s+"��");
	}
}
