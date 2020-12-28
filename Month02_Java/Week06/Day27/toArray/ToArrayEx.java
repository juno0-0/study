package toArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("�����");
		list.add("����");
		list.add("�����");
		list.add("������");
		list.add("�����");
		
		
		//ArrayList -> �迭
		String[] name = list.toArray(new String[list.size()]);
		for(String s : name) {
			System.out.println(s);
		}
		
		//�迭 -> ArrayList
		String[] test = {"1","2","3"};
		List<String> a = Arrays.asList(test);
		a.set(2, "4");
		System.out.println(a.get(2));
		
//		List l = new ArrayList(Arrays.asList(test));
//		l.add("4");
//		System.out.println(l.get(1));
		
		
		
		
	}
}
