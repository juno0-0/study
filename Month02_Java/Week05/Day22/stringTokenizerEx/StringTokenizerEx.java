package stringTokenizerEx;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String text = "ȫ�浿,�̼�ȫ//�ڿ���";
		StringTokenizer st = new StringTokenizer(text,",|/");
		int count = st.countTokens();
		System.out.println("��ū�� ���� : "+count);
//		for(int i=0;i<count;i++) {
//			String tokenValue = st.nextToken();
//			boolean hmt = st.hasMoreTokens();
//			System.out.println("���� �ִ� ��ū�� ������ true ������ flase : "+hmt);
//			System.out.println(tokenValue);
//		}
		while(st.hasMoreTokens()) {
			String tokenValue = st.nextToken();
			System.out.println(tokenValue);			
			boolean a = st.hasMoreElements();
			
		}
	}
}
