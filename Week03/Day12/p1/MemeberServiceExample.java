package p1;

public class MemeberServiceExample {
	public static void main(String[] args) {
		Member m = new Member("java","12345");
		MemeberService ms = new MemeberService();
		boolean result = ms.login("java", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			ms.logout("java");
		}else {
			System.out.println("로그인 실패");
		}
	}
}
