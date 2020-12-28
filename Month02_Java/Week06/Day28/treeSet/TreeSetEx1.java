package treeSet;

import java.util.*;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(10);
		tree.add(0);
		tree.add(8);
		tree.add(7);
		tree.add(9);
		tree.add(12);
		tree.add(8);
		tree.add(-10);
		tree.add(5);
		tree.add(0);
		//int[] a = {10,0,8,7,9,12,8,-10,5,0};
		//for (int i = 0; i < a.length; i++) {
		//	tree.add(a[i]);
		//}
		System.out.println(tree);//�ڵ����� �������� ������ �о �������� ������ �Ǽ� ���´�.
		
		/*
		//�������� �ڷ��� Set�ȿ� �ֱ�
		//= ������ ����. Ÿ���� �� �ٸ��� ������ 
		Set<Object> t = new TreeSet<>();
		t.add("a");
		t.add('b');
		t.add('a');
		t.add(100);
		t.add(1.1);
		t.add(true);
		for(Object o:t) {
			System.out.println(o);
		}
		*/
		
		//�������� �빮�� �ҹ���
		TreeSet<String> s = new TreeSet<String>();
		s.add("D");
		s.add("w");
		s.add("e");
		s.add("!!");
		s.add("H");
		s.add("r");
		s.add("1");
		s.add("��");
		s.add("a");
		s.add("E");
		System.out.println(s);
		//�����ڵ� ������� ���ĵǾ� ���
		//Ư������ -> ���� -> �빮�� -> �ҹ��� -> �ѱ�
		System.out.println(s.subSet("a", "d"));
		//a���� d������ �ڷᰡ ���
		System.out.println(s.subSet("a",true, "��",true));
		System.out.println(s.subSet("a",false, "��",false));
		
		
		
	}
}
