package sort;

import java.util.Arrays;

public class MatchEx {
	public static void main(String[] args) {
		int[] intArr = {2,4,6};
		boolean result;
		//전부 2의 배수면 true, 하나라도 아니면 false
		result = Arrays.stream(intArr).allMatch(a->a%2==0);
		System.out.println(result);
		//3의 배수가 하나라도 있으면 true, 하나도 없으면 false
		result = Arrays.stream(intArr).anyMatch(a->a%3==0);
		System.out.println(result);
		//3의 배수가 하나도 없으면 true, 있으면 false
		result = Arrays.stream(intArr).noneMatch(a->a%5==0);
		System.out.println(result);
		
		
	}
}
