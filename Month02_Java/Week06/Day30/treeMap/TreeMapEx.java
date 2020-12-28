package treeMap;

import java.util.*;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "ȫ�浿");
		scores.put(new Integer(98), "�̵���");
		scores.put(new Integer(75), "�ڱ��");
		scores.put(new Integer(95), "�ſ��");
		scores.put(new Integer(80), "���ڹ�");
		
		
		//TreeMap�� �޾��ְ� ����ϱ⸸ �ϸ� �ڵ����� ���������� �˻��ؼ� ��µǹǷ� ���������� �ȴ�.
		Set<Map.Entry<Integer, String>> scm =scores.entrySet();
		for(Map.Entry<Integer, String> tmp : scm) {
			System.out.println(tmp.getValue());
		}
		
		//Ű������ �������� ���ش�. descendingMap()�� ���
		NavigableMap<Integer, String> nm = scores.descendingMap();
		Set<Map.Entry<Integer, String>> sm =nm.entrySet();
		for(Map.Entry<Integer, String> tmp : sm) {
			System.out.println(tmp.getValue());
		}
		
		//nm ������ ���ؼ� ������������ �����
		//���������� ���ִ� nm�� �ٽ� ���������Ѵ�.
		NavigableMap<Integer, String> nnm = nm.descendingMap();
		Set<Map.Entry<Integer, String>> ssm = nnm.entrySet();
		for(Map.Entry<Integer, String> tmp : ssm) {
			System.out.println(tmp.getValue());
		}
		
		
		
		/*
		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		System.out.println("���� ���� ���� : "+entry.getValue()+" "+entry.getKey());
		entry = scores.lastEntry();
		System.out.println("���� ���� ���� : "+entry.getValue()+" "+entry.getKey());
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95�� �Ʒ� ���� : "+entry.getValue()+" "+entry.getKey());
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95�� ���� ���� : "+entry.getValue()+" "+entry.getKey());
		*/
	}
}
