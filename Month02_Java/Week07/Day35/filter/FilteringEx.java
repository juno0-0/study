package filter;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동","홍길동","신용권","김자바","신용권","신민철","홍길동","호","이다도시");
		//중복 제거하기
		names.stream().distinct().forEach(n->System.out.println(n));
		System.out.println();
		//성이 "신"씨인 사람만 필터링
		names.stream().filter(n->n.startsWith("신")).forEach(n->System.out.println(n+"   "));
		System.out.println();
		//이름의 마지막 글자가 "동"인 사람만 필터링
		names.stream().filter(n->n.endsWith("동")).forEach(n->System.out.println(n+"   "));		
		System.out.println();
		//이름의 길이가 3글자가 아닌 사람만 필터링
		names.stream().filter(n->n.length()!=3).forEach(n->System.out.println(n+"   "));
		System.out.println();
		//이름의 2번째 글자가 "용"인 사람
		names.stream().filter(n->n.charAt(1)=='용').forEach(n->System.out.println(n+"   "));
		System.out.println();
		//이름에 "용"이 들어가는 사람
		names.stream().filter(n->n.contains("용")).forEach(n->System.out.println(n+"   "));
		
		
		
	}
}
