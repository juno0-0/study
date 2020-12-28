package addAllContainsAll;

import java.util.*;

public class ArrayListEx3 {
	public static void main(String[] args) {
		List<Double> d3 = new ArrayList<Double>();
		//Double클래스를 상속
		d3.add(6.6);
		d3.add(7.7);
		d3.add(8.8);
		d3.add(9.9);
		
		List<Double> d4 = new ArrayList<Double>();
		d4.add(6.6);
		d4.add(7.7);
		d4.add(8.8);
		
//		d1.addAll(d2);
//		System.out.println(d1);
//		d1.add(9.9);
//		System.out.println(d1);
//		
		System.out.println(d3.containsAll(d4));
		
	}
}
