package andOrNegate;

import java.util.function.Predicate;

public class PredicateIsEqualsEx {
	public static void main(String[] args) {
		Predicate<String> predicate;
		
		//isEqual�� ���� �޼ҵ�� Ÿ������ ����
		predicate = Predicate.isEqual(null);
		System.out.println(predicate);
		System.out.println(predicate.test(null));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println(predicate.test("Java8"));
	}
}
