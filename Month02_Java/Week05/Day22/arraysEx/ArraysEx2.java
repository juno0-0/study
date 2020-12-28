package arraysEx;

import java.util.Arrays;

public class ArraysEx2 {
	public static void main(String[] args) {
		int[][] original = {{1,2},{3,4}};
		System.out.println("얕은 복제");
		//주소를 공유하고 있음
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		//참조변수가 비교되는 것
		System.out.println("배열 번지 비교 : "+original.equals(cloned1));
		//주소 비교
		System.out.println("1차원 배열 항목 값 비교 : "+Arrays.equals(original, cloned1));
		//값을 비교
		System.out.println("중첩 배열 항목 값 비교 : "+Arrays.deepEquals(original, cloned1));
		
		System.out.println("깊은 복제");
		//새로운 힙영역의 주소를 만들어준 것
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0]=Arrays.copyOf(original[0], original[0].length);
		cloned2[1]=Arrays.copyOf(original[1], original[1].length);
		//참조변수가 비교되는 것, 주소가 비교
		System.out.println("배열 번지 비교 : "+original.equals(cloned2));
		//해당하는 번지에 들어있는 값이 같은지
		System.out.println("1차원 배열 항목 값 비교 : "+Arrays.equals(original, cloned2));
		//값을 비교
		System.out.println("중첩 배열 항목 값 비교 : "+Arrays.deepEquals(original, cloned2));
	}
}
