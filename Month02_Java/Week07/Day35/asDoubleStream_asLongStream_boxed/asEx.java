package asDoubleStream_asLongStream_boxed;

import java.util.*;
import java.util.stream.IntStream;

public class asEx {
	public static void main(String[] args) {
		//int¸¦ ³ÖÀ¸¸é doubleÀÌ ³ª¿È
		int[] intArray = {1,2,3,4,5};
		IntStream intstream = Arrays.stream(intArray);
		intstream.asDoubleStream().forEach(a->System.out.print(a+" "));
		System.out.println();
		//int¸¦ ³ÖÀ¸¸é Integer °´Ã¼°¡ ³ª¿È 
		intstream = Arrays.stream(intArray);
		intstream.boxed().forEach(a->System.out.print(a.intValue()+" "));
		
	}
}

class Student{
	private String name;
	private int score;
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public final String getName() {
		return name;
	}
	public final int getScore() {
		return score;
	}
	
}
