package intStream;

import java.util.stream.IntStream;

public class IntStreamEx {
	static int sum=0;
	public static void main(String[] args) {
		IntStream i = IntStream.range(1, 100);//100은 포함되지 않음
		i.forEach(a->sum+=a);
		System.out.println(sum);
		
		sum=0;
		
		IntStream ii = IntStream.rangeClosed(1, 100);//100까지 포함
		ii.forEach(a->sum+=a);
		System.out.println(sum);
		
		
	}
}
