package collections;


import java.util.*;


public class CollectionsEx{
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("��ö��");
		list.add("�迵��");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		Collections.sort(list);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(new Integer(100));
		set.add(new Integer(78));
		set.add(new Integer(89));
		//��ü ����ϱ�
		for(int i : set) {
			System.out.println(i+" ");
		}
		System.out.println();
		List<Integer> l = new ArrayList<Integer>(set);
		Collections.sort(l);
		for(int i: l) {
			System.out.println(i+" ");
		}
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 100);
		map.put(2, 78);
		map.put(3, 89);
		//map -> list��
		Set<Map.Entry<Integer, Integer>> tmp = map.entrySet();
		
		List<Integer> ll = new ArrayList(tmp);
		Collections.sort(ll);
		for(int i:ll) {
			System.out.println(i+" ");
		}
		
		
		
		
		
	}
}
