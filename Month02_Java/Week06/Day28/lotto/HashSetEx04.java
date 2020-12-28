package lotto;

import java.util.*;

//로또 번호 자동으로 나오게 하기
public class HashSetEx04 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();//random으로 나온 순서대로 나오게 하기
		for (int i = 0; set.size() < 6; i++) {
			int lotto = (int)(Math.random()*45+1);//1~45
			System.out.println(lotto+"번");
			set.add(lotto);
			
		}
		
		for(int lo : set) {
			System.out.println(lo);
		}
		//set -> list로 바꾸기
		List<Integer> list = new LinkedList<Integer>(set);
		//List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		for(Integer i : list) {
			System.out.println(i);
		}
		//list -> set으로 바꾸기
		Set<Integer> set1 = new HashSet<Integer>(list);
		
		
		
	}
}
