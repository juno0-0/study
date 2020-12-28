package p1;

import java.util.Calendar;

public class EnumEx01 {
	public static void main(String[] args) {
		//today(��������)�� ������ Week�� ������ش�.
		Week today = null;
		Week reservationDay = null;
		
		Calendar cal = Calendar.getInstance();//CalendarŬ������ ����ϰ� �޸𸮿� �ø�
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);//�Ͽ��Ϻ��� ����(1~7)
//		int week1 = cal.get(Calendar.DATE);
//		System.out.println(week1);//���� ��¥
//		int week2 = cal.get(Calendar.DAY_OF_MONTH);
//		System.out.println(week2);//�Ѵ޿��� ���� ��¥
		
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
		
		System.out.println("���� ���� : "+today);
		String name = today.name();//name() : ���� ��ü�� ���ڿ��� ����
		System.out.println(name);
		today = Week.FRIDAY;
		int ord = today.ordinal();//ordinal() : ���� ��ü�� ������ ����
		System.out.println(ord);//Week�� ������ ����
		int com = today.compareTo(Week.MONDAY);//compareTo(Week.SUNDAY) : FRIDAY�� SUNDAY�� �� -2
		if(com==0)System.out.println("���� ��");
		else if(com<0)System.out.println("�� ��");
		else System.out.println("�տ� ��");
		System.out.println(com);		//FRIDAY�� FRIDAY�� �� 0, FRIDAY�� SATURDAY�� �� -1, FRIDAY�� MONDAY �� 4
		
		Week newToday = today.valueOf("TUESDAY");//valueOf() : String�� ������ Week Ÿ���� ���´�.(���� ���� WeekŸ������ �޴´�)
		String n = newToday.name();
		System.out.println(n);
		
		Week[] w = today.values();//values() : ���� ��ü���� �迭�� ������ �޼ҵ�
		
		for(Week a : w) {
			System.out.println(a);
		}
		
		
	}//main
}//class
