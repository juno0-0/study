package hashcodeEx;

public class HashcodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//String�� Override�ؼ� ���� �ؽ��ڵ带 ���� ��
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//Object�� ���� �ؽ��ڵ带 ���� ��
	}
}
