package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		//�߰��ϱ�
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add(null);
		//�ߺ��ؼ� �߰��ϱ� = ����ص� �ߺ��� �ȳ���
		hs.add("c");
		hs.add("c");
		
		//���1 - ���� for��, foreach��
		System.out.println("<<foreach���>>");
		for(String s : hs) {
			System.out.println(s);
		}
		//���2 - iterator() �ݺ���
		System.out.println("<<iterator���>>");
		Iterator<String> iter = hs.iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		
		//Set �ȿ� �ִ� ��ü �ּ��� ����
		System.out.println("<<size>>");
		System.out.println(hs.size());
		
		//�����ϱ�
		System.out.println("<<remove>>");
		hs.remove("c");
		Iterator<String> iter2 = hs.iterator();
		while(iter2.hasNext()) {
			String s = iter2.next();
			System.out.println(s);
		}
		
		
		
	}
}
