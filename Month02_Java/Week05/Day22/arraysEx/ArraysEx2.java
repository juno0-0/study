package arraysEx;

import java.util.Arrays;

public class ArraysEx2 {
	public static void main(String[] args) {
		int[][] original = {{1,2},{3,4}};
		System.out.println("���� ����");
		//�ּҸ� �����ϰ� ����
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		//���������� �񱳵Ǵ� ��
		System.out.println("�迭 ���� �� : "+original.equals(cloned1));
		//�ּ� ��
		System.out.println("1���� �迭 �׸� �� �� : "+Arrays.equals(original, cloned1));
		//���� ��
		System.out.println("��ø �迭 �׸� �� �� : "+Arrays.deepEquals(original, cloned1));
		
		System.out.println("���� ����");
		//���ο� �������� �ּҸ� ������� ��
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0]=Arrays.copyOf(original[0], original[0].length);
		cloned2[1]=Arrays.copyOf(original[1], original[1].length);
		//���������� �񱳵Ǵ� ��, �ּҰ� ��
		System.out.println("�迭 ���� �� : "+original.equals(cloned2));
		//�ش��ϴ� ������ ����ִ� ���� ������
		System.out.println("1���� �迭 �׸� �� �� : "+Arrays.equals(original, cloned2));
		//���� ��
		System.out.println("��ø �迭 �׸� �� �� : "+Arrays.deepEquals(original, cloned2));
	}
}
