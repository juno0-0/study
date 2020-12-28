package timeEx;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateEx {
	public static void main(String[] args) throws InterruptedException {
		LocalDate ld = LocalDate.now();
		System.out.println("���� ��¥ : "+ld);
		LocalDate ld2 = LocalDate.of(2200, 12, 25);
		System.out.println("�Է��� ��¥ : "+ld2);
		LocalTime lt = LocalTime.now();
		System.out.println("���� �ð� : "+lt);
		LocalTime lt2 = LocalTime.of(14, 30, 25);
		System.out.println("�Է��� �ð� : "+lt2);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		LocalDateTime ldt2 = LocalDateTime.of(2200, 12, 25, 12, 20, 30, 213125);
		System.out.println(ldt2);
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("UTC"));//���� ���� �ð�
		System.out.println(zdt);
		ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("America/New_York"));//���� �ð�
		System.out.println(zdt2);
		Instant i = Instant.now();
		Thread.sleep(10);
		Instant i2 = Instant.now();
		if(i.isBefore(i2)) {
			System.out.println("����");
		}else if(i.isAfter(i2)) {
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		System.out.println("����(nanos) : "+i.until(i2, ChronoUnit.MINUTES));
		
		
		
		
		
	}
}
