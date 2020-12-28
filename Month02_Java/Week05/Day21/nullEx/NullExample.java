package nullEx;

import java.util.Objects;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		System.out.println(Objects.isNull(str1));//null입니까?
		System.out.println(Objects.isNull(str2));
		System.out.println(Objects.nonNull(str1));//null이 아닙니까?
		System.out.println(Objects.nonNull(str2));
		System.out.println(Objects.requireNonNull(str1));//null이면 NullPointerException발생
		//System.out.println(Objects.requireNonNull(str2));//null이 아니면 출력
		try {
			System.out.println(Objects.requireNonNull(str2,"널이다"));
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));//null이면 null이 출력
		System.out.println(Objects.toString(str2,"기본값~~"));//null이면 null대신에 뒤에 ""가 출력
		
		
	}
}
