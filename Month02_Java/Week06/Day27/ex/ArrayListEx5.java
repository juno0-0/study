package ex;

import java.util.*;

public class ArrayListEx5 {
	public static void main(String[] args) {
		final int LIMIT = 10;
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();//43
		List list = new ArrayList<>(length/LIMIT);//14
		for (int i = 0; i < length; i+=LIMIT) {//i=0, 10, 20, 30, 40
			if(i+LIMIT < length) {
				list.add(source.substring(i,i+LIMIT));//i���� i+LIMIT������ �߶� list�� �ִ´�.
			}else {
				list.add(source.substring(i));//i���� �������� list�� �ִ´�.
			}
		}
		System.out.println(list.size());
		System.out.println(list);
	}
}
