package p1;

public class MemeberServiceExample {
	public static void main(String[] args) {
		Member m = new Member("java","12345");
		MemeberService ms = new MemeberService();
		boolean result = ms.login("java", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			ms.logout("java");
		}else {
			System.out.println("�α��� ����");
		}
	}
}
