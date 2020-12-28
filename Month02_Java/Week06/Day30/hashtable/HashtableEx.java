package hashtable;
//로그인
import java.util.*;

public class HashtableEx {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("ID와 PW를 입력하세요");
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			if(map.containsKey(id)) {//map에 id가 있나요?
				if(map.get(id).equals(pw)) {//map에 있는 id의 value와 입력한 값이 같나요?
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("PW가 틀렸습니다.");
					continue;
				}
			}else {
				System.out.println("없는 ID입니다.");
				continue;
			}
		}
		
		
	}
}
