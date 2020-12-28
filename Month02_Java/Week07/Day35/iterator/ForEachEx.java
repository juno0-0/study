package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ForEachEx {

	public static void main(String[] args) {
		//�ݺ���
		List<String> list = Arrays.asList("ȫ�浿","������","���ڹ�");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("----- ��Ʈ�� ����ó�� -----");
		//Stream�� forEach()
		List<String> list2 = Arrays.asList("������","������","������");
		Stream<String> stream = list2.stream();
		list2.forEach(name->{System.out.println(name);});
		//Consumer�� ���� (�Ű������� ������ ������ ����, �ȿ��� �����ؾ� ��)
		//�迭 -> List -> Stream���� ���� ��
		System.out.println("----- ��Ʈ�� ����ó�� -----");
		Stream<String> parallelStream2 = list2.parallelStream();
		parallelStream2.forEach(t->System.out.println(t));
		//parallelStream() : ����ó���� �Ǵ� ��
	}

}
