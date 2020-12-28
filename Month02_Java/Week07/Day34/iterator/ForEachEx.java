package iterator;

import java.util.*;
import java.util.stream.Stream;

public class ForEachEx {
	public static void main(String[] args) {
		//반복자
		List<String> list = Arrays.asList("홍길동","정현희","김자바");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//Stream의 forEach()
		List<String> list2 = Arrays.asList("아이유","조유리","김태희");
		Stream<String> stream = list2.stream();
		list2.forEach(name->{System.out.println(name);});
		//Consumer의 구조 (매개변수가 들어가지만 리턴이 없음, 안에서 수행해야 함)
		//배열 -> List -> Stream으로 만든 것
	}
}
