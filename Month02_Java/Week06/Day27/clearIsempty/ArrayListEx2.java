package clearIsempty;

import java.util.*;

public class ArrayListEx2 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(null);
		list.add(new String("ȣ��"));
		list.add(null);//ArrayList�� �ߺ� ����
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.isEmpty());//false
		list.clear();
		System.out.println("clear() ��");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.isEmpty());//true
	}
}
