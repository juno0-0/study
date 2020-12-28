package timeEx;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeOperationEx2 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 시간 : "+now);
		
		LocalDateTime tgDateTime = null;
		
		//tgDateTime = now.withYear(2024);//withYear()는 현재부터 몇년후가 아니라 그냥 2024년으로 바꾸는 것
		//tgDateTime = now.withMonth(3);
		//tgDateTime = now.withYear(2024)
		//				.withMonth(3);//동시에 사용도 가능
		//tgDateTime = now.with(TemporalAdjusters.firstDayOfYear());//1월 1일로 바꾸는 것
		//tgDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());//다음 해 1월 1일로 바꾸는 것
		//tgDateTime = now.with(TemporalAdjusters.lastDayOfYear());//12월 31일로 바꾸는 것
		//tgDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));//이번달의 첫 월요일
		//tgDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY));//이번달의 첫 수요일
		tgDateTime = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY));//지난 요일 
		
		
		System.out.println(tgDateTime);
	}
}
