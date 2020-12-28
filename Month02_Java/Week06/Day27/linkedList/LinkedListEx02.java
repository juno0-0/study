package linkedList;

import java.util.*;


public class LinkedListEx02 {
	public static void main(String[] args) {
		List<String> list = new LinkedList();
		list.add("b");
		list.add(0,"a");
		list.add("c");
		list.add("d");
		list.add("a");
		list.add(null);
		
		LinkedList link = (LinkedList)list;
		link.push("��");
		link.addFirst("First");
		link.addLast("Last");
		System.out.println();
		System.out.println(link.pop());
		System.out.println();
		boolean off = link.offer("offer");
		System.out.println(off);
		String el = (String) link.element();//���� ó���� �ִ°� ���
		System.out.println(el);
		el = (String) link.getLast();//���� �������� �ִ°� ���
		System.out.println(el);
		el = (String) link.peek();
		System.out.println(el);
		
		el = (String) link.poll();
		System.out.println();
				
		
		
		
		Iterator<String> iter = link.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
		
		
	}
}
