package timeEx;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeOperationEx2 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("���� �ð� : "+now);
		
		LocalDateTime tgDateTime = null;
		
		//tgDateTime = now.withYear(2024);//withYear()�� ������� ����İ� �ƴ϶� �׳� 2024������ �ٲٴ� ��
		//tgDateTime = now.withMonth(3);
		//tgDateTime = now.withYear(2024)
		//				.withMonth(3);//���ÿ� ��뵵 ����
		//tgDateTime = now.with(TemporalAdjusters.firstDayOfYear());//1�� 1�Ϸ� �ٲٴ� ��
		//tgDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());//���� �� 1�� 1�Ϸ� �ٲٴ� ��
		//tgDateTime = now.with(TemporalAdjusters.lastDayOfYear());//12�� 31�Ϸ� �ٲٴ� ��
		//tgDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));//�̹����� ù ������
		//tgDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.WEDNESDAY));//�̹����� ù ������
		tgDateTime = now.with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY));//���� ���� 
		
		
		System.out.println(tgDateTime);
	}
}
