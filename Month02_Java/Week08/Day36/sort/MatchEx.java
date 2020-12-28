package sort;

import java.util.Arrays;

public class MatchEx {
	public static void main(String[] args) {
		int[] intArr = {2,4,6};
		boolean result;
		//���� 2�� ����� true, �ϳ��� �ƴϸ� false
		result = Arrays.stream(intArr).allMatch(a->a%2==0);
		System.out.println(result);
		//3�� ����� �ϳ��� ������ true, �ϳ��� ������ false
		result = Arrays.stream(intArr).anyMatch(a->a%3==0);
		System.out.println(result);
		//3�� ����� �ϳ��� ������ true, ������ false
		result = Arrays.stream(intArr).noneMatch(a->a%5==0);
		System.out.println(result);
		
		
	}
}
