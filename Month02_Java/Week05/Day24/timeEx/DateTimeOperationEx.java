package timeEx;

import java.time.LocalDateTime;

public class DateTimeOperationEx {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("���� �ð� : "+now);
		LocalDateTime targetDateTime = now.plusYears(1);//���� �⵵ +1
		targetDateTime = now.plusMonths(2);//���� �� +2
		targetDateTime = now.plusDays(3);//���� �� +3
		targetDateTime = now.plusHours(4);//���� �ð� +4
		targetDateTime = now.minusMinutes(5);//���� �� -5
		targetDateTime = now.plusSeconds(6);//���� �� +6
		LocalDateTime targetDateTime2 = now.plusYears(10)
										  .minusMonths(2)
										  .plusDays(3)
										  .plusHours(4)
										  .minusMinutes(5)
										  .plusSeconds(6);//�ѹ��� �� �� �ִ�.
		
		System.out.println(targetDateTime);
		//�ð��� �����ؼ� �����Ⱓ���� �� �� �ִ�.
		//ex) now���� 1���� �÷��� 1�ޱ��� ~�� �ض�
		
	
		
		
		
		
	}
}
