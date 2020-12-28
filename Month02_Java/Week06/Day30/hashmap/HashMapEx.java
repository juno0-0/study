package hashmap;
//빈도수 구하기
import java.util.*;

public class HashMapEx {
	public static void main(String[] args) {
		String[] data = {"A","K","A","K","D","A","K","K","K","Z","D"};
		Map map = new HashMap();
		for (int i = 0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				map.put(data[i], new Integer(value.intValue()+1));
			}else {
				map.put(data[i], new Integer(1));
			}
		}
		//전체 출력하기
		Set<Map.Entry<String[], Integer>> s = map.entrySet();
		Iterator<Map.Entry<String[], Integer>> iter = s.iterator();
		while(iter.hasNext()) {
			Map.Entry<String[], Integer> tmp = iter.next();
			int value = ((Integer)tmp.getValue()).intValue();
			System.out.println(tmp.getKey()+":"+printBar('#',value)+" "+value);
		}
		
	}
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		for(int i=0;i<bar.length;i++) {
			bar[i]=ch;
		}
		return new String(bar);
	}
}
