package sort;

import java.util.*;

public class OptionalClassEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		//list = Arrays.asList(1,2,3,4,5);
		//��Ұ� ����־ NoSuchElementException �߻�
//		double avg = list.stream().mapToInt(Integer::intValue)
//				.average().getAsDouble();
		//isPresent() : ��Ұ� ������ true, ������ false
		boolean result = list.stream().mapToInt(Integer::intValue).average().isPresent();
		System.out.println(result);
		//orElse() : ��Ұ� ������ orElse()�� �Ű������� ��ü
		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);
		//ifPresent() : ���� ������ ���ٽ� ����, ������ �������� ����
		list.stream().mapToInt(Integer::intValue).average().ifPresent(s->System.out.println(s));
		//ifPresentOrElse() : ���� ������ ���ٽ� ����, �Ű������� ��ü
		list.stream().mapToInt(Integer::intValue).average().ifPresentOrElse(s->System.out.println(s),()->System.out.println(0.0));
	}
}
