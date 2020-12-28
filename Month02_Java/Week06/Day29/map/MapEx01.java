package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class MapEx01 {
	public static void main(String[] args) {
		//�ؽø� ��ü ����
		Map<String, Integer> map = new HashMap<>();
		//��ü�� ���� �ֱ�
		map.put("ȫ�浿", 100);
		map.put("��浿", 80);
		map.put("�ڱ浿", 90);
		map.put("�̱浿", 90);
		map.put("�ֱ浿", 100);
		map.put("ȫ�浿", 80);
		map.put("ȫ�浿", 70);
		map.put("ȫ�浿", 100);
		System.out.println();
		Collection<Integer> ssss = map.values();
		Iterator iiter = ssss.iterator();
		while(iiter.hasNext()) {
			System.out.println(iiter.next());
		}
		System.out.println();
		
		//��ü ����ϱ� 1�� get()
		int score = map.get("ȫ�浿");
		System.out.println(score);
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(23, "������");
		map2.put(20, "������");
		System.out.println(map2.get(23));

		Map<Integer, Double> map3 = new HashMap<Integer, Double>();
		map3.put(1, 3.14);
		map3.put(2, 6.28);
		map3.put(3, 9.42);
		System.out.println(map3.get(1));
		
		//��ü ��� - ��� Ű�� �ݺ������� �ִ´�.
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
