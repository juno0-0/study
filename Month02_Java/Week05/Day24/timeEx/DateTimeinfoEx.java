package timeEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeinfoEx {
	public static void main(String[] args) {
		LocalDateTime c = LocalDateTime.now();
		
		System.out.println("���� ��¥ : "+c);
		
		String date = c.getYear()+"�� ";
		date += c.getMonthValue()+"�� ";
		date += c.getDayOfMonth()+"�� ";
		date += c.getDayOfWeek()+" ";
		date += c.getHour()+"�� ";
		date += c.getMinute()+"�� ";
		date += c.getSecond()+".";
		date += c.getNano()+"��";
		System.out.println(date);
		
		LocalDate nowc = c.toLocalDate();
		System.out.println(nowc);
		if(nowc.isLeapYear()) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� ����ð� : "+utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� �ð� : "+seoulDateTime);
		ZoneId seoulZoneId = seoulDateTime.getZone();//getZone()�ϸ� ZoneId�� ��´�.
		System.out.println("���� ZoneId : "+seoulZoneId);
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();//getOffset()�ϸ� ZoneOffset�� ��´�.
		System.out.println("���� ZoneOffset : "+seoulZoneOffset);//��������ÿ� �ѱ� �ð��� ����
		
		
		
	}
}
