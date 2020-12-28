package treeSet;

import java.util.*;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(10);
		tree.add(0);
		tree.add(8);
		tree.add(7);
		tree.add(9);
		tree.add(12);
		tree.add(8);
		tree.add(-10);
		tree.add(5);
		tree.add(0);
		//int[] a = {10,0,8,7,9,12,8,-10,5,0};
		//for (int i = 0; i < a.length; i++) {
		//	tree.add(a[i]);
		//}
		System.out.println(tree);//자동으로 중위오더 순서로 읽어서 오름차순 정렬이 되서 나온다.
		
		/*
		//여러가지 자료형 Set안에 넣기
		//= 오류가 난다. 타입이 다 다르기 때문에 
		Set<Object> t = new TreeSet<>();
		t.add("a");
		t.add('b');
		t.add('a');
		t.add(100);
		t.add(1.1);
		t.add(true);
		for(Object o:t) {
			System.out.println(o);
		}
		*/
		
		//문자형만 대문자 소문자
		TreeSet<String> s = new TreeSet<String>();
		s.add("D");
		s.add("w");
		s.add("e");
		s.add("!!");
		s.add("H");
		s.add("r");
		s.add("1");
		s.add("ㄱ");
		s.add("a");
		s.add("E");
		System.out.println(s);
		//유니코드 순서대로 정렬되어 출력
		//특수문자 -> 숫자 -> 대문자 -> 소문자 -> 한글
		System.out.println(s.subSet("a", "d"));
		//a부터 d사이의 자료가 출력
		System.out.println(s.subSet("a",true, "ㄱ",true));
		System.out.println(s.subSet("a",false, "ㄱ",false));
		
		
		
	}
}
