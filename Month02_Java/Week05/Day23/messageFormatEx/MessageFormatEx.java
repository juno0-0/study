package messageFormatEx;

import java.text.MessageFormat;

public class MessageFormatEx {
	public static void main(String[] args) {
		String text = "ȸ�� ID : {0}\nȸ�� �̸� : {1}\nȸ����ȭ : {2}";
		String result1 = MessageFormat.format(text, "id1","ȫ�浿","12345","111");
		System.out.println(result1);
	}
}
