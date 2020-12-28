package hashSet;

import java.util.*;

public class HashSetEx02 {
	public static void main(String[] args) {
		//배열 값 넣기 - 자료형이 다양할 경우
		//타입을 Object로 한다.
		Object[] o = {1, 1.1, "a", 'a', true, "a", 1};
		int[] intArr = {100,90,80,70,100,40};
		String[] grade = {"사장","과장","대리","팀장","사원","대리","사원","대리","팀장","차장","과장","대리"};
		//LinkedHashSet
		Set hs = new LinkedHashSet();
		Set<Integer> score = new LinkedHashSet<>();
		Set<String> g = new LinkedHashSet<>();
		
		//o 배열의 자료를 HashSet에 넣기
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
