package hashtable;
//�α���
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
			System.out.println("ID�� PW�� �Է��ϼ���");
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			if(map.containsKey(id)) {//map�� id�� �ֳ���?
				if(map.get(id).equals(pw)) {//map�� �ִ� id�� value�� �Է��� ���� ������?
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("PW�� Ʋ�Ƚ��ϴ�.");
					continue;
				}
			}else {
				System.out.println("���� ID�Դϴ�.");
				continue;
			}
		}
		
		
	}
}
