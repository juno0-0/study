package stringTokenizerEx;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String text = "홍길동,이수홍//박연수";
		StringTokenizer st = new StringTokenizer(text,",|/");
		int count = st.countTokens();
		System.out.println("토큰의 갯수 : "+count);
//		for(int i=0;i<count;i++) {
//			String tokenValue = st.nextToken();
//			boolean hmt = st.hasMoreTokens();
//			System.out.println("남아 있는 토큰이 있으면 true 없으면 flase : "+hmt);
//			System.out.println(tokenValue);
//		}
		while(st.hasMoreTokens()) {
			String tokenValue = st.nextToken();
			System.out.println(tokenValue);			
			boolean a = st.hasMoreElements();
			
		}
	}
}
