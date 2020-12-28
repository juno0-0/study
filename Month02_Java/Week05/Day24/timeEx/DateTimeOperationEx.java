package timeEx;

import java.time.LocalDateTime;

public class DateTimeOperationEx {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재 시간 : "+now);
		LocalDateTime targetDateTime = now.plusYears(1);//현재 년도 +1
		targetDateTime = now.plusMonths(2);//현재 월 +2
		targetDateTime = now.plusDays(3);//현재 일 +3
		targetDateTime = now.plusHours(4);//현재 시간 +4
		targetDateTime = now.minusMinutes(5);//현재 분 -5
		targetDateTime = now.plusSeconds(6);//현재 초 +6
		LocalDateTime targetDateTime2 = now.plusYears(10)
										  .minusMonths(2)
										  .plusDays(3)
										  .plusHours(4)
										  .minusMinutes(5)
										  .plusSeconds(6);//한번에 쓸 수 있다.
		
		System.out.println(targetDateTime);
		//시간을 조작해서 마감기간으로 쓸 수 있다.
		//ex) now에서 1달을 늘려서 1달까지 ~를 해라
		
	
		
		
		
		
	}
}
