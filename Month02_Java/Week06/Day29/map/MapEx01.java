package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapEx01 {
	public static void main(String[] args) {
		//해시맵 객체 생성
		Map<String, Integer> map = new HashMap<>();
		//객체에 값을 넣기
		map.put("홍길동", 100);
		map.put("김길동", 80);
		map.put("박길동", 90);
		map.put("이길동", 90);
		map.put("최길동", 100);
		map.put("홍길동", 80);
		map.put("홍길동", 70);
		map.put("홍길동", 100);
		System.out.println();
		Collection<Integer> ssss = map.values();
		Iterator iiter = ssss.iterator();
		while(iiter.hasNext()) {
			System.out.println(iiter.next());
		}
		System.out.println();
		
		//객체 출력하기 1개 get()
		int score = map.get("홍길동");
		System.out.println(score);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(23, "아이유");
		map2.put(20, "조유리");
		System.out.println(map2.get(23));

		Map<Integer, Double> map3 = new HashMap<Integer, Double>();
		map3.put(1, 3.14);
		map3.put(2, 6.28);
		map3.put(3, 9.42);
		System.out.println(map3.get(1));
		
		//전체 출력 - 모든 키를 반복적으로 넣는다.
		Set<String> s = map.keySet();
		Iterator iter = s.iterator();
		while(iter.hasNext()) {
			System.out.println(map.get(iter.next()));
		}
		System.out.println();
		for(String temp:s) {
			System.out.println(map.get(temp));
		}
		
		System.out.println(map2.size());
		
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> i = set.iterator();
		while(i.hasNext()) {
			Map.Entry<String, Integer> n = i.next();
			String key = n.getKey();
			System.out.println(key+"  "+map.get(key));
			
		}
		
		Set set1 = map2.entrySet();
		for(Object j:set1) {
			System.out.println(j);
		}
	}
}
