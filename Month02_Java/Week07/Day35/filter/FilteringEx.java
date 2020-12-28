package filter;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("ȫ�浿","ȫ�浿","�ſ��","���ڹ�","�ſ��","�Ź�ö","ȫ�浿","ȣ","�̴ٵ���");
		//�ߺ� �����ϱ�
		names.stream().distinct().forEach(n->System.out.println(n));
		System.out.println();
		//���� "��"���� ����� ���͸�
		names.stream().filter(n->n.startsWith("��")).forEach(n->System.out.println(n+"   "));
		System.out.println();
		//�̸��� ������ ���ڰ� "��"�� ����� ���͸�
		names.stream().filter(n->n.endsWith("��")).forEach(n->System.out.println(n+"   "));		
		System.out.println();
		//�̸��� ���̰� 3���ڰ� �ƴ� ����� ���͸�
		names.stream().filter(n->n.length()!=3).forEach(n->System.out.println(n+"   "));
		System.out.println();
		//�̸��� 2��° ���ڰ� "��"�� ���
		names.stream().filter(n->n.charAt(1)=='��').forEach(n->System.out.println(n+"   "));
		System.out.println();
		//�̸��� "��"�� ���� ���
		names.stream().filter(n->n.contains("��")).forEach(n->System.out.println(n+"   "));
		
		
		
	}
}
