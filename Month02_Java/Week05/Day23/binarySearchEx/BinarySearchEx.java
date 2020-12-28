package binarySearchEx;

import java.util.Arrays;

public class BinarySearchEx {
	public static void main(String[] args) {
		int[] scores = {99,97,98};
		String[] names = {"ȫ�浿","�ڵ���","��μ�"};
		Member m = new Member();
		Member[] arM = {new Member("123"), new Member("456"), new Member("123456")};
		Arrays.sort(arM);
		for(Member ccc : arM) {
			System.out.println(ccc);
		}
		int j = Arrays.binarySearch(arM, new Member("123456"));//arM�� MemberŬ���� �迭, ã�°��� String
		System.out.println("123456 : "+j);
		Arrays.sort(scores);
		Arrays.sort(names);
		int a = Arrays.binarySearch(scores, 99);
		int s = Arrays.binarySearch(names, "�ڵ���");
		System.out.println(a);
		System.out.println(s);
		try {
			System.out.println(scores[a]);
			System.out.println(names[s]);
		} catch (ArrayIndexOutOfBoundsException e) {}
	}
}
class Member implements Comparable<Member>{
	String tel;
	public Member() {}
	public Member(String tel) {
		this.tel=tel;
	}
	
	@Override
	public String toString() {
	
		return tel;
	}
	@Override
	public int compareTo(Member o) {
		return tel.compareTo(o.tel);
	}
	
	
}
