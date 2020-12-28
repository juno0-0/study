package treeMap;

import java.util.*;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		
		//TreeMap에 달아주고 출력하기만 하면 자동으로 중위오더로 검색해서 출력되므로 오름차순이 된다.
		Set<Map.Entry<Integer, String>> scm =scores.entrySet();
		for(Map.Entry<Integer, String> tmp : scm) {
			System.out.println(tmp.getValue());
		}
		
		//키값으로 내림차순 해준다. descendingMap()을 사용
		NavigableMap<Integer, String> nm = scores.descendingMap();
		Set<Map.Entry<Integer, String>> sm =nm.entrySet();
		for(Map.Entry<Integer, String> tmp : sm) {
			System.out.println(tmp.getValue());
		}
		
		//nm 변수를 통해서 오름차순으로 만들기
		//내림차순이 되있는 nm을 다시 내림차순한다.
		NavigableMap<Integer, String> nnm = nm.descendingMap();
		Set<Map.Entry<Integer, String>> ssm = nnm.entrySet();
		for(Map.Entry<Integer, String> tmp : ssm) {
			System.out.println(tmp.getValue());
		}
		
		
		
		/*
		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : "+entry.getValue()+" "+entry.getKey());
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : "+entry.getValue()+" "+entry.getKey());
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95점 아래 점수 : "+entry.getValue()+" "+entry.getKey());
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95점 위에 점수 : "+entry.getValue()+" "+entry.getKey());
		*/
	}
}
