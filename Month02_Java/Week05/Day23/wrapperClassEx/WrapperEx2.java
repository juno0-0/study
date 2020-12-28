package wrapperClassEx;

public class WrapperEx2 {
	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "1234";
		String s3 = "123-435";
		String s4 = "10.45";
		String s5 = "1231231245";
		//문자열 --> 숫자
		int i = Integer.parseInt(s2);
		double d = Double.parseDouble(s4);
		long l = Long.parseLong(s5);
		
		int i1 = 100;
		double d1 = 10.5;
		boolean b1 = true;
		char c1 = 'a';
		byte by1 = 1;
		
		String ii1 = i1+"";
		String si1 = Integer.toString(i1);//기본형을 String으로 만들어주는 것 toString()
		String sdi1 = Double.toString(d1);
		System.out.println(si1 + sdi1);
	}
}
