package sort;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * ���� : ��� ��ü�� �ݺ��ϴ� ��
 * �߰� ó�� : peek()
 * ���� ó�� : forEach()
 */
public class LoopingEx {
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		IntStream intstream = Arrays.stream(intArr).filter(a->a%2==0)
		//��������� �ϸ� ���� ó���� ��� �������� ����
		.peek(a->System.out.println(a));//�߰� ó��
		//.forEach(System.out::println);//���� ó��
		
		//���� ó���� �߰��ϸ� peek()�� �����Ѵ�.
		//int s = intstream.sum();//���� ó��
		//System.out.println("�հ� : "+s);
		
		//����ó���� ������ �ϰ� �ؿ��� �ٽ� �ϸ� �̹� stream�� ����Ͽ��� ������ 
		//IllegalStateException �߻�
		double avg = intstream.average().getAsDouble();//���� ó��
		System.out.println("��� : "+avg);
	}
}
