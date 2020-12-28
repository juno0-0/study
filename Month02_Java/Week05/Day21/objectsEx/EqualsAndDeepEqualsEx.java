package objectsEx;

import java.util.Objects;

public class EqualsAndDeepEqualsEx {
	public static void main(String[] args) {
		Integer o1 = 1000;//Integer�� ������ Ŭ����
		Integer o2 = 1000;
		Integer o3 = new Integer(1000);
		System.out.println(o1);
		System.out.println(o3.toString());
		System.out.println(o1.equals(o2));//���⼭ equals()�� Object�� �޼ҵ�
		System.out.println(o1.equals(null));
		//System.out.println(null.equals(o2));
		//System.out.println(null.equals(null));
		System.out.println("==========");
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		
		//deepEquals�� �迭�� �� ��Ҹ� ���ϴ� ��
		Integer[] arr1 = {1,3};
		Integer[] arr2 = {1,2};
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
		
		
		
	}
}
