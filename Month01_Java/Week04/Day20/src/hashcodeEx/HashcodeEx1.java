package hashcodeEx;

public class HashcodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//String이 Override해서 만들어낸 해쉬코드를 보는 것
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		//Object가 만들어낸 해쉬코드를 보는 것
	}
}
