package hashcodeEx;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "ȫ�浿");//HashMap�̶�� ���� �ȿ� �ڷḦ �ֱ�
				  //Key��� Ŭ������ ��ü����
		String value = hashMap.get(new Key(1));//Key�� ������ value�� ��µȴ�.
		System.out.println(value);
		
		
	}
}
