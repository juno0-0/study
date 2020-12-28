package objectsEx;

import java.util.Objects;

public class EqualsAndDeepEqualsEx {
	public static void main(String[] args) {
		Integer o1 = 1000;//Integer는 정수형 클래스
		Integer o2 = 1000;
		Integer o3 = new Integer(1000);
		System.out.println(o1);
		System.out.println(o3.toString());
		System.out.println(o1.equals(o2));//여기서 equals()는 Object의 메소드
		System.out.println(o1.equals(null));
		//System.out.println(null.equals(o2));
		//System.out.println(null.equals(null));
		System.out.println("==========");
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		
		//deepEquals는 배열의 각 요소를 비교하는 것
		Integer[] arr1 = {1,3};
		Integer[] arr2 = {1,2};
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
		
		
		
	}
}
