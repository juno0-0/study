package iterator;

import java.util.*;
import java.util.stream.Stream;

public class ForEachEx {
	public static void main(String[] args) {
		//�ݺ���
		List<String> list = Arrays.asList("ȫ�浿","������","���ڹ�");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//Stream�� forEach()
		List<String> list2 = Arrays.asList("������","������","������");
		Stream<String> stream = list2.stream();
		list2.forEach(name->{System.out.println(name);});
		//Consumer�� ���� (�Ű������� ������ ������ ����, �ȿ��� �����ؾ� ��)
		//�迭 -> List -> Stream���� ���� ��
	}
}
