package arrayListEx;

import java.util.*;

public class ArrayLiseEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();//String�� �ְڴ�
		list.add("����");
		list.add(new String("LA"));
		//list.add(new Integer(10));//String�� �ְڴٰ� �ߴµ� ������ �־ �����߻�
		list.add("��õ");
		list.add("�λ�");
		list.add("����");
		list.add(new String("LA"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.indexOf("��õ"));
		System.out.println(list.indexOf("�λ�"));
		int index = list.indexOf("����");
		if(index==-1) {
			System.out.println("���� �ּ�");
		}else {
			System.out.println(index+"��° �ּ�");
		}
		System.out.println(list.lastIndexOf("��õ"));
		System.out.println(list.lastIndexOf("LA"));
		System.out.println(list.lastIndexOf("����"));
		
		String result = list.remove(1);
		System.out.println(result);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		boolean t = list.remove("�λ�");
		System.out.println(t);
		System.out.println(list.get(2));

		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//��ü����
		list.removeAll(list);
		System.out.println("���� ��");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}
}
