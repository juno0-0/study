package sortEx;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		int[] scores = {99,98,87,100};
		double[] avg = {4.5,1.2,100,-10.0};
		String[] stringArr = {"�����","���","�ڼ���","Ȳ����"};
		for(int i : scores) {
			System.out.println(i);
		}
		System.out.println();
		Arrays.sort(scores);
		for(int i : scores) {
			System.out.println(i);
		}
		System.out.println();
		Arrays.sort(avg);
		Arrays.sort(avg);
		for(double s : avg) {
			System.out.println(s);
		}
		System.out.println();
		Arrays.sort(stringArr);
		for(String a : stringArr) {
			System.out.println(a);
		}
		
	}
}

class Member{
	int sno;//��ȣ
	String sname;//�̸�
	String stel;//��ȭ��ȣ
}
