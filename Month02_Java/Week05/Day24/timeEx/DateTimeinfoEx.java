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
		
		System.out.println("현재 날짜 : "+c);
		
		String date = c.getYear()+"년 ";
		date += c.getMonthValue()+"월 ";
		date += c.getDayOfMonth()+"일 ";
		date += c.getDayOfWeek()+" ";
		date += c.getHour()+"시 ";
		date += c.getMinute()+"분 ";
		date += c.getSecond()+".";
		date += c.getNano()+"초";
		System.out.println(date);
		
		LocalDate nowc = c.toLocalDate();
		System.out.println(nowc);
		if(nowc.isLeapYear()) {
			System.out.println("윤");
		}else {
			System.out.println("평");
		}
		
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정 세계시간 : "+utcDateTime);
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울 시간 : "+seoulDateTime);
		ZoneId seoulZoneId = seoulDateTime.getZone();//getZone()하면 ZoneId를 얻는다.
		System.out.println("서울 ZoneId : "+seoulZoneId);
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();//getOffset()하면 ZoneOffset를 얻는다.
		System.out.println("서울 ZoneOffset : "+seoulZoneOffset);//협정세계시와 한국 시간의 차이
		
		
		
	}
}
