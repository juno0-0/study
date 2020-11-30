package hashcodeEx;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "홍길동");//HashMap이라는 상자 안에 자료를 넣기
				  //Key라는 클래스에 객체생성
		String value = hashMap.get(new Key(1));//Key를 넣으면 value가 출력된다.
		System.out.println(value);
		
		
	}
}
