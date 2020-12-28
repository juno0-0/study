package stringbuilder;

public class StringBuilderEx {
	public static void main(String[] args) {
		String str = "";
		for(int i=1;i<=100;i++) {
			str+=i;
		}
		System.out.println(str);
		StringBuilder str1 = new StringBuilder();
		for(int i=1;i<=100;i++) {
			str1.append(i);
		}
		String st = str1.toString();
		System.out.println(st);
		System.out.println(str);
	}
}
