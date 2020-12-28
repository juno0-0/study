package sortEx;

import java.util.Arrays;

public class SortEx {
	public static void main(String[] args) {
		int[] scores = {99,98,87,100};
		double[] avg = {4.5,1.2,100,-10.0};
		String[] stringArr = {"김수진","김미","박수진","황수연"};
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
	int sno;//번호
	String sname;//이름
	String stel;//전화번호
}
