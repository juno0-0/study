package hashSet;

import java.util.*;

public class HashSetEx02 {
	public static void main(String[] args) {
		//�迭 �� �ֱ� - �ڷ����� �پ��� ���
		//Ÿ���� Object�� �Ѵ�.
		Object[] o = {1, 1.1, "a", 'a', true, "a", 1};
		int[] intArr = {100,90,80,70,100,40};
		String[] grade = {"����","����","�븮","����","���","�븮","���","�븮","����","����","����","�븮"};
		//LinkedHashSet
		Set hs = new LinkedHashSet();
		Set<Integer> score = new LinkedHashSet<>();
		Set<String> g = new LinkedHashSet<>();
		
		//o �迭�� �ڷḦ HashSet�� �ֱ�
		//Set hs = new HashSet();
		for(int i=0;i<o.length;i++) {
			hs.add(o[i]);
		}
		
		Iterator iter = hs.iterator();
		while(iter.hasNext()) {
			Object i = iter.next();
			System.out.println(i);
		}
		
		//Set<Integer> score = new HashSet<>();
		for(int i=0;i<intArr.length;i++) {
			score.add(intArr[i]);
		}
		
		Iterator<Integer> i = score.iterator();
		while(i.hasNext()) {
			Integer temp = i.next();
			System.out.println(temp);
		}
		
		//Set<String> g = new HashSet();
		for (int j = 0; j < grade.length; j++) {
			g.add(grade[j]);
		}
		
		Iterator<String> it = g.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		
	}
}
