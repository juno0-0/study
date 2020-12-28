package messageFormatEx;

import java.text.MessageFormat;

public class MessageFormatEx {
	public static void main(String[] args) {
		String text = "회원 ID : {0}\n회원 이름 : {1}\n회원전화 : {2}";
		String result1 = MessageFormat.format(text, "id1","홍길동","12345","111");
		System.out.println(result1);
	}
}
