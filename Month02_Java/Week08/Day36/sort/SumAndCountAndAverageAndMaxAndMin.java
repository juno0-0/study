package sort;

import java.util.Arrays;

public class SumAndCountAndAverageAndMaxAndMin {
	public static void main(String[] args) {
		int[] arrInt = {1,2,3,4,5};
		
		long count = Arrays.stream(arrInt).filter(n->n%2==0)
				.count();
		System.out.println(count);
		
		long sum = Arrays.stream(arrInt).filter(n->n%2==0)
				.sum();
		System.out.println(sum);
		
		int max = Arrays.stream(arrInt).filter(n->n%2==0)
				.max().getAsInt();
		System.out.println(max);
		
		int min = Arrays.stream(arrInt).filter(n->n%2==0)
				.min().getAsInt();
		System.out.println(min);
		
		double avg = Arrays.stream(arrInt).average().getAsDouble();
		System.out.println(avg);
		
	}
}
