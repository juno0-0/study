package ex3;

import java.util.*;

public class MapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> temp = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter = temp.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> mm = iter.next();
			totalScore += mm.getValue();
			if(maxScore<mm.getValue()) {
				maxScore=mm.getValue();
				name = mm.getKey();
			}
		}
		
		System.out.println("������� : "+totalScore/map.size());
		System.out.println("�ְ����� : "+maxScore);
		System.out.println("�ְ������� ���� ���̵� : "+name);
		
	}
}
