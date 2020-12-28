package arrStream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

//�迭�� �������� ��Ʈ�� ���
public class FromArrayEx {
	public static void main(String[] args) {
		//1�ܰ� �迭 �����
		String[] strArray = {"ȫ�浿", "�ſ��", "��̳�"};
		//2�ܰ� �������� ��Ʈ�� ���
		//Stream<String> strStream = Arrays.stream(strArray);
		Stream<String> strStream = Stream.of(strArray);
		
		//3�ܰ� ���� ��Ʈ�� ����ϱ�
		strStream.forEach(a->System.out.println(a));
		//strStream.forEach(a->System.out.println(a));
		//���� ��Ʈ���� 2�� �����ϸ� ��Ÿ�ӿ��� �߻�
		//�̹� ù��° ���� ��Ʈ������ ������ �ִ� ���� ��� �����߱� ������
		//�ι�° ���� ��Ʈ������ ������ �ִ°� ���� �����̴�.
		
		double[] doubleArray = {1.1,2.2,3.3};
		//DoubleStream doubleStream = Arrays.stream(doubleArray);
		Stream<double[]> dd = Stream.of(doubleArray);
		dd.forEach(a->System.out.println(a));
		
	}
}
