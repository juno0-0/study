package arrayListEx;

import java.util.*;

public class ArrayLiseEx2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList();//String만 넣겠다
		list.add("서울");
		list.add(new String("LA"));
		//list.add(new Integer(10));//String을 넣겠다고 했는데 정수를 넣어서 오류발생
		list.add("인천");
		list.add("부산");
		list.add("서울");
		list.add(new String("LA"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.indexOf("인천"));
		System.out.println(list.indexOf("부산"));
		int index = list.indexOf("대전");
		if(index==-1) {
			System.out.println("없는 주소");
		}else {
			System.out.println(index+"번째 주소");
		}
		System.out.println(list.lastIndexOf("인천"));
		System.out.println(list.lastIndexOf("LA"));
		System.out.println(list.lastIndexOf("서울"));
		
		String result = list.remove(1);
		System.out.println(result);
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		boolean t = list.remove("부산");
		System.out.println(t);
		System.out.println(list.get(2));

		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//전체삭제
		list.removeAll(list);
		System.out.println("삭제 후");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
		
	}
}
