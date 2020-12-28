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
				list.add(source.substring(i,i+LIMIT));//i부터 i+LIMIT전까지 잘라서 list에 넣는다.
			}else {
				list.add(source.substring(i));//i부터 나머지를 list에 넣는다.
			}
		}
		System.out.println(list.size());
		System.out.println(list);
	}
}
