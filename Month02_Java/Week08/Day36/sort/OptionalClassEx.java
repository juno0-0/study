package sort;

import java.util.*;

public class OptionalClassEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		//list = Arrays.asList(1,2,3,4,5);
		//요소가 비어있어서 NoSuchElementException 발생
//		double avg = list.stream().mapToInt(Integer::intValue)
//				.average().getAsDouble();
		//isPresent() : 요소가 있으면 true, 없으면 false
		boolean result = list.stream().mapToInt(Integer::intValue).average().isPresent();
		System.out.println(result);
		//orElse() : 요소가 없으면 orElse()의 매개값으로 대체
		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);
		//ifPresent() : 값이 있으면 람다식 실행, 없으면 실행하지 않음
		list.stream().mapToInt(Integer::intValue).average().ifPresent(s->System.out.println(s));
		//ifPresentOrElse() : 값이 있으면 람다식 실행, 매개값으로 대체
		list.stream().mapToInt(Integer::intValue).average().ifPresentOrElse(s->System.out.println(s),()->System.out.println(0.0));
	}
}
