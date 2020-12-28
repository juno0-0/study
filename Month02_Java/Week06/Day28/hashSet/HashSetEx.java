package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		//추가하기
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add(null);
		//중복해서 추가하기 = 출력해도 중복은 안나옴
		hs.add("c");
		hs.add("c");
		
		//방법1 - 향상된 for문, foreach문
		System.out.println("<<foreach방식>>");
		for(String s : hs) {
			System.out.println(s);
		}
		//방법2 - iterator() 반복자
		System.out.println("<<iterator방식>>");
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		//Set 안에 있는 객체 주소의 갯수
		System.out.println("<<size>>");
		System.out.println(hs.size());
		
		//삭제하기
		System.out.println("<<remove>>");
		hs.remove("c");
		Iterator<String> iter2 = hs.iterator();
		while(iter2.hasNext()) {
			String s = iter2.next();
			System.out.println(s);
		}
		
		
		
	}
}
