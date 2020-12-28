package retainAll;

import java.util.*;

public class ArrayListEx4 {
	public static void main(String[] args) {
		List<Double> d1 = new ArrayList();
		d1.add(1.1);
		d1.add(2.2);
		d1.add(3.3);
		d1.add(4.4);
		d1.add(5.5);
		
		List<Double> d2 = new ArrayList();
		d2.add(1.1);
		d2.add(2.2);
		d2.add(3.3);
		
//		d1.retainAll(d2);//d1과 d2의 교집합을 제외한 값을 지운다.
//		System.out.println(d1);
		
		d1.removeAll(d2);
		System.out.println(d1);
	}
}
