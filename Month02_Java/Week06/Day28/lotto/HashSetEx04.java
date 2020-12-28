package lotto;

import java.util.*;

//�ζ� ��ȣ �ڵ����� ������ �ϱ�
public class HashSetEx04 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<Integer>();//random���� ���� ������� ������ �ϱ�
		for (int i = 0; set.size() < 6; i++) {
			int lotto = (int)(Math.random()*45+1);//1~45
			System.out.println(lotto+"��");
			set.add(lotto);
			
		}
		
		for(int lo : set) {
			System.out.println(lo);
		}
		//set -> list�� �ٲٱ�
		List<Integer> list = new LinkedList<Integer>(set);
		//List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		for(Integer i : list) {
			System.out.println(i);
		}
		//list -> set���� �ٲٱ�
		Set<Integer> set1 = new HashSet<Integer>(list);
		
		
		
	}
}
