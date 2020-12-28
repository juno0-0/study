package randomStream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomStream {
	public static void main(String[] args) {
		IntStream is = new Random().ints(40);//Random.ints() 아님
		is.forEach(a->System.out.println(a));
		
		System.out.println();
		
		LongStream ls = new Random().longs(10);
		ls.forEach(a->System.out.println(a));
		
		System.out.println();
		
		DoubleStream ds = new Random().doubles(3);//매개변수를 주면 매개변수의 수만큼 반복
		ds.forEach(a->System.out.println(a));
	}
}
