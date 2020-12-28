package asDoubleStream_asLongStream_boxed;

import java.util.*;
import java.util.stream.IntStream;

public class asEx {
	public static void main(String[] args) {
		//int�� ������ double�� ����
		int[] intArray = {1,2,3,4,5};
		IntStream intstream = Arrays.stream(intArray);
		intstream.asDoubleStream().forEach(a->System.out.print(a+" "));
		System.out.println();
		//int�� ������ Integer ��ü�� ���� 
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
